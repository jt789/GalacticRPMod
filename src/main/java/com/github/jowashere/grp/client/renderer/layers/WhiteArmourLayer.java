package com.github.jowashere.grp.client.renderer.layers;

import com.github.jowashere.grp.Main;
import com.github.jowashere.grp.client.renderer.models.whitearmour.ModelWhiteBoots;
import com.github.jowashere.grp.client.renderer.models.whitearmour.ModelWhiteChest;
import com.github.jowashere.grp.client.renderer.models.whitearmour.ModelWhitePants;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;
import java.util.Map;

public class WhiteArmourLayer<T extends LivingEntity, M extends BipedModel<T>, A extends BipedModel<T>> extends LayerRenderer<T, M> {

    private static final ResourceLocation legsLocation = new ResourceLocation(Main.MODID, "textures/entity/layer/pants_white.png");
    private ModelWhitePants legsModel = new ModelWhitePants();

    private static final ResourceLocation bootsLocation = new ResourceLocation(Main.MODID, "textures/entity/layer/boots_white.png");
    private ModelWhiteBoots bootsModel = new ModelWhiteBoots();

    private static final ResourceLocation chestLocation = new ResourceLocation(Main.MODID, "textures/entity/layer/chest_white.png");
    private ModelWhiteChest chestModel = new ModelWhiteChest();

    private static final Map<String, ResourceLocation> ARMOR_LOCATION_CACHE = Maps.newHashMap();
    private final A innerModel;
    private final A outerModel;

    public WhiteArmourLayer(IEntityRenderer<T, M> p_i50936_1_, A p_i50936_2_, A p_i50936_3_) {
        super(p_i50936_1_);
        this.innerModel = p_i50936_2_;
        this.outerModel = p_i50936_3_;
    }

    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        this.renderArmorPiece(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.CHEST, packedLightIn, this.getArmorModel(EquipmentSlotType.CHEST), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.renderArmorPiece(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.LEGS, packedLightIn, this.getArmorModel(EquipmentSlotType.LEGS), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.renderArmorPiece(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.FEET, packedLightIn, this.getArmorModel(EquipmentSlotType.FEET), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
        this.renderArmorPiece(matrixStackIn, bufferIn, entitylivingbaseIn, EquipmentSlotType.HEAD, packedLightIn, this.getArmorModel(EquipmentSlotType.HEAD), limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
    }

    private void renderArmorPiece(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, T entitylivingbaseIn, EquipmentSlotType slotType, int packedLightIn, A modelIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        ItemStack itemstack = entitylivingbaseIn.getItemBySlot(slotType);

        if (itemstack.getItem() instanceof ArmorItem) {
            ArmorItem armoritem = (ArmorItem)itemstack.getItem();
            if (armoritem.getSlot() == slotType) {
                if(itemstack.getItem() == Items.IRON_LEGGINGS && itemstack.getOrCreateTag().getString("type").equals("white_armour")){
                    matrixStackIn.pushPose();
                    this.getParentModel().copyPropertiesTo(this.legsModel);
                    this.legsModel.setupAnim(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
                    IVertexBuilder ivertexbuilder = ItemRenderer.getFoilBuffer(bufferIn, this.legsModel.renderType(legsLocation), false, false);
                    this.legsModel.renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
                    matrixStackIn.popPose();
                }
                else if(itemstack.getItem() == Items.IRON_BOOTS && itemstack.getOrCreateTag().getString("type").equals("white_armour")){
                    matrixStackIn.pushPose();
                    this.getParentModel().copyPropertiesTo(this.bootsModel);
                    this.bootsModel.setupAnim(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
                    IVertexBuilder ivertexbuilder = ItemRenderer.getFoilBuffer(bufferIn, this.bootsModel.renderType(bootsLocation), false, false);
                    this.bootsModel.renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
                    matrixStackIn.popPose();
                } else if (itemstack.getItem() == Items.IRON_CHESTPLATE && itemstack.getOrCreateTag().getString("type").equals("white_armour")) {
                    matrixStackIn.pushPose();
                    this.getParentModel().copyPropertiesTo(this.chestModel);
                    this.chestModel.setupAnim(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
                    IVertexBuilder ivertexbuilder = ItemRenderer.getFoilBuffer(bufferIn, this.chestModel.renderType(chestLocation), false, false);
                    this.chestModel.renderToBuffer(matrixStackIn, ivertexbuilder, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
                    matrixStackIn.popPose();
                }
                else {
                    modelIn = getArmorModelHook(entitylivingbaseIn, itemstack, slotType, modelIn);
                    this.getParentModel().copyPropertiesTo(modelIn);
                    this.setPartVisibility(modelIn, slotType);
                    boolean flag = this.usesInnerModel(slotType);
                    boolean flag1 = itemstack.hasFoil();
                    if (armoritem instanceof net.minecraft.item.IDyeableArmorItem) {
                        int i = ((net.minecraft.item.IDyeableArmorItem)armoritem).getColor(itemstack);
                        float f = (float)(i >> 16 & 255) / 255.0F;
                        float f1 = (float)(i >> 8 & 255) / 255.0F;
                        float f2 = (float)(i & 255) / 255.0F;
                        this.renderModel(matrixStackIn, bufferIn, packedLightIn, flag1, modelIn, f, f1, f2, this.getArmorResource(entitylivingbaseIn, itemstack, slotType, null));
                        this.renderModel(matrixStackIn, bufferIn, packedLightIn, flag1, modelIn, 1.0F, 1.0F, 1.0F, this.getArmorResource(entitylivingbaseIn, itemstack, slotType, "overlay"));
                    } else {
                        this.renderModel(matrixStackIn, bufferIn, packedLightIn, flag1, modelIn, 1.0F, 1.0F, 1.0F, this.getArmorResource(entitylivingbaseIn, itemstack, slotType, null));
                    }
                }
            }
        }



    }

    protected void setPartVisibility(A p_188359_1_, EquipmentSlotType p_188359_2_) {
        p_188359_1_.setAllVisible(false);
        switch(p_188359_2_) {
            case HEAD:
                p_188359_1_.head.visible = true;
                p_188359_1_.hat.visible = true;
                break;
            case CHEST:
                p_188359_1_.body.visible = true;
                p_188359_1_.rightArm.visible = true;
                p_188359_1_.leftArm.visible = true;
                break;
            case LEGS:
                p_188359_1_.body.visible = true;
                p_188359_1_.rightLeg.visible = true;
                p_188359_1_.leftLeg.visible = true;
                break;
            case FEET:
                p_188359_1_.rightLeg.visible = true;
                p_188359_1_.leftLeg.visible = true;
        }

    }

    private void renderModel(MatrixStack p_241738_1_, IRenderTypeBuffer p_241738_2_, int p_241738_3_, ArmorItem p_241738_4_, boolean p_241738_5_, A p_241738_6_, boolean p_241738_7_, float p_241738_8_, float p_241738_9_, float p_241738_10_, @Nullable String p_241738_11_) {
        renderModel(p_241738_1_, p_241738_2_, p_241738_3_, p_241738_5_, p_241738_6_, p_241738_8_, p_241738_9_, p_241738_10_, this.getArmorLocation(p_241738_4_, p_241738_7_, p_241738_11_));
    }
    private void renderModel(MatrixStack p_241738_1_, IRenderTypeBuffer p_241738_2_, int p_241738_3_, boolean p_241738_5_, A p_241738_6_, float p_241738_8_, float p_241738_9_, float p_241738_10_, ResourceLocation armorResource) {
        IVertexBuilder ivertexbuilder = ItemRenderer.getArmorFoilBuffer(p_241738_2_, RenderType.armorCutoutNoCull(armorResource), false, p_241738_5_);
        p_241738_6_.renderToBuffer(p_241738_1_, ivertexbuilder, p_241738_3_, OverlayTexture.NO_OVERLAY, p_241738_8_, p_241738_9_, p_241738_10_, 1.0F);
    }

    private A getArmorModel(EquipmentSlotType p_241736_1_) {
        return (A)(this.usesInnerModel(p_241736_1_) ? this.innerModel : this.outerModel);
    }

    private boolean usesInnerModel(EquipmentSlotType p_188363_1_) {
        return p_188363_1_ == EquipmentSlotType.LEGS;
    }

    @Deprecated //Use the more sensitive version getArmorResource below
    private ResourceLocation getArmorLocation(ArmorItem p_241737_1_, boolean p_241737_2_, @Nullable String p_241737_3_) {
        String s = "textures/models/armor/" + p_241737_1_.getMaterial().getName() + "_layer_" + (p_241737_2_ ? 2 : 1) + (p_241737_3_ == null ? "" : "_" + p_241737_3_) + ".png";
        return ARMOR_LOCATION_CACHE.computeIfAbsent(s, ResourceLocation::new);
    }

    /*=================================== FORGE START =========================================*/

    /**
     * Hook to allow item-sensitive armor model. for LayerBipedArmor.
     */
    protected A getArmorModelHook(T entity, ItemStack itemStack, EquipmentSlotType slot, A model) {
        return net.minecraftforge.client.ForgeHooksClient.getArmorModel(entity, itemStack, slot, model);
    }

    /**
     * More generic ForgeHook version of the above function, it allows for Items to have more control over what texture they provide.
     *
     * @param entity Entity wearing the armor
     * @param stack ItemStack for the armor
     * @param slot Slot ID that the item is in
     * @param type Subtype, can be null or "overlay"
     * @return ResourceLocation pointing at the armor's texture
     */
    public ResourceLocation getArmorResource(net.minecraft.entity.Entity entity, ItemStack stack, EquipmentSlotType slot, @Nullable String type) {
        ArmorItem item = (ArmorItem)stack.getItem();
        String texture = item.getMaterial().getName();
        String domain = "minecraft";
        int idx = texture.indexOf(':');
        if (idx != -1) {
            domain = texture.substring(0, idx);
            texture = texture.substring(idx + 1);
        }
        String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", domain, texture, (usesInnerModel(slot) ? 2 : 1), type == null ? "" : String.format("_%s", type));

        s1 = net.minecraftforge.client.ForgeHooksClient.getArmorTexture(entity, stack, s1, slot, type);
        ResourceLocation resourcelocation = ARMOR_LOCATION_CACHE.get(s1);

        if (resourcelocation == null) {
            resourcelocation = new ResourceLocation(s1);
            ARMOR_LOCATION_CACHE.put(s1, resourcelocation);
        }

        return resourcelocation;
    }
    /*=================================== FORGE END ===========================================*/
}
