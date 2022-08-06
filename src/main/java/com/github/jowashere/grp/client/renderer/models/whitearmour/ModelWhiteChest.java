package com.github.jowashere.grp.client.renderer.models.whitearmour;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ModelWhiteChest<T extends LivingEntity> extends BipedModel<T> {

    private final ModelRenderer Body;
    private final ModelRenderer center;
    private final ModelRenderer belt;
    private final ModelRenderer pocket1;
    private final ModelRenderer p2;
    private final ModelRenderer p3;
    private final ModelRenderer p4;
    private final ModelRenderer pocket2;
    private final ModelRenderer p49;
    private final ModelRenderer p50;
    private final ModelRenderer p51;
    private final ModelRenderer pocket3;
    private final ModelRenderer p48;
    private final ModelRenderer p47;
    private final ModelRenderer cube_r1;
    private final ModelRenderer pocket4;
    private final ModelRenderer p45;
    private final ModelRenderer p46;
    private final ModelRenderer cube_r2;
    private final ModelRenderer pocket5;
    private final ModelRenderer part1;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer part43;
    private final ModelRenderer part44;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer base;
    private final ModelRenderer p42;
    private final ModelRenderer p41;
    private final ModelRenderer p40;
    private final ModelRenderer bag;
    private final ModelRenderer p39;
    private final ModelRenderer p38;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer p37;
    private final ModelRenderer p36;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer p35;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer RightArm3;
    private final ModelRenderer leftarm;
    private final ModelRenderer shoulderpad2;
    private final ModelRenderer cube_r43;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer armor2;
    private final ModelRenderer p28;
    private final ModelRenderer p29;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer cube_r51;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer armor9;
    private final ModelRenderer p30;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer p31;
    private final ModelRenderer cube_r58;
    private final ModelRenderer armband5;
    private final ModelRenderer p32;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;
    private final ModelRenderer cube_r66;
    private final ModelRenderer p33;
    private final ModelRenderer p34;
    private final ModelRenderer arm2;
    private final ModelRenderer cube_r67;
    private final ModelRenderer LeftArm;
    private final ModelRenderer rightarm;
    private final ModelRenderer shoulderpad3;
    private final ModelRenderer cube_r68;
    private final ModelRenderer cube_r69;
    private final ModelRenderer cube_r70;
    private final ModelRenderer cube_r71;
    private final ModelRenderer armor6;
    private final ModelRenderer p21;
    private final ModelRenderer p22;
    private final ModelRenderer cube_r72;
    private final ModelRenderer cube_r73;
    private final ModelRenderer cube_r74;
    private final ModelRenderer cube_r75;
    private final ModelRenderer cube_r76;
    private final ModelRenderer cube_r77;
    private final ModelRenderer cube_r78;
    private final ModelRenderer cube_r79;
    private final ModelRenderer cube_r80;
    private final ModelRenderer armor7;
    private final ModelRenderer p23;
    private final ModelRenderer cube_r81;
    private final ModelRenderer cube_r82;
    private final ModelRenderer p24;
    private final ModelRenderer cube_r83;
    private final ModelRenderer armband4;
    private final ModelRenderer p25;
    private final ModelRenderer cube_r84;
    private final ModelRenderer cube_r85;
    private final ModelRenderer cube_r86;
    private final ModelRenderer cube_r87;
    private final ModelRenderer cube_r88;
    private final ModelRenderer cube_r89;
    private final ModelRenderer cube_r90;
    private final ModelRenderer cube_r91;
    private final ModelRenderer p26;
    private final ModelRenderer p27;
    private final ModelRenderer arm3;
    private final ModelRenderer cube_r92;

    public ModelWhiteChest() {

        super(1F);

        texWidth = 300;
        texHeight = 300;

        Body = new ModelRenderer(this);
        Body.setPos(0.0F, 0.0F, 0.0F);
        Body.texOffs(114, 15).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.25F, false);

        center = new ModelRenderer(this);
        center.setPos(-0.125F, 11.975F, 2.475F);
        Body.addChild(center);


        belt = new ModelRenderer(this);
        belt.setPos(-0.7548F, -6.9438F, 4.256F);
        center.addChild(belt);


        pocket1 = new ModelRenderer(this);
        pocket1.setPos(-0.3825F, 0.0F, 0.0F);
        belt.addChild(pocket1);


        p2 = new ModelRenderer(this);
        p2.setPos(0.0F, 0.0F, 0.0F);
        pocket1.addChild(p2);
        p2.texOffs(39, 15).addBox(-2.491F, 5.6435F, -9.725F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p2.texOffs(39, 15).addBox(-2.7915F, 5.6435F, -9.725F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        p3 = new ModelRenderer(this);
        p3.setPos(0.0F, 0.0F, 0.0F);
        pocket1.addChild(p3);
        p3.texOffs(74, 1).addBox(-2.8298F, 4.9183F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p3.texOffs(74, 1).addBox(-2.4548F, 4.9183F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p3.texOffs(82, 18).addBox(-2.3958F, 4.5872F, -9.7632F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p3.texOffs(69, 17).addBox(-2.8298F, 4.019F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        p3.texOffs(69, 17).addBox(-2.8298F, 4.894F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        p3.texOffs(69, 17).addBox(-2.4558F, 4.019F, -9.7632F, 1.0F, 0.0F, 1.0F, 0.0F, false);
        p3.texOffs(69, 17).addBox(-2.8308F, 4.019F, -9.7632F, 1.0F, 0.0F, 1.0F, 0.0F, false);
        p3.texOffs(74, 37).addBox(-2.4558F, 4.019F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p3.texOffs(74, 37).addBox(-2.8308F, 4.019F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p3.texOffs(83, 30).addBox(-2.8308F, 4.219F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p3.texOffs(83, 30).addBox(-2.8308F, 4.719F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p3.texOffs(83, 30).addBox(-2.4447F, 4.219F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p3.texOffs(83, 30).addBox(-2.4447F, 4.719F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p3.texOffs(69, 17).addBox(-1.4528F, 4.019F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        p3.texOffs(69, 17).addBox(-1.4528F, 4.894F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        p4 = new ModelRenderer(this);
        p4.setPos(0.3825F, -12.24F, -0.3825F);
        pocket1.addChild(p4);
        p4.texOffs(95, 22).addBox(-3.1843F, 16.8272F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p4.texOffs(95, 22).addBox(-3.1843F, 16.5022F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p4.texOffs(95, 22).addBox(-2.9093F, 16.8272F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p4.texOffs(95, 22).addBox(-2.9093F, 16.5022F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        pocket2 = new ModelRenderer(this);
        pocket2.setPos(2.142F, 0.0F, 0.0F);
        belt.addChild(pocket2);


        p49 = new ModelRenderer(this);
        p49.setPos(0.0F, 0.0F, 0.0F);
        pocket2.addChild(p49);
        p49.texOffs(39, 15).addBox(1.491F, 5.6435F, -9.725F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p49.texOffs(39, 15).addBox(1.7915F, 5.6435F, -9.725F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        p50 = new ModelRenderer(this);
        p50.setPos(0.0F, 0.0F, 0.0F);
        pocket2.addChild(p50);
        p50.texOffs(74, 1).addBox(1.8298F, 4.9183F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p50.texOffs(74, 1).addBox(1.4548F, 4.9183F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p50.texOffs(82, 18).addBox(1.3958F, 4.5872F, -9.7632F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p50.texOffs(69, 17).addBox(2.8298F, 4.019F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        p50.texOffs(69, 17).addBox(2.8298F, 4.894F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        p50.texOffs(69, 17).addBox(1.4558F, 4.019F, -9.7632F, 1.0F, 0.0F, 1.0F, 0.0F, true);
        p50.texOffs(69, 17).addBox(1.8308F, 4.019F, -9.7632F, 1.0F, 0.0F, 1.0F, 0.0F, true);
        p50.texOffs(74, 37).addBox(1.4558F, 4.019F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p50.texOffs(74, 37).addBox(1.8308F, 4.019F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p50.texOffs(83, 30).addBox(1.8308F, 4.219F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p50.texOffs(83, 30).addBox(1.8308F, 4.719F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        p50.texOffs(83, 30).addBox(1.4447F, 4.219F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p50.texOffs(83, 30).addBox(1.4447F, 4.719F, -9.7632F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p50.texOffs(69, 17).addBox(1.4528F, 4.019F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        p50.texOffs(69, 17).addBox(1.4528F, 4.894F, -9.7632F, 0.0F, 1.0F, 1.0F, 0.0F, true);

        p51 = new ModelRenderer(this);
        p51.setPos(-0.3825F, -12.24F, -0.3825F);
        pocket2.addChild(p51);
        p51.texOffs(95, 22).addBox(2.1843F, 16.8272F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p51.texOffs(95, 22).addBox(2.1843F, 16.5022F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p51.texOffs(95, 22).addBox(1.9093F, 16.8272F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p51.texOffs(95, 22).addBox(1.9093F, 16.5022F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        pocket3 = new ModelRenderer(this);
        pocket3.setPos(-0.3825F, 0.0F, -1.8551F);
        belt.addChild(pocket3);


        p48 = new ModelRenderer(this);
        p48.setPos(0.0F, 0.0F, 0.0F);
        pocket3.addChild(p48);
        p48.texOffs(35, 14).addBox(-3.5948F, 4.172F, -6.1022F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p48.texOffs(35, 14).addBox(-3.5948F, 4.2375F, -6.1022F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        p47 = new ModelRenderer(this);
        p47.setPos(0.0F, 0.0F, 0.0F);
        pocket3.addChild(p47);
        p47.texOffs(70, 0).addBox(-3.7478F, 4.855F, -5.548F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        p47.texOffs(71, 8).addBox(-3.7478F, 5.555F, -5.548F, 1.0F, 0.0F, 1.0F, 0.0F, false);
        p47.texOffs(70, 0).addBox(-3.7478F, 4.855F, -5.548F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p47.texOffs(70, 9).addBox(-3.7478F, 5.855F, -5.548F, 2.0F, 0.0F, 1.0F, 0.0F, false);
        p47.texOffs(66, 18).addBox(-3.48F, 4.2485F, -4.9875F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p47.texOffs(66, 18).addBox(-3.48F, 4.2485F, -6.2125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p47.texOffs(66, 18).addBox(-3.48F, 5.161F, -6.2125F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p47.texOffs(66, 18).addBox(-3.48F, 5.161F, -4.9875F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p47.texOffs(71, 36).addBox(-3.6713F, 4.0955F, -5.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p47.texOffs(71, 36).addBox(-3.6713F, 4.0955F, -5.217F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.8922F, 6.7188F, -6.053F);
        p47.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0611F);
        cube_r1.texOffs(72, 31).addBox(-4.7135F, -2.3232F, 0.153F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r1.texOffs(72, 31).addBox(-4.7135F, -2.3232F, 0.836F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        pocket4 = new ModelRenderer(this);
        pocket4.setPos(2.142F, 0.0F, -1.8551F);
        belt.addChild(pocket4);


        p45 = new ModelRenderer(this);
        p45.setPos(0.0F, 0.0F, 0.0F);
        pocket4.addChild(p45);
        p45.texOffs(35, 14).addBox(2.5948F, 4.172F, -6.1022F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        p45.texOffs(35, 14).addBox(2.5948F, 4.2375F, -6.1022F, 1.0F, 2.0F, 2.0F, 0.0F, true);

        p46 = new ModelRenderer(this);
        p46.setPos(0.0F, 0.0F, 0.0F);
        pocket4.addChild(p46);
        p46.texOffs(70, 0).addBox(3.7478F, 4.855F, -5.548F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        p46.texOffs(71, 8).addBox(2.7478F, 5.555F, -5.548F, 1.0F, 0.0F, 1.0F, 0.0F, true);
        p46.texOffs(70, 0).addBox(2.7478F, 4.855F, -5.548F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p46.texOffs(70, 9).addBox(1.7478F, 5.855F, -5.548F, 2.0F, 0.0F, 1.0F, 0.0F, true);
        p46.texOffs(66, 18).addBox(2.48F, 4.2485F, -4.9875F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p46.texOffs(66, 18).addBox(2.48F, 4.2485F, -6.2125F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p46.texOffs(66, 18).addBox(2.48F, 5.161F, -6.2125F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p46.texOffs(66, 18).addBox(2.48F, 5.161F, -4.9875F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p46.texOffs(71, 36).addBox(2.6713F, 4.0955F, -5.9F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p46.texOffs(71, 36).addBox(2.6713F, 4.0955F, -5.217F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(-0.8922F, 6.7188F, -6.053F);
        p46.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, -0.0611F);
        cube_r2.texOffs(72, 31).addBox(3.7135F, -2.3232F, 0.153F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r2.texOffs(72, 31).addBox(3.7135F, -2.3232F, 0.836F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        pocket5 = new ModelRenderer(this);
        pocket5.setPos(0.0F, 0.0F, 0.0F);
        belt.addChild(pocket5);


        part1 = new ModelRenderer(this);
        part1.setPos(-4.131F, -2.4862F, 0.2677F);
        pocket5.addChild(part1);
        part1.texOffs(12, 1).addBox(2.6107F, 7.0352F, -2.993F, 2.0F, 1.0F, 0.0F, 0.0F, false);
        part1.texOffs(12, 1).addBox(4.3357F, 7.0352F, -2.993F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        part1.texOffs(14, -1).addBox(7.3357F, 7.0352F, -4.993F, 0.0F, 1.0F, 2.0F, 0.0F, false);
        part1.texOffs(14, -1).addBox(2.6107F, 7.0352F, -4.993F, 0.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(4.5232F, 6.68F, -1.7952F);
        part1.addChild(cube_r3);
        setRotationAngle(cube_r3, 1.5708F, 0.0F, 0.0F);
        cube_r3.texOffs(12, 1).addBox(-1.9125F, -2.6448F, -1.7978F, 2.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r3.texOffs(13, 0).addBox(-1.9125F, -2.6448F, -1.7978F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r3.texOffs(14, 0).addBox(2.8125F, -2.6448F, -1.7978F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r3.texOffs(12, 1).addBox(-0.1875F, -2.6448F, -1.7978F, 3.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(0.6982F, 5.5883F, -3.241F);
        part1.addChild(cube_r4);
        setRotationAngle(cube_r4, 2.3562F, 0.0F, 0.0F);
        cube_r4.texOffs(13, 1).addBox(1.9125F, -2.5683F, -1.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r4.texOffs(13, 1).addBox(1.9125F, -2.5433F, -0.3825F, 2.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r4.texOffs(13, 1).addBox(6.6375F, -2.5433F, -1.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r4.texOffs(13, 1).addBox(3.6375F, -2.5433F, -0.3825F, 3.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(0.6982F, 9.3133F, -2.691F);
        part1.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
        cube_r5.texOffs(13, 1).addBox(1.9125F, -2.5683F, -0.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r5.texOffs(13, 1).addBox(1.9125F, -2.5683F, -0.3825F, 2.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r5.texOffs(13, 1).addBox(6.6375F, -2.5683F, -0.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r5.texOffs(13, 1).addBox(3.6375F, -2.5683F, -0.3825F, 3.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(0.6982F, 6.6633F, -2.166F);
        part1.addChild(cube_r6);
        setRotationAngle(cube_r6, 2.3562F, 0.0F, 0.0F);
        cube_r6.texOffs(13, 0).addBox(1.9125F, -2.5683F, -0.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r6.texOffs(13, 1).addBox(1.9125F, -2.5683F, -0.3825F, 2.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r6.texOffs(13, 0).addBox(6.6375F, -2.5683F, -0.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r6.texOffs(13, 1).addBox(3.6375F, -2.5683F, -0.3825F, 3.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(0.6982F, 8.2383F, -1.616F);
        part1.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.7854F, 0.0F, 0.0F);
        cube_r7.texOffs(14, 0).addBox(1.9125F, -2.5683F, -1.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r7.texOffs(14, 0).addBox(6.6375F, -2.5683F, -1.3825F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r7.texOffs(13, 1).addBox(3.6375F, -2.5683F, -0.3825F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r7.texOffs(13, 1).addBox(1.9125F, -2.5683F, -0.3825F, 2.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(0.6982F, 5.155F, -1.7952F);
        part1.addChild(cube_r8);
        setRotationAngle(cube_r8, 1.5708F, 0.0F, 0.0F);
        cube_r8.texOffs(13, 0).addBox(1.9125F, -2.6448F, -2.7978F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r8.texOffs(12, 1).addBox(1.9125F, -2.6448F, -1.7978F, 2.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r8.texOffs(13, 0).addBox(6.6375F, -2.6448F, -2.7978F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r8.texOffs(12, 1).addBox(3.6375F, -2.6448F, -1.7978F, 3.0F, 1.0F, 0.0F, 0.0F, false);

        part43 = new ModelRenderer(this);
        part43.setPos(0.0F, 0.0F, 5.1255F);
        pocket5.addChild(part43);
        part43.texOffs(55, 1).addBox(1.4695F, 4.4093F, -7.811F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part43.texOffs(55, 1).addBox(1.1445F, 4.4093F, -7.811F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part43.texOffs(55, 1).addBox(0.8195F, 4.4093F, -7.811F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part43.texOffs(55, 1).addBox(0.4945F, 4.4093F, -7.811F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part43.texOffs(55, 1).addBox(0.1695F, 4.4093F, -7.811F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        part44 = new ModelRenderer(this);
        part44.setPos(0.0F, 0.0F, 5.1255F);
        pocket5.addChild(part44);
        part44.texOffs(85, 1).addBox(2.7607F, 4.5872F, -7.7742F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        part44.texOffs(85, 1).addBox(-1.3643F, 4.5872F, -7.7742F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        part44.texOffs(57, 36).addBox(3.2402F, 4.9593F, -9.3717F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        part44.texOffs(57, 36).addBox(3.2402F, 5.0093F, -9.3217F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        part44.texOffs(57, 36).addBox(3.2402F, 4.9093F, -9.4217F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        part44.texOffs(57, 36).addBox(-1.5807F, 4.9593F, -9.3717F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        part44.texOffs(57, 36).addBox(-1.5807F, 4.9093F, -9.4217F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        part44.texOffs(57, 36).addBox(-1.5807F, 5.0093F, -9.3217F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        part44.texOffs(110, 1).addBox(1.5078F, 4.471F, -7.8227F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part44.texOffs(110, 1).addBox(1.1828F, 4.471F, -7.8227F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part44.texOffs(110, 1).addBox(0.8578F, 4.471F, -7.8227F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part44.texOffs(110, 1).addBox(0.5328F, 4.471F, -7.8227F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        part44.texOffs(110, 1).addBox(0.2078F, 4.471F, -7.8227F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(-3.2828F, 4.3688F, -6.603F);
        part44.addChild(cube_r9);
        setRotationAngle(cube_r9, 1.5708F, 0.0F, 0.0F);
        cube_r9.texOffs(85, 1).addBox(1.9185F, -2.6815F, -1.7213F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r9.texOffs(85, 1).addBox(6.0435F, -2.6815F, -1.7213F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(-2.9768F, 4.277F, -10.2893F);
        part44.addChild(cube_r10);
        setRotationAngle(cube_r10, -2.3562F, 0.0F, 0.0F);
        cube_r10.texOffs(85, 1).addBox(1.6065F, -2.53F, 0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r10.texOffs(85, 1).addBox(5.7315F, -2.53F, 0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(-2.9768F, 4.277F, -6.8987F);
        part44.addChild(cube_r11);
        setRotationAngle(cube_r11, 2.3562F, 0.0F, 0.0F);
        cube_r11.texOffs(85, 1).addBox(1.6065F, -2.53F, -0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r11.texOffs(85, 1).addBox(5.7315F, -2.53F, -0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(-2.9768F, 5.702F, -10.7143F);
        part44.addChild(cube_r12);
        setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
        cube_r12.texOffs(85, 1).addBox(1.6065F, -2.53F, 0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r12.texOffs(85, 1).addBox(5.7315F, -2.53F, 0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(-3.2828F, 2.6688F, -6.603F);
        part44.addChild(cube_r13);
        setRotationAngle(cube_r13, 1.5708F, 0.0F, 0.0F);
        cube_r13.texOffs(85, 1).addBox(1.9185F, -2.6065F, -1.7213F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r13.texOffs(85, 1).addBox(6.0435F, -2.6065F, -1.7213F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(-2.9768F, 5.702F, -6.4737F);
        part44.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
        cube_r14.texOffs(85, 1).addBox(1.6065F, -2.53F, -0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        cube_r14.texOffs(85, 1).addBox(5.7315F, -2.53F, -0.306F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        base = new ModelRenderer(this);
        base.setPos(0.0F, 0.0F, 0.0F);
        belt.addChild(base);


        p42 = new ModelRenderer(this);
        p42.setPos(0.0F, 0.0F, 0.0F);
        base.addChild(p42);
        p42.texOffs(36, 19).addBox(1.8312F, 4.1875F, -9.3042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(1.4542F, 4.1875F, -9.3042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-0.7698F, 4.2125F, -9.3042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-1.1468F, 4.2125F, -9.3042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p42.texOffs(39, 1).addBox(-0.6753F, 5.1227F, -9.2277F, 6.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(39, 1).addBox(-3.5653F, 5.1227F, -9.2277F, 5.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(39, 37).addBox(-3.5653F, 4.2977F, -9.2277F, 5.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(39, 37).addBox(-0.6753F, 4.2977F, -9.2277F, 6.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(5.316F, 5.1227F, -7.2465F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(5.316F, 4.2977F, -7.2465F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(5.316F, 5.1227F, -9.2215F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(5.316F, 4.2977F, -9.2215F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-3.5653F, 4.2867F, -4.2552F, 5.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-3.5653F, 5.1227F, -4.2552F, 5.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(1.2997F, 5.1227F, -4.2552F, 4.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(1.2997F, 4.2867F, -4.2552F, 4.0F, 1.0F, 0.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-3.5565F, 4.2867F, -9.2365F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-3.5565F, 5.1227F, -9.2365F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-3.5565F, 4.2867F, -7.2615F, 0.0F, 1.0F, 3.0F, 0.0F, false);
        p42.texOffs(36, 19).addBox(-3.5565F, 5.1227F, -7.2615F, 0.0F, 1.0F, 3.0F, 0.0F, false);

        p41 = new ModelRenderer(this);
        p41.setPos(0.0F, 0.0F, 0.0F);
        base.addChild(p41);
        p41.texOffs(62, 20).addBox(0.1247F, 5.1168F, -9.1512F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        p41.texOffs(62, 20).addBox(0.1247F, 4.2927F, -9.1512F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        p41.texOffs(62, 20).addBox(-3.3653F, 4.2927F, -9.1512F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        p41.texOffs(62, 20).addBox(-3.3653F, 5.1168F, -9.1512F, 5.0F, 1.0F, 1.0F, 0.0F, false);

        p40 = new ModelRenderer(this);
        p40.setPos(-0.3825F, 0.0F, 0.0F);
        base.addChild(p40);
        p40.texOffs(94, 21).addBox(-0.3108F, 4.6917F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p40.texOffs(94, 21).addBox(-0.8408F, 4.6917F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p40.texOffs(94, 21).addBox(2.2902F, 4.6917F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p40.texOffs(94, 21).addBox(1.7602F, 4.6917F, -9.2277F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        bag = new ModelRenderer(this);
        bag.setPos(-0.7548F, -6.8878F, 3.491F);
        center.addChild(bag);


        p39 = new ModelRenderer(this);
        p39.setPos(0.0F, 0.0F, 0.0F);
        bag.addChild(p39);
        p39.texOffs(8, 12).addBox(-1.6333F, -3.418F, -3.5855F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        p38 = new ModelRenderer(this);
        p38.setPos(-3.7103F, -9.6008F, 0.0F);
        bag.addChild(p38);
        p38.texOffs(92, 20).addBox(1.875F, 5.8932F, -3.7252F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.23F, 5.8932F, -3.7252F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.23F, 5.8932F, -3.5252F, 3.0F, 0.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.88F, 5.8932F, -3.5252F, 3.0F, 0.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.23F, 7.3358F, -3.7252F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(7.23F, 6.3358F, -3.5252F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(7.23F, 5.8858F, -3.5252F, 0.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.875F, 6.3358F, -3.5252F, 0.0F, 3.0F, 1.0F, 0.0F, true);
        p38.texOffs(92, 20).addBox(1.875F, 5.8858F, -3.5252F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        p38.texOffs(92, 20).addBox(1.875F, 7.3358F, -3.7252F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.875F, 9.3358F, -3.5252F, 5.0F, 0.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.225F, 9.3358F, -3.5252F, 3.0F, 0.0F, 1.0F, 0.0F, false);
        p38.texOffs(91, 0).addBox(1.875F, 5.5433F, -3.534F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(110, 3).addBox(6.78F, 6.3955F, -2.534F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p38.texOffs(110, 3).addBox(6.78F, 6.9205F, -2.534F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p38.texOffs(91, 0).addBox(4.23F, 5.5433F, -3.534F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(110, 3).addBox(1.88F, 6.3955F, -2.534F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p38.texOffs(110, 3).addBox(1.855F, 6.9205F, -2.534F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p38.texOffs(93, 10).addBox(5.08F, 6.3955F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(93, 10).addBox(5.03F, 6.3955F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(93, 10).addBox(3.08F, 6.3955F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(93, 10).addBox(3.305F, 6.3955F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(95, 0).addBox(2.2077F, 6.9205F, -3.534F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(95, 0).addBox(3.9327F, 6.9205F, -3.534F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(89, 0).addBox(4.23F, 8.3358F, -3.534F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(89, 0).addBox(2.155F, 8.3358F, -3.534F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 2).addBox(6.855F, 7.1827F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 2).addBox(1.25F, 7.3327F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p38.texOffs(99, 8).addBox(4.155F, 7.3077F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(86, 0).addBox(5.155F, 7.5327F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(86, 0).addBox(5.855F, 7.5327F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(86, 0).addBox(2.68F, 7.2828F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(86, 0).addBox(2.68F, 7.7577F, -3.534F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 20).addBox(6.605F, 7.3077F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 20).addBox(6.355F, 7.3077F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 20).addBox(6.105F, 7.3077F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 20).addBox(5.855F, 7.3077F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 20).addBox(5.605F, 7.3077F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(83, 20).addBox(5.355F, 7.3077F, -3.534F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.7985F, 5.8168F, -3.687F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.3065F, 5.8168F, -3.687F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.722F, 5.7402F, -3.84F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.383F, 5.7402F, -3.84F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.6455F, 5.6638F, -3.993F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.4595F, 5.6638F, -3.993F, 3.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.569F, 5.5872F, -4.146F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(3.536F, 5.5872F, -4.146F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.4925F, 5.5107F, -4.299F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(3.6125F, 5.5107F, -4.299F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.7985F, 7.6418F, -3.687F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(3.3065F, 7.6418F, -3.687F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.722F, 6.9478F, -3.84F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.383F, 6.9478F, -3.84F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.6455F, 7.2538F, -4.993F, 3.0F, 3.0F, 2.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.4595F, 7.2538F, -4.993F, 3.0F, 3.0F, 2.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.569F, 7.5598F, -4.146F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(3.536F, 7.5598F, -4.146F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.4925F, 7.8658F, -4.299F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.6125F, 7.8658F, -4.299F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(1.416F, 10.1718F, -4.452F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        p38.texOffs(92, 20).addBox(4.689F, 10.1718F, -4.452F, 3.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(0.9142F, 6.5818F, -6.053F);
        p38.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
        cube_r15.texOffs(85, 37).addBox(0.8623F, 1.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(0.9142F, 7.2453F, -6.053F);
        p38.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
        cube_r16.texOffs(85, 1).addBox(0.8623F, -2.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(2.8642F, 7.2453F, -6.053F);
        p38.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
        cube_r17.texOffs(85, 1).addBox(0.8622F, -2.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(2.8642F, 6.5818F, -6.053F);
        p38.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
        cube_r18.texOffs(85, 37).addBox(0.8622F, 1.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(4.4908F, 7.2453F, -6.053F);
        p38.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
        cube_r19.texOffs(85, 1).addBox(-1.8622F, -2.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(4.4908F, 6.5818F, -6.053F);
        p38.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, 0.7854F);
        cube_r20.texOffs(85, 37).addBox(-1.8622F, 1.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(6.4658F, 6.5818F, -6.053F);
        p38.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.0F, 0.0F, 0.7854F);
        cube_r21.texOffs(85, 37).addBox(-1.8622F, 1.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(6.4658F, 7.2453F, -6.053F);
        p38.addChild(cube_r22);
        setRotationAngle(cube_r22, 0.0F, 0.0F, -0.7854F);
        cube_r22.texOffs(85, 1).addBox(-1.8622F, -2.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(8.2408F, 6.5818F, -6.053F);
        p38.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, 0.7854F);
        cube_r23.texOffs(85, 37).addBox(-1.8622F, 1.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(8.2408F, 7.2453F, -6.053F);
        p38.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.0F, -0.7854F);
        cube_r24.texOffs(85, 1).addBox(-1.8622F, -2.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(4.6142F, 6.5818F, -6.053F);
        p38.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
        cube_r25.texOffs(85, 37).addBox(0.8622F, 1.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(4.6142F, 7.2453F, -6.053F);
        p38.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.0F, 0.0F, 0.7854F);
        cube_r26.texOffs(85, 1).addBox(0.8622F, -2.8743F, 3.519F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(4.3405F, 8.6527F, -6.053F);
        p38.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.0F, 0.0F, 0.4276F);
        cube_r27.texOffs(107, 0).addBox(-1.3605F, -0.62F, 2.519F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(2.0145F, 8.6527F, -6.053F);
        p38.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, -0.4276F);
        cube_r28.texOffs(107, 0).addBox(0.3605F, -0.62F, 2.519F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(2.0145F, 8.1778F, -6.053F);
        p38.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.0F, -0.4276F);
        cube_r29.texOffs(107, 0).addBox(0.3605F, -0.62F, 2.519F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(4.3405F, 8.1778F, -6.053F);
        p38.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.0F, 0.4276F);
        cube_r30.texOffs(107, 0).addBox(-1.3605F, -0.62F, 2.519F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        p37 = new ModelRenderer(this);
        p37.setPos(-0.7548F, -7.1938F, 4.256F);
        center.addChild(p37);
        p37.texOffs(4, 8).addBox(0.1247F, 3.4495F, -9.0365F, 5.0F, 4.0F, 1.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.3653F, 3.4495F, -9.0365F, 5.0F, 4.0F, 1.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(4.2012F, 4.4495F, -6.4847F, 1.0F, 3.0F, 2.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(4.2012F, 3.8745F, -6.4847F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(4.2012F, 4.4495F, -8.9982F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(4.2012F, 3.8745F, -8.9982F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(1.1247F, 4.4495F, -5.4465F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.3653F, 4.4495F, -5.4465F, 5.0F, 3.0F, 1.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(1.1247F, 3.9745F, -5.4465F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.3653F, 3.9745F, -5.4465F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.4418F, 4.4495F, -8.9982F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.4418F, 3.8745F, -8.9982F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.4418F, 4.4495F, -7.4847F, 1.0F, 3.0F, 3.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.4418F, 3.8745F, -7.4847F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-0.6378F, 6.5893F, -7.4847F, 3.0F, 1.0F, 3.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-0.6378F, 6.5893F, -8.9982F, 3.0F, 1.0F, 2.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(3.8702F, -5.1228F, -6.807F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(3.8702F, -5.1228F, -8.982F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p37.texOffs(4, 8).addBox(-3.1107F, -5.1228F, -8.982F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        p36 = new ModelRenderer(this);
        p36.setPos(-0.7548F, -7.1938F, 4.256F);
        center.addChild(p36);
        p36.texOffs(34, 19).addBox(-0.9938F, -1.54F, -9.0747F, 4.0F, 5.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(2.6782F, -0.1192F, -9.0747F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(3.1247F, -0.1192F, -9.0747F, 2.0F, 4.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-1.9938F, -0.1192F, -9.0747F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-3.3653F, -0.1192F, -9.0747F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(4.2777F, -0.1192F, -8.9982F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(4.2777F, -0.1192F, -7.818F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(4.2777F, -0.1192F, -6.665F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(4.2777F, -0.1192F, -6.4847F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-3.3653F, 1.9808F, -5.37F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(0.1247F, 1.9808F, -5.37F, 5.0F, 2.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-3.3653F, 1.3058F, -5.37F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(0.1247F, 1.3058F, -5.37F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-3.5183F, -0.1192F, -6.4847F, 1.0F, 4.0F, 2.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-3.5183F, -0.1192F, -6.665F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-3.5183F, -0.1192F, -7.818F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        p36.texOffs(34, 19).addBox(-3.5183F, -0.1192F, -8.9982F, 1.0F, 4.0F, 2.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(0.4597F, 7.0938F, -6.053F);
        p36.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, 0.0F, -0.7854F);
        cube_r31.texOffs(34, 19).addBox(1.2623F, -4.2895F, -3.0218F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(1.2247F, 7.0938F, -6.053F);
        p36.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
        cube_r32.texOffs(34, 19).addBox(-2.2623F, -4.2895F, -3.0218F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        p35 = new ModelRenderer(this);
        p35.setPos(-0.946F, -6.8878F, 2.6877F);
        center.addChild(p35);
        p35.texOffs(58, 1).addBox(-3.3653F, -2.81F, -7.43F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 24).addBox(4.0615F, -5.4288F, -5.9077F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        p35.texOffs(63, 24).addBox(-2.9195F, -5.4288F, -5.9077F, 1.0F, 1.0F, 3.0F, 0.0F, true);
        p35.texOffs(83, 35).addBox(-3.3653F, -2.81F, -3.8955F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p35.texOffs(58, 1).addBox(-3.3653F, -1.81F, -7.43F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p35.texOffs(64, 9).addBox(-3.3653F, -1.81F, -3.8955F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p35.texOffs(66, 35).addBox(-3.3653F, -0.818F, -7.43F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p35.texOffs(66, 35).addBox(-3.3653F, -0.818F, -7.2497F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p35.texOffs(66, 35).addBox(-3.3653F, -0.818F, -4.8997F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p35.texOffs(66, 35).addBox(-3.3653F, -0.818F, -5.08F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p35.texOffs(66, 35).addBox(4.5073F, -0.818F, -5.08F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        p35.texOffs(83, 35).addBox(4.5073F, -2.81F, -3.8955F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p35.texOffs(64, 9).addBox(4.5073F, -1.81F, -3.8955F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p35.texOffs(66, 35).addBox(4.5073F, -0.818F, -4.8997F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        p35.texOffs(58, 1).addBox(4.5073F, -2.81F, -7.43F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p35.texOffs(66, 35).addBox(4.5073F, -0.818F, -7.2497F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        p35.texOffs(66, 35).addBox(4.5073F, -0.818F, -7.43F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        p35.texOffs(58, 1).addBox(4.5073F, -1.81F, -7.43F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(1.16F, -3.1758F, -7.6977F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(1.16F, -5.0463F, -7.6977F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(1.9132F, -2.6475F, -7.6977F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(3.316F, -2.6475F, -7.6977F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(1.9132F, -5.1977F, -7.6977F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(3.316F, -5.3227F, -7.6977F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(-0.018F, -5.0463F, -7.6977F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(-0.018F, -3.1758F, -7.6977F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(-3.174F, -2.6475F, -7.6977F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(-1.7712F, -2.6475F, -7.6977F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(-1.7712F, -5.1977F, -7.6977F, 2.0F, 3.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(-3.174F, -5.3227F, -7.6977F, 2.0F, 3.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(-3.174F, -5.1993F, -3.6105F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(3.316F, -5.3243F, -3.6105F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(2.566F, -5.2493F, -3.6105F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(-1.424F, -5.2493F, -3.6105F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(-3.174F, -5.3243F, -3.6105F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        p35.texOffs(63, 14).addBox(0.316F, -5.1993F, -3.6105F, 5.0F, 4.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(-3.174F, -2.0028F, -3.6105F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        p35.texOffs(63, 14).addBox(0.316F, -2.0028F, -3.6105F, 5.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(1.0585F, -1.2977F, -4.4847F);
        p35.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.6981F, 0.0F, -0.7854F);
        cube_r33.texOffs(63, 14).addBox(-1.1342F, -2.153F, -2.338F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(1.1085F, -1.2372F, -4.4847F);
        p35.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.6981F, 0.0F, 0.0F);
        cube_r34.texOffs(63, 14).addBox(-2.8797F, -1.6103F, -2.838F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        cube_r34.texOffs(63, 14).addBox(-4.2825F, -1.6103F, -2.838F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        cube_r34.texOffs(63, 14).addBox(0.8047F, -1.6103F, -2.838F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r34.texOffs(63, 14).addBox(2.2075F, -1.6103F, -2.838F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(1.1085F, -1.2977F, -4.4847F);
        p35.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, -0.7854F);
        cube_r35.texOffs(63, 14).addBox(-1.1093F, -1.153F, -3.213F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(1.8585F, -1.7622F, -4.4847F);
        p35.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.6981F, 0.0F, 0.0F);
        cube_r36.texOffs(63, 14).addBox(-1.8797F, -1.6103F, -2.838F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        cube_r36.texOffs(63, 14).addBox(-0.6953F, -1.6103F, -2.838F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(1.0835F, -1.2977F, -4.4847F);
        p35.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.6981F, 0.0F, 0.7854F);
        cube_r37.texOffs(63, 14).addBox(0.1343F, -2.153F, -2.338F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(1.0335F, -1.2977F, -4.4847F);
        p35.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0F, 0.0F, 0.7854F);
        cube_r38.texOffs(63, 14).addBox(0.1093F, -1.153F, -3.213F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(1.2998F, -1.0813F, -5.6815F);
        p35.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.9774F, 0.0F, 0.0F);
        cube_r39.texOffs(83, 16).addBox(3.2075F, -1.0457F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r39.texOffs(83, 16).addBox(3.2075F, -0.4957F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r39.texOffs(83, 16).addBox(-4.665F, -1.0457F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r39.texOffs(83, 16).addBox(-4.665F, -0.4957F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(1.2998F, -2.2563F, -6.5815F);
        p35.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.4756F, 0.0F, 0.0F);
        cube_r40.texOffs(75, 17).addBox(3.2075F, 0.2292F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r40.texOffs(83, 18).addBox(3.2075F, -0.1958F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r40.texOffs(83, 16).addBox(3.2075F, -0.5957F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r40.texOffs(83, 18).addBox(-4.665F, -0.1958F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r40.texOffs(75, 17).addBox(-4.665F, 0.2292F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r40.texOffs(83, 16).addBox(-4.665F, -0.5957F, -0.9862F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(1.2998F, -2.2563F, -3.744F);
        p35.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.4756F, 0.0F, 0.0F);
        cube_r41.texOffs(83, 36).addBox(3.2075F, -0.5957F, -0.4388F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r41.texOffs(75, 17).addBox(3.2075F, 0.2292F, -0.0138F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r41.texOffs(83, 36).addBox(-4.665F, -0.5957F, -0.4388F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r41.texOffs(75, 17).addBox(-4.665F, 0.2292F, -0.0138F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(1.2998F, -1.0813F, -4.644F);
        p35.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.9774F, 0.0F, 0.0F);
        cube_r42.texOffs(58, 16).addBox(3.2075F, -1.0457F, -0.0138F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r42.texOffs(58, 16).addBox(3.2075F, -0.4957F, -0.0138F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r42.texOffs(58, 16).addBox(-4.665F, -1.0457F, -0.0138F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r42.texOffs(58, 16).addBox(-4.665F, -0.4957F, -0.0138F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        RightArm3 = new ModelRenderer(this);
        RightArm3.setPos(-5.0F, 2.0F, 0.0F);
        RightArm3.texOffs(121, 9).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

        leftarm = new ModelRenderer(this);
        leftarm.setPos(-0.675F, 6.775F, 0.7F);
        RightArm3.addChild(leftarm);


        shoulderpad2 = new ModelRenderer(this);
        shoulderpad2.setPos(3.6848F, -4.4783F, 0.3243F);
        leftarm.addChild(shoulderpad2);
        shoulderpad2.texOffs(6, 13).addBox(-5.2784F, -4.6771F, -3.5046F, 3.0F, 0.0F, 2.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-5.2784F, -4.6771F, -1.5483F, 3.0F, 0.0F, 3.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.3644F, -4.6771F, -3.5046F, 2.0F, 0.0F, 2.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.3644F, -4.6771F, -1.5483F, 2.0F, 0.0F, 3.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.4877F, -4.6788F, -1.6733F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.4877F, -4.6788F, -3.3796F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.4877F, -4.417F, -1.6733F, 1.0F, 2.0F, 3.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.4877F, -4.417F, -3.3796F, 1.0F, 2.0F, 3.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.3644F, -4.6788F, -3.5028F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.3644F, -3.4538F, -3.5028F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-5.4426F, -4.6788F, -3.5028F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(17, 31).addBox(-4.2784F, -4.6788F, -3.5028F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(17, 31).addBox(-4.2784F, -4.6788F, 0.4543F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.3644F, -3.4538F, 0.4543F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.3644F, -4.6788F, 0.4543F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-5.4426F, -4.6788F, 0.4543F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.4877F, -3.2252F, -1.8561F, 0.0F, 2.0F, 2.0F, 0.0F, false);
        shoulderpad2.texOffs(6, 13).addBox(-6.4877F, -3.2252F, -2.1968F, 0.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setPos(1.9776F, 8.1852F, -1.7714F);
        shoulderpad2.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.7854F, 0.0F, 0.0F);
        cube_r43.texOffs(6, 13).addBox(-8.4653F, -9.0132F, -6.3011F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r43.texOffs(6, 13).addBox(-8.4653F, -9.6981F, -6.3011F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setPos(1.9776F, 8.1852F, -0.2815F);
        shoulderpad2.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.7854F, 0.0F, 0.0F);
        cube_r44.texOffs(6, 13).addBox(-8.4653F, -9.0132F, 5.3011F, 0.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r44.texOffs(6, 13).addBox(-8.4653F, -9.6981F, 5.3011F, 0.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setPos(-2.9971F, -1.3502F, -1.6688F);
        shoulderpad2.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0F, 0.0F, -0.2356F);
        cube_r45.texOffs(6, 13).addBox(-2.0477F, -3.0811F, 2.1231F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r45.texOffs(6, 13).addBox(-0.7227F, -2.6311F, 2.1231F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r45.texOffs(6, 13).addBox(-2.0477F, -2.6311F, 2.1231F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r45.texOffs(6, 13).addBox(-0.7227F, -2.6311F, -1.834F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r45.texOffs(6, 13).addBox(-2.0477F, -3.0811F, -1.834F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r45.texOffs(6, 13).addBox(-2.0477F, -2.6311F, -1.834F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setPos(-2.9971F, -1.3502F, -1.6688F);
        shoulderpad2.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.0F, 0.0F, -0.6807F);
        cube_r46.texOffs(6, 13).addBox(0.9523F, -2.3561F, 2.1231F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r46.texOffs(6, 13).addBox(1.0273F, -2.3561F, 2.1231F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r46.texOffs(6, 13).addBox(1.0273F, -2.3561F, -1.834F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r46.texOffs(6, 13).addBox(0.9523F, -2.3561F, -1.834F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        armor2 = new ModelRenderer(this);
        armor2.setPos(-2.2005F, -0.0347F, 4.6391F);
        leftarm.addChild(armor2);


        p28 = new ModelRenderer(this);
        p28.setPos(8.0543F, -0.2877F, 0.452F);
        armor2.addChild(p28);
        p28.texOffs(9, 12).addBox(-7.9904F, -5.1156F, -4.4402F, 4.0F, 2.0F, 1.0F, 0.0F, false);

        p29 = new ModelRenderer(this);
        p29.setPos(11.6706F, -0.2877F, 0.0F);
        armor2.addChild(p29);
        p29.texOffs(40, 13).addBox(-12.0354F, -5.869F, -7.7105F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-10.5616F, -5.869F, -7.7105F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-10.706F, -6.6496F, -7.7105F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-9.891F, -6.6496F, -7.7105F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-9.9766F, -6.6085F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-10.6204F, -6.6085F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-9.9766F, -5.9335F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-10.6204F, -5.9335F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-12.0354F, -5.1156F, -3.8649F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-12.0354F, -5.9656F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-8.5548F, -5.1156F, -3.8649F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p29.texOffs(40, 13).addBox(-8.5548F, -5.9656F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p29.texOffs(40, 13).addBox(-12.1586F, -3.869F, -7.6122F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-12.1586F, -5.744F, -7.6122F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-12.1586F, -5.744F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-12.1586F, -5.119F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-12.1586F, -4.869F, -6.9122F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-12.1586F, -5.3113F, -5.913F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p29.texOffs(40, 13).addBox(-8.4315F, -5.744F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p29.texOffs(40, 13).addBox(-8.4315F, -5.119F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p29.texOffs(40, 13).addBox(-8.4315F, -5.3113F, -5.913F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p29.texOffs(40, 13).addBox(-8.4315F, -5.744F, -7.6122F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p29.texOffs(40, 13).addBox(-8.4315F, -4.869F, -6.9122F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p29.texOffs(40, 13).addBox(-8.4315F, -3.869F, -7.6122F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setPos(-17.4584F, 6.6033F, -10.3641F);
        p29.addChild(cube_r47);
        setRotationAngle(cube_r47, -0.528F, 0.0F, 0.0F);
        cube_r47.texOffs(40, 13).addBox(9.0268F, -12.5473F, -2.9731F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r47.texOffs(40, 13).addBox(5.2997F, -12.5473F, -2.9731F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setPos(-17.4584F, 8.6783F, -2.1543F);
        p29.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.1091F, 0.0F, 0.0F);
        cube_r48.texOffs(40, 13).addBox(9.0268F, -13.8896F, -2.4837F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        cube_r48.texOffs(40, 13).addBox(9.0268F, -13.8896F, -2.1087F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        cube_r48.texOffs(40, 13).addBox(5.2997F, -13.8896F, -2.1087F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r48.texOffs(40, 13).addBox(5.2997F, -13.8896F, -2.4837F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setPos(-17.4584F, 8.4783F, -2.1543F);
        p29.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.3883F, 0.0F, 0.0F);
        cube_r49.texOffs(40, 13).addBox(9.0268F, -13.8896F, 1.6163F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        cube_r49.texOffs(40, 13).addBox(5.2997F, -13.8896F, 1.6163F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setPos(-18.9816F, 5.411F, -4.5874F);
        p29.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, 0.0F, -0.5716F);
        cube_r50.texOffs(40, 13).addBox(12.0256F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r50.texOffs(40, 13).addBox(12.4756F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r51 = new ModelRenderer(this);
        cube_r51.setPos(-0.6085F, 5.411F, -4.5874F);
        p29.addChild(cube_r51);
        setRotationAngle(cube_r51, 0.0F, 0.0F, 0.5716F);
        cube_r51.texOffs(40, 13).addBox(-13.0256F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r51.texOffs(40, 13).addBox(-13.4756F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r52 = new ModelRenderer(this);
        cube_r52.setPos(-1.8195F, 8.6783F, 0.135F);
        p29.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0F, 0.0F, -0.9861F);
        cube_r52.texOffs(40, 13).addBox(7.8042F, -14.002F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r52.texOffs(40, 13).addBox(7.8042F, -14.402F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r53 = new ModelRenderer(this);
        cube_r53.setPos(-1.8195F, 8.6783F, 0.135F);
        p29.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, 0.0F, -0.7854F);
        cube_r53.texOffs(40, 13).addBox(4.4792F, -15.602F, -3.9998F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r54 = new ModelRenderer(this);
        cube_r54.setPos(-17.7706F, 8.6783F, 0.135F);
        p29.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 0.0F, 0.9861F);
        cube_r54.texOffs(40, 13).addBox(-8.8042F, -14.002F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r54.texOffs(40, 13).addBox(-8.8042F, -14.402F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r55 = new ModelRenderer(this);
        cube_r55.setPos(-17.7706F, 8.6783F, 0.135F);
        p29.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, 0.0F, 0.7854F);
        cube_r55.texOffs(40, 13).addBox(-5.4792F, -15.602F, -3.9998F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        armor9 = new ModelRenderer(this);
        armor9.setPos(-1.3652F, 0.1718F, -0.0867F);
        leftarm.addChild(armor9);


        p30 = new ModelRenderer(this);
        p30.setPos(6.8081F, 4.0262F, 2.3423F);
        armor9.addChild(p30);
        p30.texOffs(40, 13).addBox(-7.5095F, -5.3485F, -5.3271F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        p30.texOffs(40, 13).addBox(-8.0332F, -5.3485F, -5.3271F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        p30.texOffs(40, 13).addBox(-8.1565F, -5.3485F, -5.2038F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        p30.texOffs(40, 13).addBox(-8.1565F, -4.3485F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        p30.texOffs(40, 13).addBox(-8.1565F, -5.7985F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        p30.texOffs(66, 16).addBox(-4.3793F, -5.7985F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        p30.texOffs(66, 16).addBox(-4.3793F, -5.3485F, -5.2038F, 1.0F, 4.0F, 4.0F, 0.0F, true);
        p30.texOffs(66, 16).addBox(-4.3793F, -4.3485F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        p30.texOffs(40, 13).addBox(-8.0332F, -5.3485F, -1.5886F, 2.0F, 4.0F, 1.0F, 0.0F, false);
        p30.texOffs(40, 13).addBox(-8.0332F, -5.7985F, -1.5886F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        p30.texOffs(40, 13).addBox(-6.8021F, -6.7729F, -1.5886F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r56 = new ModelRenderer(this);
        cube_r56.setPos(-5.8313F, -5.6892F, -0.4243F);
        p30.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.0F, 0.0F, -0.672F);
        cube_r56.texOffs(40, 13).addBox(-1.082F, -1.4512F, -1.1644F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r56.texOffs(40, 13).addBox(-1.657F, -1.4512F, -1.1644F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r57 = new ModelRenderer(this);
        cube_r57.setPos(-13.4062F, 9.5895F, -2.3557F);
        p30.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.2574F, 0.0F, 0.0F);
        cube_r57.texOffs(66, 16).addBox(9.0268F, -14.7131F, 2.5519F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r57.texOffs(40, 13).addBox(5.2497F, -14.7131F, 2.5519F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        p31 = new ModelRenderer(this);
        p31.setPos(10.712F, 5.0124F, 2.4245F);
        armor9.addChild(p31);
        p31.texOffs(53, 31).addBox(-10.6649F, -7.5872F, -2.5813F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        p31.texOffs(68, 17).addBox(-9.4133F, -6.7729F, -1.5886F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        p31.texOffs(68, 17).addBox(-10.1683F, -6.7729F, -1.5886F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p31.texOffs(68, 17).addBox(-9.4133F, -5.3348F, -1.5886F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        p31.texOffs(68, 17).addBox(-10.1683F, -5.3348F, -1.5886F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r58 = new ModelRenderer(this);
        cube_r58.setPos(-9.9098F, -5.0415F, -0.4243F);
        p31.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, 0.0F, 0.4145F);
        cube_r58.texOffs(68, 17).addBox(-0.7915F, -2.4262F, -1.1644F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        armband5 = new ModelRenderer(this);
        armband5.setPos(-2.2005F, 3.7459F, 0.3654F);
        leftarm.addChild(armband5);


        p32 = new ModelRenderer(this);
        p32.setPos(7.1503F, -0.1644F, -0.0822F);
        armband5.addChild(p32);
        p32.texOffs(8, 12).addBox(-3.7698F, -6.2113F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-3.7698F, -6.6318F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p32.texOffs(12, 7).addBox(-3.7698F, -6.8962F, 0.5643F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-3.7698F, -6.3484F, 0.5643F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-3.7698F, -5.3484F, 0.3143F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p32.texOffs(12, 7).addBox(-7.7798F, -6.8962F, 0.5643F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p32.texOffs(8, 12).addBox(-7.7798F, -6.2113F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p32.texOffs(8, 12).addBox(-7.7798F, -6.6318F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p32.texOffs(8, 12).addBox(-7.7798F, -6.3484F, 0.5643F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p32.texOffs(8, 12).addBox(-7.7798F, -5.3484F, 0.3143F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p32.texOffs(8, 12).addBox(-6.0043F, -7.6769F, 0.7126F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-6.5521F, -7.6769F, 0.7126F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-6.0043F, -5.6477F, 0.7126F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-6.5521F, -5.6477F, 0.7126F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-6.2521F, -4.5977F, 0.7126F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-5.3021F, -4.5977F, 0.7126F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-7.6794F, -6.8962F, 0.7126F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-7.6794F, -5.2518F, 0.7126F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        p32.texOffs(8, 12).addBox(-4.8701F, -6.8962F, 0.7126F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        p32.texOffs(8, 12).addBox(-4.8701F, -5.2518F, 0.7126F, 2.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r59 = new ModelRenderer(this);
        cube_r59.setPos(-5.747F, -1.4801F, -0.301F);
        p32.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.0F, -0.672F);
        cube_r59.texOffs(8, 12).addBox(1.8518F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r59.texOffs(8, 12).addBox(2.0768F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r60 = new ModelRenderer(this);
        cube_r60.setPos(-4.8026F, -1.4801F, -0.301F);
        p32.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.0F, 0.0F, 0.672F);
        cube_r60.texOffs(8, 12).addBox(-2.8518F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r60.texOffs(8, 12).addBox(-3.0768F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r61 = new ModelRenderer(this);
        cube_r61.setPos(-4.997F, -4.7051F, -0.301F);
        p32.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 0.0F, -0.9512F);
        cube_r61.texOffs(8, 12).addBox(2.0018F, -0.5467F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r61.texOffs(8, 12).addBox(2.0018F, -0.9217F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r62 = new ModelRenderer(this);
        cube_r62.setPos(-4.697F, -1.8301F, -0.301F);
        p32.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, 0.0F, -1.0821F);
        cube_r62.texOffs(8, 12).addBox(2.0018F, -1.5217F, 1.0136F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r63 = new ModelRenderer(this);
        cube_r63.setPos(-5.8526F, -1.8301F, -0.301F);
        p32.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0F, 0.0F, 1.0821F);
        cube_r63.texOffs(8, 12).addBox(-3.0018F, -1.5217F, 1.0136F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r64 = new ModelRenderer(this);
        cube_r64.setPos(-5.5526F, -4.7051F, -0.301F);
        p32.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, 0.0F, 0.9512F);
        cube_r64.texOffs(8, 12).addBox(-3.0018F, -0.5467F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r64.texOffs(8, 12).addBox(-3.0018F, -0.9217F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r65 = new ModelRenderer(this);
        cube_r65.setPos(2.247F, -2.3217F, -0.6993F);
        p32.addChild(cube_r65);
        setRotationAngle(cube_r65, -0.8596F, 0.0F, 0.0F);
        cube_r65.texOffs(8, 12).addBox(-10.0268F, -3.095F, -1.9904F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r65.texOffs(8, 12).addBox(-10.0268F, -3.095F, -1.8904F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r65.texOffs(8, 12).addBox(-6.0168F, -3.095F, -1.9904F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r65.texOffs(8, 12).addBox(-6.0168F, -3.095F, -1.8904F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r66 = new ModelRenderer(this);
        cube_r66.setPos(2.247F, -2.0967F, -0.6243F);
        p32.addChild(cube_r66);
        setRotationAngle(cube_r66, -1.3134F, 0.0F, 0.0F);
        cube_r66.texOffs(8, 12).addBox(-10.0268F, -2.37F, -4.3404F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r66.texOffs(8, 12).addBox(-6.0168F, -2.37F, -4.3404F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        p33 = new ModelRenderer(this);
        p33.setPos(7.3147F, -1.0273F, -0.0822F);
        armband5.addChild(p33);
        p33.texOffs(42, 17).addBox(-4.0985F, -5.6415F, -3.2313F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        p33.texOffs(42, 17).addBox(-7.7044F, -5.6415F, -3.3135F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p33.texOffs(42, 17).addBox(-6.1807F, -5.6415F, -3.3135F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        p33.texOffs(42, 17).addBox(-7.7616F, -5.6415F, -3.2313F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        p34 = new ModelRenderer(this);
        p34.setPos(11.6706F, -0.8219F, 0.0F);
        armband5.addChild(p34);
        p34.texOffs(66, 1).addBox(-12.2175F, -5.8415F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        p34.texOffs(66, 1).addBox(-10.3794F, -5.8415F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        p34.texOffs(66, 1).addBox(-10.3794F, -6.5665F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        p34.texOffs(66, 1).addBox(-12.2175F, -6.5665F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, false);
        p34.texOffs(64, -3).addBox(-7.3826F, -5.8415F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, false);
        p34.texOffs(62, -3).addBox(-7.3826F, -6.5665F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, false);
        p34.texOffs(62, -3).addBox(-12.2076F, -6.5665F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, true);
        p34.texOffs(64, -3).addBox(-12.2076F, -5.8415F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, true);

        arm2 = new ModelRenderer(this);
        arm2.setPos(3.5348F, -18.0282F, -0.0867F);
        leftarm.addChild(arm2);
        arm2.texOffs(39, -1).addBox(-6.2233F, 20.6245F, -0.9271F, 0.0F, 1.0F, 2.0F, 0.0F, false);
        arm2.texOffs(39, -1).addBox(-6.2233F, 20.6245F, -2.3789F, 0.0F, 1.0F, 2.0F, 0.0F, false);
        arm2.texOffs(35, 18).addBox(-6.2251F, 21.6228F, -0.8449F, 1.0F, 0.0F, 2.0F, 0.0F, false);
        arm2.texOffs(35, 18).addBox(-6.2251F, 21.6228F, -2.5433F, 1.0F, 0.0F, 2.0F, 0.0F, false);
        arm2.texOffs(35, 18).addBox(-4.168F, 20.6228F, -1.7627F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        arm2.texOffs(35, 18).addBox(-5.648F, 20.6228F, -1.7627F, 2.0F, 1.0F, 3.0F, 0.0F, false);
        arm2.texOffs(35, 18).addBox(-5.6071F, 20.6228F, -2.7077F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        arm2.texOffs(35, 18).addBox(-4.0729F, 20.6228F, -2.5844F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r67 = new ModelRenderer(this);
        cube_r67.setPos(4.194F, 33.0879F, 4.7059F);
        arm2.addChild(cube_r67);
        setRotationAngle(cube_r67, 0.0F, -0.5367F, 0.0F);
        cube_r67.texOffs(35, 18).addBox(-9.0954F, -12.4651F, -1.2311F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r67.texOffs(35, 18).addBox(-9.0954F, -12.4651F, -1.3561F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        LeftArm = new ModelRenderer(this);
        LeftArm.setPos(5.0F, 2.0F, 0.0F);
        LeftArm.texOffs(121, 9).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

        rightarm = new ModelRenderer(this);
        rightarm.setPos(0.675F, 6.775F, 0.7F);
        LeftArm.addChild(rightarm);


        shoulderpad3 = new ModelRenderer(this);
        shoulderpad3.setPos(-3.6848F, -4.4783F, 0.3243F);
        rightarm.addChild(shoulderpad3);
        shoulderpad3.texOffs(6, 13).addBox(2.2784F, -4.6771F, -3.5046F, 3.0F, 0.0F, 2.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(2.2784F, -4.6771F, -1.5483F, 3.0F, 0.0F, 3.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(4.3644F, -4.6771F, -3.5046F, 2.0F, 0.0F, 2.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(4.3644F, -4.6771F, -1.5483F, 2.0F, 0.0F, 3.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.4877F, -4.6788F, -1.6733F, 1.0F, 1.0F, 3.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.4877F, -4.6788F, -3.3796F, 1.0F, 1.0F, 3.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.4877F, -4.417F, -1.6733F, 1.0F, 2.0F, 3.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.4877F, -4.417F, -3.3796F, 1.0F, 2.0F, 3.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.3644F, -4.6788F, -3.5028F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.3644F, -3.4538F, -3.5028F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(3.4426F, -4.6788F, -3.5028F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(17, 31).addBox(2.2784F, -4.6788F, -3.5028F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(17, 31).addBox(2.2784F, -4.6788F, 0.4543F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.3644F, -3.4538F, 0.4543F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(5.3644F, -4.6788F, 0.4543F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(3.4426F, -4.6788F, 0.4543F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(6.4877F, -3.2252F, -1.8561F, 0.0F, 2.0F, 2.0F, 0.0F, true);
        shoulderpad3.texOffs(6, 13).addBox(6.4877F, -3.2252F, -2.1968F, 0.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r68 = new ModelRenderer(this);
        cube_r68.setPos(-1.9776F, 8.1852F, -1.7714F);
        shoulderpad3.addChild(cube_r68);
        setRotationAngle(cube_r68, -0.7854F, 0.0F, 0.0F);
        cube_r68.texOffs(6, 13).addBox(8.4653F, -9.0132F, -6.3011F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r68.texOffs(6, 13).addBox(8.4653F, -9.6981F, -6.3011F, 0.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r69 = new ModelRenderer(this);
        cube_r69.setPos(-1.9776F, 8.1852F, -0.2815F);
        shoulderpad3.addChild(cube_r69);
        setRotationAngle(cube_r69, 0.7854F, 0.0F, 0.0F);
        cube_r69.texOffs(6, 13).addBox(8.4653F, -9.0132F, 5.3011F, 0.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r69.texOffs(6, 13).addBox(8.4653F, -9.6981F, 5.3011F, 0.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r70 = new ModelRenderer(this);
        cube_r70.setPos(2.9971F, -1.3502F, -1.6688F);
        shoulderpad3.addChild(cube_r70);
        setRotationAngle(cube_r70, 0.0F, 0.0F, 0.2356F);
        cube_r70.texOffs(6, 13).addBox(0.0477F, -3.0811F, 2.1231F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r70.texOffs(6, 13).addBox(-0.2773F, -2.6311F, 2.1231F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r70.texOffs(6, 13).addBox(0.0477F, -2.6311F, 2.1231F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r70.texOffs(6, 13).addBox(-0.2773F, -2.6311F, -1.834F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r70.texOffs(6, 13).addBox(0.0477F, -3.0811F, -1.834F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r70.texOffs(6, 13).addBox(0.0477F, -2.6311F, -1.834F, 2.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r71 = new ModelRenderer(this);
        cube_r71.setPos(2.9971F, -1.3502F, -1.6688F);
        shoulderpad3.addChild(cube_r71);
        setRotationAngle(cube_r71, 0.0F, 0.0F, 0.6807F);
        cube_r71.texOffs(6, 13).addBox(-1.9523F, -2.3561F, 2.1231F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r71.texOffs(6, 13).addBox(-2.0273F, -2.3561F, 2.1231F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r71.texOffs(6, 13).addBox(-2.0273F, -2.3561F, -1.834F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r71.texOffs(6, 13).addBox(-1.9523F, -2.3561F, -1.834F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        armor6 = new ModelRenderer(this);
        armor6.setPos(2.2005F, -0.0347F, 4.6391F);
        rightarm.addChild(armor6);


        p21 = new ModelRenderer(this);
        p21.setPos(-8.0543F, -0.2877F, 0.452F);
        armor6.addChild(p21);
        p21.texOffs(9, 12).addBox(3.9904F, -5.1156F, -4.4402F, 4.0F, 2.0F, 1.0F, 0.0F, true);

        p22 = new ModelRenderer(this);
        p22.setPos(-11.6706F, -0.2877F, 0.0F);
        armor6.addChild(p22);
        p22.texOffs(40, 13).addBox(10.0354F, -5.869F, -7.7105F, 2.0F, 3.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(7.5616F, -5.869F, -7.7105F, 3.0F, 3.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(9.706F, -6.6496F, -7.7105F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(8.891F, -6.6496F, -7.7105F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(8.9766F, -6.6085F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(9.6204F, -6.6085F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(8.9766F, -5.9335F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(9.6204F, -5.9335F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(11.0354F, -5.1156F, -3.8649F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(11.0354F, -5.9656F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(7.5548F, -5.1156F, -3.8649F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p22.texOffs(40, 13).addBox(7.5548F, -5.9656F, -3.8649F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p22.texOffs(40, 13).addBox(11.1586F, -3.869F, -7.6122F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(11.1586F, -5.744F, -7.6122F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(11.1586F, -5.744F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(11.1586F, -5.119F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(11.1586F, -4.869F, -6.9122F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(11.1586F, -5.3113F, -5.913F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p22.texOffs(40, 13).addBox(7.4315F, -5.744F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p22.texOffs(40, 13).addBox(7.4315F, -5.119F, -4.0622F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p22.texOffs(40, 13).addBox(7.4315F, -5.3113F, -5.913F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p22.texOffs(40, 13).addBox(7.4315F, -5.744F, -7.6122F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p22.texOffs(40, 13).addBox(7.4315F, -4.869F, -6.9122F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p22.texOffs(40, 13).addBox(7.4315F, -3.869F, -7.6122F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r72 = new ModelRenderer(this);
        cube_r72.setPos(17.4584F, 6.6033F, -10.3641F);
        p22.addChild(cube_r72);
        setRotationAngle(cube_r72, -0.528F, 0.0F, 0.0F);
        cube_r72.texOffs(40, 13).addBox(-10.0268F, -12.5473F, -2.9731F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r72.texOffs(40, 13).addBox(-6.2997F, -12.5473F, -2.9731F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r73 = new ModelRenderer(this);
        cube_r73.setPos(17.4584F, 8.6783F, -2.1543F);
        p22.addChild(cube_r73);
        setRotationAngle(cube_r73, 0.1091F, 0.0F, 0.0F);
        cube_r73.texOffs(40, 13).addBox(-10.0268F, -13.8896F, -2.4837F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        cube_r73.texOffs(40, 13).addBox(-10.0268F, -13.8896F, -2.1087F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r73.texOffs(40, 13).addBox(-6.2997F, -13.8896F, -2.1087F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        cube_r73.texOffs(40, 13).addBox(-6.2997F, -13.8896F, -2.4837F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r74 = new ModelRenderer(this);
        cube_r74.setPos(17.4584F, 8.4783F, -2.1543F);
        p22.addChild(cube_r74);
        setRotationAngle(cube_r74, 0.3883F, 0.0F, 0.0F);
        cube_r74.texOffs(40, 13).addBox(-10.0268F, -13.8896F, 1.6163F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r74.texOffs(40, 13).addBox(-6.2997F, -13.8896F, 1.6163F, 1.0F, 2.0F, 2.0F, 0.0F, true);

        cube_r75 = new ModelRenderer(this);
        cube_r75.setPos(18.9816F, 5.411F, -4.5874F);
        p22.addChild(cube_r75);
        setRotationAngle(cube_r75, 0.0F, 0.0F, 0.5716F);
        cube_r75.texOffs(40, 13).addBox(-13.0256F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r75.texOffs(40, 13).addBox(-13.4756F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r76 = new ModelRenderer(this);
        cube_r76.setPos(0.6085F, 5.411F, -4.5874F);
        p22.addChild(cube_r76);
        setRotationAngle(cube_r76, 0.0F, 0.0F, -0.5716F);
        cube_r76.texOffs(40, 13).addBox(12.0256F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r76.texOffs(40, 13).addBox(12.4756F, -5.6683F, -3.1231F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r77 = new ModelRenderer(this);
        cube_r77.setPos(1.8195F, 8.6783F, 0.135F);
        p22.addChild(cube_r77);
        setRotationAngle(cube_r77, 0.0F, 0.0F, 0.9861F);
        cube_r77.texOffs(40, 13).addBox(-8.8042F, -14.002F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r77.texOffs(40, 13).addBox(-8.8042F, -14.402F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r78 = new ModelRenderer(this);
        cube_r78.setPos(1.8195F, 8.6783F, 0.135F);
        p22.addChild(cube_r78);
        setRotationAngle(cube_r78, 0.0F, 0.0F, 0.7854F);
        cube_r78.texOffs(40, 13).addBox(-5.4792F, -15.602F, -3.9998F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r79 = new ModelRenderer(this);
        cube_r79.setPos(17.7706F, 8.6783F, 0.135F);
        p22.addChild(cube_r79);
        setRotationAngle(cube_r79, 0.0F, 0.0F, -0.9861F);
        cube_r79.texOffs(40, 13).addBox(7.8042F, -14.002F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r79.texOffs(40, 13).addBox(7.8042F, -14.402F, -3.9998F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r80 = new ModelRenderer(this);
        cube_r80.setPos(17.7706F, 8.6783F, 0.135F);
        p22.addChild(cube_r80);
        setRotationAngle(cube_r80, 0.0F, 0.0F, -0.7854F);
        cube_r80.texOffs(40, 13).addBox(4.4792F, -15.602F, -3.9998F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        armor7 = new ModelRenderer(this);
        armor7.setPos(1.3652F, 0.1718F, -0.0867F);
        rightarm.addChild(armor7);


        p23 = new ModelRenderer(this);
        p23.setPos(-6.8081F, 4.0262F, 2.3423F);
        armor7.addChild(p23);
        p23.texOffs(40, 13).addBox(3.5095F, -5.3485F, -5.3271F, 4.0F, 4.0F, 1.0F, 0.0F, true);
        p23.texOffs(40, 13).addBox(7.0332F, -5.3485F, -5.3271F, 1.0F, 4.0F, 1.0F, 0.0F, true);
        p23.texOffs(40, 13).addBox(7.1565F, -5.3485F, -5.2038F, 1.0F, 4.0F, 4.0F, 0.0F, true);
        p23.texOffs(40, 13).addBox(7.1565F, -4.3485F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        p23.texOffs(40, 13).addBox(7.1565F, -5.7985F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        p23.texOffs(66, 16).addBox(3.3793F, -5.7985F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        p23.texOffs(66, 16).addBox(3.3793F, -5.3485F, -5.2038F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        p23.texOffs(66, 16).addBox(3.3793F, -4.3485F, -1.7038F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        p23.texOffs(40, 13).addBox(6.0332F, -5.3485F, -1.5886F, 2.0F, 4.0F, 1.0F, 0.0F, true);
        p23.texOffs(40, 13).addBox(6.0332F, -5.7985F, -1.5886F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        p23.texOffs(40, 13).addBox(5.8021F, -6.7729F, -1.5886F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r81 = new ModelRenderer(this);
        cube_r81.setPos(5.8313F, -5.6892F, -0.4243F);
        p23.addChild(cube_r81);
        setRotationAngle(cube_r81, 0.0F, 0.0F, 0.672F);
        cube_r81.texOffs(40, 13).addBox(0.082F, -1.4512F, -1.1644F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r81.texOffs(40, 13).addBox(0.657F, -1.4512F, -1.1644F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r82 = new ModelRenderer(this);
        cube_r82.setPos(13.4062F, 9.5895F, -2.3557F);
        p23.addChild(cube_r82);
        setRotationAngle(cube_r82, 0.2574F, 0.0F, 0.0F);
        cube_r82.texOffs(66, 16).addBox(-10.0268F, -14.7131F, 2.5519F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r82.texOffs(40, 13).addBox(-6.2497F, -14.7131F, 2.5519F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        p24 = new ModelRenderer(this);
        p24.setPos(-10.712F, 5.0124F, 2.4245F);
        armor7.addChild(p24);
        p24.texOffs(53, 31).addBox(9.6649F, -7.5872F, -2.5813F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        p24.texOffs(68, 17).addBox(7.4133F, -6.7729F, -1.5886F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        p24.texOffs(68, 17).addBox(9.1683F, -6.7729F, -1.5886F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p24.texOffs(68, 17).addBox(7.4133F, -5.3348F, -1.5886F, 2.0F, 3.0F, 1.0F, 0.0F, true);
        p24.texOffs(68, 17).addBox(9.1683F, -5.3348F, -1.5886F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        cube_r83 = new ModelRenderer(this);
        cube_r83.setPos(9.9098F, -5.0415F, -0.4243F);
        p24.addChild(cube_r83);
        setRotationAngle(cube_r83, 0.0F, 0.0F, -0.4145F);
        cube_r83.texOffs(68, 17).addBox(-1.2085F, -2.4262F, -1.1644F, 2.0F, 1.0F, 1.0F, 0.0F, true);

        armband4 = new ModelRenderer(this);
        armband4.setPos(2.2005F, 3.7459F, 0.3654F);
        rightarm.addChild(armband4);


        p25 = new ModelRenderer(this);
        p25.setPos(-7.1503F, -0.1644F, -0.0822F);
        armband4.addChild(p25);
        p25.texOffs(8, 12).addBox(2.7698F, -6.2113F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(2.7698F, -6.6318F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p25.texOffs(12, 7).addBox(2.7698F, -6.8962F, 0.5643F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(2.7698F, -6.3484F, 0.5643F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(2.7698F, -5.3484F, 0.3143F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        p25.texOffs(12, 7).addBox(6.7798F, -6.8962F, 0.5643F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p25.texOffs(8, 12).addBox(6.7798F, -6.2113F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p25.texOffs(8, 12).addBox(6.7798F, -6.6318F, -0.4116F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p25.texOffs(8, 12).addBox(6.7798F, -6.3484F, 0.5643F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        p25.texOffs(8, 12).addBox(6.7798F, -5.3484F, 0.3143F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        p25.texOffs(8, 12).addBox(4.0043F, -7.6769F, 0.7126F, 2.0F, 3.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(5.5521F, -7.6769F, 0.7126F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(4.0043F, -5.6477F, 0.7126F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(5.5521F, -5.6477F, 0.7126F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(5.2521F, -4.5977F, 0.7126F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(4.3021F, -4.5977F, 0.7126F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(5.6794F, -6.8962F, 0.7126F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(5.6794F, -5.2518F, 0.7126F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        p25.texOffs(8, 12).addBox(2.8701F, -6.8962F, 0.7126F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        p25.texOffs(8, 12).addBox(2.8701F, -5.2518F, 0.7126F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r84 = new ModelRenderer(this);
        cube_r84.setPos(5.747F, -1.4801F, -0.301F);
        p25.addChild(cube_r84);
        setRotationAngle(cube_r84, 0.0F, 0.0F, 0.672F);
        cube_r84.texOffs(8, 12).addBox(-2.8518F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r84.texOffs(8, 12).addBox(-3.0768F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r85 = new ModelRenderer(this);
        cube_r85.setPos(4.8026F, -1.4801F, -0.301F);
        p25.addChild(cube_r85);
        setRotationAngle(cube_r85, 0.0F, 0.0F, -0.672F);
        cube_r85.texOffs(8, 12).addBox(1.8518F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r85.texOffs(8, 12).addBox(2.0768F, -0.9717F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r86 = new ModelRenderer(this);
        cube_r86.setPos(4.997F, -4.7051F, -0.301F);
        p25.addChild(cube_r86);
        setRotationAngle(cube_r86, 0.0F, 0.0F, 0.9512F);
        cube_r86.texOffs(8, 12).addBox(-3.0018F, -0.5467F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r86.texOffs(8, 12).addBox(-3.0018F, -0.9217F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r87 = new ModelRenderer(this);
        cube_r87.setPos(4.697F, -1.8301F, -0.301F);
        p25.addChild(cube_r87);
        setRotationAngle(cube_r87, 0.0F, 0.0F, 1.0821F);
        cube_r87.texOffs(8, 12).addBox(-3.0018F, -1.5217F, 1.0136F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r88 = new ModelRenderer(this);
        cube_r88.setPos(5.8526F, -1.8301F, -0.301F);
        p25.addChild(cube_r88);
        setRotationAngle(cube_r88, 0.0F, 0.0F, -1.0821F);
        cube_r88.texOffs(8, 12).addBox(2.0018F, -1.5217F, 1.0136F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r89 = new ModelRenderer(this);
        cube_r89.setPos(5.5526F, -4.7051F, -0.301F);
        p25.addChild(cube_r89);
        setRotationAngle(cube_r89, 0.0F, 0.0F, -0.9512F);
        cube_r89.texOffs(8, 12).addBox(2.0018F, -0.5467F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r89.texOffs(8, 12).addBox(2.0018F, -0.9217F, 1.0136F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r90 = new ModelRenderer(this);
        cube_r90.setPos(-2.247F, -2.3217F, -0.6993F);
        p25.addChild(cube_r90);
        setRotationAngle(cube_r90, -0.8596F, 0.0F, 0.0F);
        cube_r90.texOffs(8, 12).addBox(9.0268F, -3.095F, -1.9904F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r90.texOffs(8, 12).addBox(9.0268F, -3.095F, -1.8904F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r90.texOffs(8, 12).addBox(5.0168F, -3.095F, -1.9904F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r90.texOffs(8, 12).addBox(5.0168F, -3.095F, -1.8904F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r91 = new ModelRenderer(this);
        cube_r91.setPos(-2.247F, -2.0967F, -0.6243F);
        p25.addChild(cube_r91);
        setRotationAngle(cube_r91, -1.3134F, 0.0F, 0.0F);
        cube_r91.texOffs(8, 12).addBox(9.0268F, -2.37F, -4.3404F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r91.texOffs(8, 12).addBox(5.0168F, -2.37F, -4.3404F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        p26 = new ModelRenderer(this);
        p26.setPos(-7.3147F, -1.0273F, -0.0822F);
        armband4.addChild(p26);
        p26.texOffs(42, 17).addBox(3.0985F, -5.6415F, -3.2313F, 1.0F, 1.0F, 4.0F, 0.0F, true);
        p26.texOffs(42, 17).addBox(4.7044F, -5.6415F, -3.3135F, 3.0F, 1.0F, 1.0F, 0.0F, true);
        p26.texOffs(42, 17).addBox(3.1807F, -5.6415F, -3.3135F, 3.0F, 1.0F, 1.0F, 0.0F, true);
        p26.texOffs(42, 17).addBox(6.7616F, -5.6415F, -3.2313F, 1.0F, 1.0F, 4.0F, 0.0F, true);

        p27 = new ModelRenderer(this);
        p27.setPos(-11.6706F, -0.8219F, 0.0F);
        armband4.addChild(p27);
        p27.texOffs(66, 1).addBox(9.2175F, -5.8415F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, true);
        p27.texOffs(66, 1).addBox(7.3794F, -5.8415F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, true);
        p27.texOffs(66, 1).addBox(7.3794F, -6.5665F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, true);
        p27.texOffs(66, 1).addBox(9.2175F, -6.5665F, -3.4778F, 3.0F, 1.0F, 0.0F, 0.0F, true);
        p27.texOffs(64, -3).addBox(7.3826F, -5.8415F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, true);
        p27.texOffs(62, -3).addBox(7.3826F, -6.5665F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, true);
        p27.texOffs(62, -3).addBox(12.2076F, -6.5665F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, false);
        p27.texOffs(64, -3).addBox(12.2076F, -5.8415F, -3.4628F, 0.0F, 1.0F, 4.0F, 0.0F, false);

        arm3 = new ModelRenderer(this);
        arm3.setPos(-3.5348F, -18.0282F, -0.0867F);
        rightarm.addChild(arm3);
        arm3.texOffs(39, -1).addBox(6.2233F, 20.6245F, -0.9271F, 0.0F, 1.0F, 2.0F, 0.0F, true);
        arm3.texOffs(39, -1).addBox(6.2233F, 20.6245F, -2.3789F, 0.0F, 1.0F, 2.0F, 0.0F, true);
        arm3.texOffs(35, 18).addBox(5.2251F, 21.6228F, -0.8449F, 1.0F, 0.0F, 2.0F, 0.0F, true);
        arm3.texOffs(35, 18).addBox(5.2251F, 21.6228F, -2.5433F, 1.0F, 0.0F, 2.0F, 0.0F, true);
        arm3.texOffs(35, 18).addBox(3.168F, 20.6228F, -1.7627F, 1.0F, 1.0F, 3.0F, 0.0F, true);
        arm3.texOffs(35, 18).addBox(3.648F, 20.6228F, -1.7627F, 2.0F, 1.0F, 3.0F, 0.0F, true);
        arm3.texOffs(35, 18).addBox(2.6071F, 20.6228F, -2.7077F, 3.0F, 1.0F, 1.0F, 0.0F, true);
        arm3.texOffs(35, 18).addBox(2.0729F, 20.6228F, -2.5844F, 2.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r92 = new ModelRenderer(this);
        cube_r92.setPos(-4.194F, 33.0879F, 4.7059F);
        arm3.addChild(cube_r92);
        setRotationAngle(cube_r92, 0.0F, 0.5367F, 0.0F);
        cube_r92.texOffs(35, 18).addBox(8.0954F, -12.4651F, -1.2311F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r92.texOffs(35, 18).addBox(8.0954F, -12.4651F, -1.3561F, 1.0F, 1.0F, 1.0F, 0.0F, true);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){

        this.RightArm3.copyFrom(this.rightArm);
        this.LeftArm.copyFrom(this.leftArm);
        this.Body.copyFrom(this.body);

        RightArm3.render(matrixStack, buffer, packedLight, packedOverlay);
        LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
