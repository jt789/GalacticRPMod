package com.github.jowashere.grp.client.renderer.models.whitearmour;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ModelWhiteBoots<T extends LivingEntity> extends BipedModel<T> {

    private final ModelRenderer RightLeg;
    private final ModelRenderer RightBoot;
    private final ModelRenderer part3;
    private final ModelRenderer part4;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer LeftBoot;
    private final ModelRenderer part1;
    private final ModelRenderer part2;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;


    public ModelWhiteBoots() {

        super(1F);
        texWidth = 300;
        texHeight = 300;

        RightLeg = new ModelRenderer(this);
        RightLeg.setPos(-1.9F, 12.0F, 0.0F);
        RightLeg.texOffs(284, 276).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

        RightBoot = new ModelRenderer(this);
        RightBoot.setPos(1.625F, -10.1F, 0.3F);
        RightLeg.addChild(RightBoot);


        part3 = new ModelRenderer(this);
        part3.setPos(1.0629F, 12.5998F, -1.9652F);
        RightBoot.addChild(part3);
        part3.texOffs(157, 13).addBox(-4.4409F, 7.7527F, -0.7251F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-4.9409F, 7.7527F, -0.7251F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-4.9159F, 8.7527F, 3.0249F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-4.4659F, 8.7527F, 3.0249F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-5.0483F, 7.7527F, -0.5891F, 3.0F, 2.0F, 4.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-5.0483F, 7.7527F, 2.9109F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-3.3233F, 7.7527F, -0.5891F, 3.0F, 2.0F, 4.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-3.3233F, 7.7527F, 2.9109F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-4.4289F, 8.8267F, -0.0726F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-4.4289F, 8.8267F, -0.5726F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-4.9289F, 8.8267F, -0.5726F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        part3.texOffs(157, 13).addBox(-4.9289F, 8.8267F, 1.9274F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        part4 = new ModelRenderer(this);
        part4.setPos(1.0629F, 12.5998F, -1.9652F);
        RightBoot.addChild(part4);
        part4.texOffs(193, 23).addBox(-4.4409F, 7.5306F, 3.1254F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-4.9409F, 7.5306F, 3.1254F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-3.9413F, 7.2984F, 3.1254F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-2.4413F, 7.2984F, 3.1254F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-5.1223F, 8.5306F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-5.1223F, 8.5306F, 2.5894F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-5.1223F, 7.5556F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-5.1223F, 7.8655F, 0.8871F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part4.texOffs(193, 23).addBox(-1.2535F, 7.5556F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part4.texOffs(193, 23).addBox(-1.2535F, 8.5306F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part4.texOffs(193, 23).addBox(-1.2535F, 8.5306F, 2.5894F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part4.texOffs(193, 23).addBox(-1.2535F, 7.8655F, 0.8871F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(-5.6191F, 7.3474F, 0.181F);
        part4.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.3752F, 0.0F, 0.0F);
        cube_r1.texOffs(193, 23).addBox(4.3656F, 0.1576F, 1.2202F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r1.texOffs(193, 23).addBox(4.3656F, 0.1576F, 2.0452F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r1.texOffs(193, 23).addBox(0.4967F, 0.1576F, 2.0452F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r1.texOffs(193, 23).addBox(0.4967F, 0.1576F, 1.2202F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-5.6191F, 7.3474F, 0.456F);
        part4.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.1789F, 0.0F, 0.0F);
        cube_r2.texOffs(193, 23).addBox(4.3656F, 0.6576F, 0.7202F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r2.texOffs(193, 23).addBox(4.3656F, 0.6576F, 1.4452F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r2.texOffs(193, 23).addBox(0.4967F, 0.6576F, 1.4452F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r2.texOffs(193, 23).addBox(0.4967F, 0.6576F, 0.7202F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-5.5191F, 7.3474F, -0.019F);
        part4.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2182F);
        cube_r3.texOffs(193, 23).addBox(3.9845F, -0.924F, 3.1444F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.1432F, 7.3474F, -0.019F);
        part4.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.2182F);
        cube_r4.texOffs(193, 23).addBox(-4.9845F, -0.924F, 3.1444F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setPos(1.9F, 12.0F, 0.0F);
        LeftLeg.texOffs(284, 276).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

        LeftBoot = new ModelRenderer(this);
        LeftBoot.setPos(-1.625F, -10.1F, 0.3F);
        LeftLeg.addChild(LeftBoot);


        part1 = new ModelRenderer(this);
        part1.setPos(-1.0629F, 12.5998F, -1.9652F);
        LeftBoot.addChild(part1);
        part1.texOffs(157, 13).addBox(0.4409F, 7.7527F, -0.7001F, 4.0F, 2.0F, 1.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(3.9409F, 7.7527F, -0.7001F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(3.9159F, 8.7527F, 3.0249F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(0.4659F, 8.7527F, 3.0249F, 4.0F, 1.0F, 1.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(2.0483F, 7.7527F, -0.5891F, 3.0F, 2.0F, 4.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(2.0483F, 7.7527F, 2.9109F, 3.0F, 2.0F, 1.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(0.3233F, 7.7527F, -0.5891F, 3.0F, 2.0F, 4.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(0.3233F, 7.7527F, 2.9109F, 3.0F, 2.0F, 1.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(0.4289F, 8.8267F, -0.0726F, 4.0F, 1.0F, 4.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(0.4289F, 8.8267F, -0.5726F, 4.0F, 1.0F, 1.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(3.9289F, 8.8267F, -0.5726F, 1.0F, 1.0F, 3.0F, 0.0F, true);
        part1.texOffs(157, 13).addBox(3.9289F, 8.8267F, 1.9274F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        part2 = new ModelRenderer(this);
        part2.setPos(-1.0629F, 12.5998F, -1.9652F);
        LeftBoot.addChild(part2);
        part2.texOffs(193, 23).addBox(0.4409F, 7.5306F, 3.1004F, 4.0F, 2.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(3.9409F, 7.5306F, 3.1004F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(1.9413F, 7.2984F, 3.1004F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(1.4413F, 7.2984F, 3.1004F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(4.1223F, 8.5306F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(4.1223F, 8.5306F, 2.5894F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(4.1223F, 7.5556F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(4.1223F, 7.8655F, 0.8871F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        part2.texOffs(193, 23).addBox(0.2535F, 7.5556F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part2.texOffs(193, 23).addBox(0.2535F, 8.5306F, 2.9644F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part2.texOffs(193, 23).addBox(0.2535F, 8.5306F, 2.5894F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        part2.texOffs(193, 23).addBox(0.2535F, 7.8655F, 0.8871F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(5.6191F, 7.3474F, 0.181F);
        part2.addChild(cube_r5);
        setRotationAngle(cube_r5, -0.3752F, 0.0F, 0.0F);
        cube_r5.texOffs(193, 23).addBox(-5.3656F, 0.1576F, 1.2202F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r5.texOffs(193, 23).addBox(-5.3656F, 0.1576F, 2.0452F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r5.texOffs(193, 23).addBox(-1.4967F, 0.1576F, 2.0452F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r5.texOffs(193, 23).addBox(-1.4967F, 0.1576F, 1.2202F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(5.6191F, 7.3474F, 0.456F);
        part2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.1789F, 0.0F, 0.0F);
        cube_r6.texOffs(193, 23).addBox(-5.3656F, 0.6576F, 0.7202F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r6.texOffs(193, 23).addBox(-5.3656F, 0.6576F, 1.4452F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r6.texOffs(193, 23).addBox(-1.4967F, 0.6576F, 1.4452F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r6.texOffs(193, 23).addBox(-1.4967F, 0.6576F, 0.7202F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(5.5191F, 7.3474F, -0.044F);
        part2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.2182F);
        cube_r7.texOffs(193, 23).addBox(-4.9845F, -0.924F, 3.1444F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(-0.1432F, 7.3474F, -0.044F);
        part2.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.2182F);
        cube_r8.texOffs(193, 23).addBox(3.9845F, -0.924F, 3.1444F, 1.0F, 1.0F, 1.0F, 0.0F, true);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        this.RightLeg.copyFrom(this.rightLeg);
        this.LeftLeg.copyFrom(this.leftLeg);

        RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
