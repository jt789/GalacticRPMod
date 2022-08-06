package com.github.jowashere.grp.client.renderer.handlers;

import com.github.jowashere.grp.client.renderer.layers.WhiteArmourLayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.entity.LivingRenderer;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.List;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class LayerHandler {

    @OnlyIn(Dist.CLIENT)
    public static void clientLoad(FMLClientSetupEvent event)
    {
        Map<String, PlayerRenderer> playerSkinMap = Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap();
        LayerHandler.addPlayerLayers(playerSkinMap.get("default"));
        LayerHandler.addPlayerLayers(playerSkinMap.get("slim"));
    }

    @OnlyIn(Dist.CLIENT)
    public static void addPlayerLayers(PlayerRenderer renderer)
    {
        List<LayerRenderer<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>>> layers = ObfuscationReflectionHelper.getPrivateValue(LivingRenderer.class, renderer, "field_177097_h");
        if(layers != null)
        {
            layers.remove(layers.get(0));
            layers.forEach((layer -> {
                if(layer instanceof BipedArmorLayer) {
                    layers.remove(layer);
                }
            }));
            layers.add(new WhiteArmourLayer<>(renderer, new BipedModel<>(0.5F), new BipedModel<>(1.0F)));
        }
    }
}
