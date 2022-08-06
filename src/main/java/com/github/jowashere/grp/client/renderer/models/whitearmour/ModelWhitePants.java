package com.github.jowashere.grp.client.renderer.models.whitearmour;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class ModelWhitePants<T extends LivingEntity> extends BipedModel<T> {

    private final ModelRenderer RightLeg;
    private final ModelRenderer leftleg;
    private final ModelRenderer armor5;
    private final ModelRenderer box1;
    private final ModelRenderer box2;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer box3;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;
    private final ModelRenderer cube_r11;
    private final ModelRenderer armor8;
    private final ModelRenderer cube_r12;
    private final ModelRenderer cube_r13;
    private final ModelRenderer cube_r14;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;
    private final ModelRenderer cube_r17;
    private final ModelRenderer cube_r18;
    private final ModelRenderer armband3;
    private final ModelRenderer box4;
    private final ModelRenderer cube_r19;
    private final ModelRenderer cube_r20;
    private final ModelRenderer cube_r21;
    private final ModelRenderer cube_r22;
    private final ModelRenderer cube_r23;
    private final ModelRenderer cube_r24;
    private final ModelRenderer cube_r25;
    private final ModelRenderer box5;
    private final ModelRenderer box6;
    private final ModelRenderer LeftLeg;
    private final ModelRenderer rightleg;
    private final ModelRenderer armor3;
    private final ModelRenderer box7;
    private final ModelRenderer box8;
    private final ModelRenderer cube_r26;
    private final ModelRenderer cube_r27;
    private final ModelRenderer cube_r28;
    private final ModelRenderer cube_r29;
    private final ModelRenderer cube_r30;
    private final ModelRenderer cube_r31;
    private final ModelRenderer cube_r32;
    private final ModelRenderer box9;
    private final ModelRenderer cube_r33;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer armor4;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;
    private final ModelRenderer cube_r43;
    private final ModelRenderer armband2;
    private final ModelRenderer box10;
    private final ModelRenderer cube_r44;
    private final ModelRenderer cube_r45;
    private final ModelRenderer cube_r46;
    private final ModelRenderer cube_r47;
    private final ModelRenderer cube_r48;
    private final ModelRenderer cube_r49;
    private final ModelRenderer cube_r50;
    private final ModelRenderer box11;
    private final ModelRenderer box12;

    public ModelWhitePants() {

        super(1F);

        texWidth = 300;
        texHeight = 300;

        RightLeg = new ModelRenderer(this);
        RightLeg.setPos(-1.9F, 12.0F, 0.0F);
        RightLeg.texOffs(266, 12).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, true);

        leftleg = new ModelRenderer(this);
        leftleg.setPos(2.0F, 0.05F, 0.675F);
        RightLeg.addChild(leftleg);

        armor5 = new ModelRenderer(this);
        armor5.setPos(-6.8759F, 9.7457F, 5.0509F);
        leftleg.addChild(armor5);


        box1 = new ModelRenderer(this);
        box1.setPos(12.9642F, 0.4051F, 0.0F);
        armor5.addChild(box1);
        box1.texOffs(165, 17).addBox(-10.2504F, -7.1117F, -4.3993F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        box1.texOffs(165, 17).addBox(-10.2504F, -8.3117F, -4.3993F, 4.0F, 2.0F, 1.0F, 0.0F, false);

        box2 = new ModelRenderer(this);
        box2.setPos(8.2647F, -6.2795F, -7.4139F);
        armor5.addChild(box2);
        box2.texOffs(185, 17).addBox(-4.7129F, -2.5155F, 3.1611F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        box2.texOffs(185, 17).addBox(-3.0629F, -2.5155F, 3.1611F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box2.texOffs(185, 17).addBox(-5.6462F, -1.402F, 3.1611F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        box2.texOffs(185, 17).addBox(-5.6462F, -2.202F, 3.1611F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box2.texOffs(185, 17).addBox(-2.1315F, -1.402F, 3.1611F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        box2.texOffs(185, 17).addBox(-2.1315F, -2.202F, 3.1611F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box2.texOffs(185, 17).addBox(-5.6462F, -1.9692F, -0.7125F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        box2.texOffs(185, 17).addBox(-5.6462F, -2.5192F, -0.7125F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        box2.texOffs(185, 17).addBox(-3.6749F, -3.5782F, -0.7125F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box2.texOffs(194, 33).addBox(-5.7677F, -0.3678F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box2.texOffs(190, 19).addBox(-5.7677F, -0.7419F, -0.5565F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box2.texOffs(190, 19).addBox(-5.7677F, -2.5169F, -0.5565F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box2.texOffs(190, 19).addBox(-5.7677F, -2.1928F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r1 = new ModelRenderer(this);
        cube_r1.setPos(0.0257F, -1.5643F, 2.5487F);
        box2.addChild(cube_r1);
        setRotationAngle(cube_r1, -0.1178F, 0.0F, 0.0F);
        cube_r1.texOffs(190, 19).addBox(-5.7934F, -0.7026F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r1.texOffs(190, 19).addBox(-5.7934F, -0.7026F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r2 = new ModelRenderer(this);
        cube_r2.setPos(0.0257F, -0.2643F, 2.2487F);
        box2.addChild(cube_r2);
        setRotationAngle(cube_r2, -0.1178F, 0.0F, 0.0F);
        cube_r2.texOffs(190, 19).addBox(-5.7934F, -1.2026F, -2.2301F, 1.0F, 3.0F, 2.0F, 0.0F, false);
        cube_r2.texOffs(190, 19).addBox(-5.7934F, -1.2026F, -1.0801F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r3 = new ModelRenderer(this);
        cube_r3.setPos(-3.3493F, 0.8829F, -0.2263F);
        box2.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4931F);
        cube_r3.texOffs(185, 17).addBox(-0.4065F, -4.0823F, -0.4862F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r3.texOffs(185, 17).addBox(-0.1815F, -4.0823F, -0.4862F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r4 = new ModelRenderer(this);
        cube_r4.setPos(-8.7287F, 11.9693F, 7.1186F);
        box2.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
        cube_r4.texOffs(185, 17).addBox(-5.3762F, -14.7194F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r5 = new ModelRenderer(this);
        cube_r5.setPos(-2.4846F, -0.0307F, 7.1186F);
        box2.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, 0.0F, -1.2392F);
        cube_r5.texOffs(185, 17).addBox(1.4907F, -0.4178F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r6 = new ModelRenderer(this);
        cube_r6.setPos(-4.293F, -0.0307F, 7.1186F);
        box2.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.0F, 1.2392F);
        cube_r6.texOffs(185, 17).addBox(-2.4907F, -0.4178F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r7 = new ModelRenderer(this);
        cube_r7.setPos(1.9511F, 11.9693F, 7.1186F);
        box2.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
        cube_r7.texOffs(185, 17).addBox(4.3762F, -14.7194F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        box3 = new ModelRenderer(this);
       box3.setPos(12.235F, -5.3072F, -5.5098F);
        armor5.addChild(box3);
       box3.texOffs(218, 19).addBox(-7.116F, -2.9415F, -2.6976F, 2.0F, 3.0F, 1.0F, 0.0F, false);
       box3.texOffs(218, 19).addBox(-7.116F, -3.4915F, -2.6976F, 2.0F, 1.0F, 1.0F, 0.0F, false);
       box3.texOffs(207, 0).addBox(-7.591F, -4.4915F, -2.6976F, 1.0F, 1.0F, 1.0F, 0.0F, false);
       box3.texOffs(221, 24).addBox(-5.9802F, -1.3401F, 1.045F, 1.0F, 2.0F, 1.0F, 0.0F, true);
       box3.texOffs(217, 10).addBox(-5.9802F, -3.4892F, -2.4606F, 1.0F, 2.0F, 1.0F, 0.0F, true);
       box3.texOffs(217, 10).addBox(-5.9802F, -1.7142F, -2.4606F, 1.0F, 2.0F, 1.0F, 0.0F, true);
       box3.texOffs(217, 10).addBox(-5.9802F, -3.1651F, 1.045F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r8 = new ModelRenderer(this);
        cube_r8.setPos(-10.7736F, -2.5367F, 0.6445F);
        box3.addChild(cube_r8);
        setRotationAngle(cube_r8, -0.1178F, 0.0F, 0.0F);
        cube_r8.texOffs(217, 10).addBox(4.7934F, -0.7026F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r8.texOffs(217, 10).addBox(4.7934F, -0.7026F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r9 = new ModelRenderer(this);
        cube_r9.setPos(-10.7736F, -1.2367F, 0.3445F);
        box3.addChild(cube_r9);
        setRotationAngle(cube_r9, -0.1178F, 0.0F, 0.0F);
        cube_r9.texOffs(217, 10).addBox(4.7934F, -1.2026F, -2.2301F, 1.0F, 3.0F, 2.0F, 0.0F, true);
        cube_r9.texOffs(217, 10).addBox(4.7934F, -1.2026F, -1.0801F, 1.0F, 3.0F, 2.0F, 0.0F, true);

        cube_r10 = new ModelRenderer(this);
        cube_r10.setPos(-5.2778F, -0.3299F, -2.1865F);
        box3.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.4974F);
        cube_r10.texOffs(218, 19).addBox(-3.0855F, -2.8629F, -0.5112F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r10.texOffs(218, 19).addBox(-2.3605F, -2.8629F, -0.5112F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r11 = new ModelRenderer(this);
        cube_r11.setPos(-5.2778F, 2.3201F, -2.1865F);
        box3.addChild(cube_r11);
        setRotationAngle(cube_r11, 0.0F, 0.0F, 0.4974F);
        cube_r11.texOffs(218, 19).addBox(-2.3605F, -2.8629F, -0.5112F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        armor8 = new ModelRenderer(this);
        armor8.setPos(-1.9333F, 4.4385F, -2.3631F);
        leftleg.addChild(armor8);
        armor8.texOffs(157, 17).addBox(-1.7987F, 3.0159F, -0.6875F, 4.0F, 2.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-2.3237F, 3.0159F, -0.6875F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-1.7987F, 4.4909F, -0.6875F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-2.3237F, 4.4909F, -0.6875F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-2.3241F, 3.0011F, 3.1611F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-2.3241F, 2.5011F, 3.1611F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-1.2741F, 2.8261F, 3.1611F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(1.1906F, 3.0011F, 3.1611F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        armor8.texOffs(157, 17).addBox(1.1906F, 2.5011F, 3.1611F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor8.texOffs(157, 17).addBox(-0.2741F, 2.2011F, 3.1611F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-0.8491F, 2.2011F, 3.1611F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-2.4456F, 3.1631F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armor8.texOffs(161, 33).addBox(-2.4456F, 2.6381F, 2.9491F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-2.4456F, 3.4872F, -0.5815F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(-2.4456F, 3.0122F, -0.5815F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor8.texOffs(157, 17).addBox(1.3122F, 3.4872F, -0.5815F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        armor8.texOffs(157, 17).addBox(1.3122F, 3.1631F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        armor8.texOffs(161, 33).addBox(1.3122F, 2.6381F, 2.9491F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor8.texOffs(157, 17).addBox(1.3122F, 3.0122F, -0.5815F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r12 = new ModelRenderer(this);
        cube_r12.setPos(-3.4812F, 4.5347F, 2.2487F);
        armor8.addChild(cube_r12);
        setRotationAngle(cube_r12, 0.1178F, 0.0F, 0.0F);
        cube_r12.texOffs(157, 17).addBox(4.7934F, -1.7974F, -2.2301F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        cube_r12.texOffs(157, 17).addBox(4.7934F, -1.7974F, -1.0801F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        cube_r12.texOffs(157, 17).addBox(1.0356F, -1.7974F, -1.0801F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r12.texOffs(157, 17).addBox(1.0356F, -1.7974F, -2.2301F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        cube_r13 = new ModelRenderer(this);
        cube_r13.setPos(-3.4812F, 4.5347F, 2.5487F);
        armor8.addChild(cube_r13);
        setRotationAngle(cube_r13, 0.1178F, 0.0F, 0.0F);
        cube_r13.texOffs(157, 17).addBox(4.7934F, -0.2974F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r13.texOffs(157, 17).addBox(4.7934F, -0.2974F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r13.texOffs(157, 17).addBox(1.0356F, -0.2974F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r13.texOffs(157, 17).addBox(1.0356F, -0.2974F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r14 = new ModelRenderer(this);
        cube_r14.setPos(-4.3062F, 2.7347F, -0.3763F);
        armor8.addChild(cube_r14);
        setRotationAngle(cube_r14, 0.0F, 0.0F, 0.2705F);
        cube_r14.texOffs(157, 17).addBox(4.6968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r15 = new ModelRenderer(this);
        cube_r15.setPos(4.1728F, 2.7347F, -0.3763F);
        armor8.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -0.2705F);
        cube_r15.texOffs(157, 17).addBox(-5.6968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r15.texOffs(157, 17).addBox(-5.7968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r16 = new ModelRenderer(this);
        cube_r16.setPos(-4.6562F, 4.6597F, -0.3763F);
        armor8.addChild(cube_r16);
        setRotationAngle(cube_r16, 0.0F, 0.0F, 0.2051F);
        cube_r16.texOffs(157, 17).addBox(3.7968F, -2.8586F, 3.5375F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r17 = new ModelRenderer(this);
        cube_r17.setPos(-4.3062F, 2.7347F, -0.3763F);
        armor8.addChild(cube_r17);
        setRotationAngle(cube_r17, 0.0F, 0.0F, 0.2705F);
        cube_r17.texOffs(157, 17).addBox(4.7968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r18 = new ModelRenderer(this);
        cube_r18.setPos(4.5228F, 4.6597F, -0.3763F);
        armor8.addChild(cube_r18);
        setRotationAngle(cube_r18, 0.0F, 0.0F, -0.2051F);
        cube_r18.texOffs(157, 17).addBox(-5.7968F, -2.8586F, 3.5375F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        armband3 = new ModelRenderer(this);
        armband3.setPos(-6.1466F, 3.0205F, 0.3918F);
        leftleg.addChild(armband3);


        box4 = new ModelRenderer(this);
        box4.setPos(-4.1323F, 9.6421F, -1.4585F);
        armband3.addChild(box4);
        box4.texOffs(167, 19).addBox(9.5091F, -8.1677F, -2.2365F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        box4.texOffs(167, 19).addBox(9.7651F, -7.2366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box4.texOffs(167, 19).addBox(9.7651F, -7.7366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box4.texOffs(167, 19).addBox(9.7651F, -7.9366F, -2.0349F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box4.texOffs(167, 19).addBox(9.7651F, -7.5194F, -2.0244F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box4.texOffs(167, 19).addBox(5.8178F, -7.5194F, -2.0244F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        box4.texOffs(167, 19).addBox(5.8178F, -7.9366F, -2.0349F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box4.texOffs(167, 19).addBox(5.8178F, -7.7366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box4.texOffs(167, 19).addBox(5.8178F, -7.2366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box4.texOffs(167, 19).addBox(6.0739F, -8.1677F, -2.2365F, 1.0F, 3.0F, 1.0F, 0.0F, true);

        cube_r19 = new ModelRenderer(this);
        cube_r19.setPos(17.4265F, -0.6653F, -0.3479F);
        box4.addChild(cube_r19);
        setRotationAngle(cube_r19, 0.0F, 0.0F, -0.8421F);
        cube_r19.texOffs(167, 19).addBox(-1.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r20 = new ModelRenderer(this);
        cube_r20.setPos(15.5265F, 4.6097F, -0.3479F);
        box4.addChild(cube_r20);
        setRotationAngle(cube_r20, 0.0F, 0.0F, -0.624F);
        cube_r20.texOffs(167, 19).addBox(-1.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r21 = new ModelRenderer(this);
        cube_r21.setPos(16.1892F, 6.7837F, 0.0737F);
        box4.addChild(cube_r21);
        setRotationAngle(cube_r21, 0.7941F, 0.0F, 0.0F);
        cube_r21.texOffs(167, 19).addBox(-10.3714F, -10.4203F, 7.9914F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r21.texOffs(167, 19).addBox(-6.4241F, -10.4203F, 7.9914F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r22 = new ModelRenderer(this);
        cube_r22.setPos(16.1892F, 6.8087F, -0.6763F);
        box4.addChild(cube_r22);
        setRotationAngle(cube_r22, -0.2487F, 0.0F, 0.0F);
        cube_r22.texOffs(167, 19).addBox(-10.3714F, -14.1953F, -3.9836F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r22.texOffs(167, 19).addBox(-6.4241F, -14.1953F, -3.9836F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r23 = new ModelRenderer(this);
        cube_r23.setPos(15.5265F, 4.6097F, -0.3479F);
        box4.addChild(cube_r23);
        setRotationAngle(cube_r23, 0.0F, 0.0F, -0.624F);
        cube_r23.texOffs(167, 19).addBox(-1.9526F, -13.1024F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r24 = new ModelRenderer(this);
        cube_r24.setPos(1.0565F, 4.6097F, -0.3479F);
        box4.addChild(cube_r24);
        setRotationAngle(cube_r24, 0.0F, 0.0F, 0.624F);
        cube_r24.texOffs(167, 19).addBox(0.9526F, -13.1024F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r24.texOffs(167, 19).addBox(0.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r25 = new ModelRenderer(this);
        cube_r25.setPos(-0.8435F, -0.6653F, -0.3479F);
        box4.addChild(cube_r25);
        setRotationAngle(cube_r25, 0.0F, 0.0F, 0.8421F);
        cube_r25.texOffs(167, 19).addBox(0.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        box5 = new ModelRenderer(this);
        box5.setPos(11.1006F, 11.1411F, -1.4585F);
        armband3.addChild(box5);
        box5.texOffs(191, 17).addBox(-5.5894F, -8.8544F, -1.3473F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        box5.texOffs(191, 17).addBox(-5.7109F, -8.8544F, 1.7837F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box5.texOffs(191, 17).addBox(-9.2113F, -8.8544F, 1.7837F, 4.0F, 1.0F, 1.0F, 0.0F, false);
        box5.texOffs(191, 17).addBox(-9.3329F, -8.8544F, -1.9313F, 1.0F, 1.0F, 4.0F, 0.0F, false);
        box5.texOffs(191, 23).addBox(-8.4105F, -10.4108F, -2.308F, 3.0F, 5.0F, 0.0F, 0.0F, false);
        box5.texOffs(191, 23).addBox(-7.8728F, -6.0057F, -2.333F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        box5.texOffs(191, 23).addBox(-7.0478F, -6.0057F, -2.333F, 1.0F, 1.0F, 0.0F, 0.0F, false);

        box6 = new ModelRenderer(this);
        box6.setPos(15.395F, 12.154F, -1.5395F);
        armband3.addChild(box6);
        box6.texOffs(208, 1).addBox(-13.6367F, -10.0475F, 2.9052F, 4.0F, 1.0F, 0.0F, 0.0F, false);
        box6.texOffs(208, 1).addBox(-9.8117F, -10.0475F, 2.9052F, 1.0F, 1.0F, 0.0F, 0.0F, false);
        box6.texOffs(207, -3).addBox(-13.656F, -10.0475F, -1.1032F, 0.0F, 1.0F, 4.0F, 0.0F, false);
        box6.texOffs(207, -3).addBox(-8.806F, -10.0475F, -1.1282F, 0.0F, 1.0F, 4.0F, 0.0F, false);

        LeftLeg = new ModelRenderer(this);
        LeftLeg.setPos(1.9F, 12.0F, 0.0F);
        LeftLeg.texOffs(266, 12).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.25F, false);

        rightleg = new ModelRenderer(this);
        rightleg.setPos(-2.0F, 0.05F, 0.675F);
        LeftLeg.addChild(rightleg);


        armor3 = new ModelRenderer(this);
        armor3.setPos(6.8759F, 9.7457F, 5.0509F);
        rightleg.addChild(armor3);


        box7 = new ModelRenderer(this);
        box7.setPos(-12.9642F, 0.4051F, 0.0F);
        armor3.addChild(box7);
        box7.texOffs(165, 17).addBox(6.2504F, -7.1117F, -4.3993F, 4.0F, 2.0F, 1.0F, 0.0F, true);
        box7.texOffs(165, 17).addBox(6.2504F, -8.3117F, -4.3993F, 4.0F, 2.0F, 1.0F, 0.0F, true);

        box8 = new ModelRenderer(this);
        box8.setPos(-8.2647F, -6.2795F, -7.4139F);
        armor3.addChild(box8);
        box8.texOffs(185, 17).addBox(2.7129F, -2.5155F, 3.1361F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        box8.texOffs(185, 17).addBox(2.0629F, -2.5155F, 3.1361F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box8.texOffs(185, 17).addBox(4.6462F, -1.402F, 3.1361F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        box8.texOffs(185, 17).addBox(4.6462F, -2.202F, 3.1361F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box8.texOffs(185, 17).addBox(1.1315F, -1.402F, 3.1361F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        box8.texOffs(185, 17).addBox(2.6462F, -1.9692F, -0.7125F, 3.0F, 3.0F, 1.0F, 0.0F, true);
        box8.texOffs(185, 17).addBox(2.6462F, -2.5192F, -0.7125F, 3.0F, 3.0F, 1.0F, 0.0F, true);
        box8.texOffs(185, 17).addBox(1.1315F, -2.202F, 3.1361F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box8.texOffs(185, 17).addBox(2.6749F, -3.5782F, -0.7125F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        box8.texOffs(194, 33).addBox(4.7677F, -0.3678F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        box8.texOffs(190, 19).addBox(4.7677F, -0.7419F, -0.5565F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        box8.texOffs(190, 19).addBox(4.7677F, -2.5169F, -0.5565F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        box8.texOffs(190, 19).addBox(4.7677F, -2.1928F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, true);

        cube_r26 = new ModelRenderer(this);
        cube_r26.setPos(-0.0257F, -1.5643F, 2.5487F);
        box8.addChild(cube_r26);
        setRotationAngle(cube_r26, -0.1178F, 0.0F, 0.0F);
        cube_r26.texOffs(190, 19).addBox(4.7934F, -0.7026F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r26.texOffs(190, 19).addBox(4.7934F, -0.7026F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r27 = new ModelRenderer(this);
        cube_r27.setPos(-0.0257F, -0.2643F, 2.2487F);
        box8.addChild(cube_r27);
        setRotationAngle(cube_r27, -0.1178F, 0.0F, 0.0F);
        cube_r27.texOffs(190, 19).addBox(4.7934F, -1.2026F, -2.2301F, 1.0F, 3.0F, 2.0F, 0.0F, true);
        cube_r27.texOffs(190, 19).addBox(4.7934F, -1.2026F, -1.0801F, 1.0F, 3.0F, 2.0F, 0.0F, true);

        cube_r28 = new ModelRenderer(this);
        cube_r28.setPos(3.3493F, 0.8829F, -0.2263F);
        box8.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.0F, 0.0F, 0.4931F);
        cube_r28.texOffs(185, 17).addBox(-0.5935F, -4.0823F, -0.4862F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r28.texOffs(185, 17).addBox(-1.8185F, -4.0823F, -0.4862F, 2.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r29 = new ModelRenderer(this);
        cube_r29.setPos(8.7287F, 11.9693F, 7.0936F);
        box8.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.0F, 0.0F, -0.7854F);
        cube_r29.texOffs(185, 17).addBox(4.3762F, -14.7194F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r30 = new ModelRenderer(this);
        cube_r30.setPos(2.4846F, -0.0307F, 7.0936F);
        box8.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.0F, 0.0F, 1.2392F);
        cube_r30.texOffs(185, 17).addBox(-2.4907F, -0.4178F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r31 = new ModelRenderer(this);
        cube_r31.setPos(4.293F, -0.0307F, 7.0936F);
        box8.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.0F, 0.0F, -1.2392F);
        cube_r31.texOffs(185, 17).addBox(1.4907F, -0.4178F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r32 = new ModelRenderer(this);
        cube_r32.setPos(-1.9511F, 11.9693F, 7.0936F);
        box8.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.0F, 0.0F, 0.7854F);
        cube_r32.texOffs(185, 17).addBox(-5.3762F, -14.7194F, -3.9575F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        box9 = new ModelRenderer(this);
        box9.setPos(-12.235F, -5.3072F, -5.5098F);
        armor3.addChild(box9);
        box9.texOffs(218, 19).addBox(5.116F, -2.9415F, -2.7226F, 2.0F, 3.0F, 1.0F, 0.0F, true);
        box9.texOffs(218, 19).addBox(5.116F, -3.4915F, -2.7226F, 2.0F, 1.0F, 1.0F, 0.0F, true);
        box9.texOffs(207, 0).addBox(6.591F, -4.4915F, -2.7226F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box9.texOffs(221, 24).addBox(4.9802F, -1.3401F, 1.045F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box9.texOffs(217, 10).addBox(4.9802F, -3.4892F, -2.4606F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box9.texOffs(217, 10).addBox(4.9802F, -1.7142F, -2.4606F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box9.texOffs(217, 10).addBox(4.9802F, -3.1651F, 1.045F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r33 = new ModelRenderer(this);
        cube_r33.setPos(10.7736F, -2.5367F, 0.6445F);
        box9.addChild(cube_r33);
        setRotationAngle(cube_r33, -0.1178F, 0.0F, 0.0F);
        cube_r33.texOffs(217, 10).addBox(-5.7934F, -0.7026F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r33.texOffs(217, 10).addBox(-5.7934F, -0.7026F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, false);

        cube_r34 = new ModelRenderer(this);
        cube_r34.setPos(10.7736F, -1.2367F, 0.3445F);
        box9.addChild(cube_r34);
        setRotationAngle(cube_r34, -0.1178F, 0.0F, 0.0F);
        cube_r34.texOffs(217, 10).addBox(-5.7934F, -1.2026F, -2.2301F, 1.0F, 3.0F, 2.0F, 0.0F, false);
        cube_r34.texOffs(217, 10).addBox(-5.7934F, -1.2026F, -1.0801F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        cube_r35 = new ModelRenderer(this);
        cube_r35.setPos(5.2778F, -0.3299F, -2.2115F);
        box9.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.0F, 0.0F, -0.4974F);
        cube_r35.texOffs(218, 19).addBox(2.0855F, -2.8629F, -0.5112F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r35.texOffs(218, 19).addBox(1.3605F, -2.8629F, -0.5112F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r36 = new ModelRenderer(this);
        cube_r36.setPos(5.2778F, 2.3201F, -2.2115F);
        box9.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, 0.0F, -0.4974F);
        cube_r36.texOffs(218, 19).addBox(1.3605F, -2.8629F, -0.5112F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        armor4 = new ModelRenderer(this);
        armor4.setPos(1.9333F, 4.4385F, -2.3631F);
        rightleg.addChild(armor4);
        armor4.texOffs(157, 17).addBox(-2.2013F, 3.0159F, -0.6875F, 4.0F, 2.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(1.3237F, 3.0159F, -0.6875F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(-2.2013F, 4.4909F, -0.6875F, 4.0F, 1.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(1.3237F, 4.4909F, -0.6875F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(1.3241F, 3.0011F, 3.1361F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(1.3241F, 2.5011F, 3.1361F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(-0.7259F, 2.8261F, 3.1361F, 2.0F, 2.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(-2.1906F, 3.0011F, 3.1361F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armor4.texOffs(157, 17).addBox(-2.1906F, 2.5011F, 3.1361F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor4.texOffs(157, 17).addBox(-0.7259F, 2.2011F, 3.1361F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(-0.1509F, 2.2011F, 3.1361F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(1.4456F, 3.1631F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        armor4.texOffs(161, 33).addBox(1.4456F, 2.6381F, 2.9491F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(1.4456F, 3.4872F, -0.5815F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(1.4456F, 3.0122F, -0.5815F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        armor4.texOffs(157, 17).addBox(-2.3122F, 3.4872F, -0.5815F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armor4.texOffs(157, 17).addBox(-2.3122F, 3.1631F, 2.9491F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armor4.texOffs(161, 33).addBox(-2.3122F, 2.6381F, 2.9491F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armor4.texOffs(157, 17).addBox(-2.3122F, 3.0122F, -0.5815F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r37 = new ModelRenderer(this);
        cube_r37.setPos(3.4812F, 4.5347F, 2.2487F);
        armor4.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.1178F, 0.0F, 0.0F);
        cube_r37.texOffs(157, 17).addBox(-5.7934F, -1.7974F, -2.2301F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r37.texOffs(157, 17).addBox(-5.7934F, -1.7974F, -1.0801F, 1.0F, 2.0F, 2.0F, 0.0F, false);
        cube_r37.texOffs(157, 17).addBox(-2.0356F, -1.7974F, -1.0801F, 1.0F, 2.0F, 2.0F, 0.0F, true);
        cube_r37.texOffs(157, 17).addBox(-2.0356F, -1.7974F, -2.2301F, 1.0F, 2.0F, 2.0F, 0.0F, true);

        cube_r38 = new ModelRenderer(this);
        cube_r38.setPos(3.4812F, 4.5347F, 2.5487F);
        armor4.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.1178F, 0.0F, 0.0F);
        cube_r38.texOffs(157, 17).addBox(-5.7934F, -0.2974F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r38.texOffs(157, 17).addBox(-5.7934F, -0.2974F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, false);
        cube_r38.texOffs(157, 17).addBox(-2.0356F, -0.2974F, -2.2301F, 1.0F, 1.0F, 2.0F, 0.0F, true);
        cube_r38.texOffs(157, 17).addBox(-2.0356F, -0.2974F, -1.0801F, 1.0F, 1.0F, 2.0F, 0.0F, true);

        cube_r39 = new ModelRenderer(this);
        cube_r39.setPos(4.3062F, 2.7347F, -0.4013F);
        armor4.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, -0.2705F);
        cube_r39.texOffs(157, 17).addBox(-5.6968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r40 = new ModelRenderer(this);
        cube_r40.setPos(-4.1728F, 2.7347F, -0.4013F);
        armor4.addChild(cube_r40);
        setRotationAngle(cube_r40, 0.0F, 0.0F, 0.2705F);
        cube_r40.texOffs(157, 17).addBox(4.6968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r40.texOffs(157, 17).addBox(4.7968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r41 = new ModelRenderer(this);
        cube_r41.setPos(4.6562F, 4.6597F, -0.4013F);
        armor4.addChild(cube_r41);
        setRotationAngle(cube_r41, 0.0F, 0.0F, -0.2051F);
        cube_r41.texOffs(157, 17).addBox(-5.7968F, -2.8586F, 3.5375F, 2.0F, 2.0F, 1.0F, 0.0F, false);

        cube_r42 = new ModelRenderer(this);
        cube_r42.setPos(4.3062F, 2.7347F, -0.4013F);
        armor4.addChild(cube_r42);
        setRotationAngle(cube_r42, 0.0F, 0.0F, -0.2705F);
        cube_r42.texOffs(157, 17).addBox(-5.7968F, -1.8586F, 3.5375F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r43 = new ModelRenderer(this);
        cube_r43.setPos(-4.5228F, 4.6597F, -0.4013F);
        armor4.addChild(cube_r43);
        setRotationAngle(cube_r43, 0.0F, 0.0F, 0.2051F);
        cube_r43.texOffs(157, 17).addBox(3.7968F, -2.8586F, 3.5375F, 2.0F, 2.0F, 1.0F, 0.0F, true);

        armband2 = new ModelRenderer(this);
        armband2.setPos(6.1466F, 3.0205F, 0.3918F);
        rightleg.addChild(armband2);


        box10 = new ModelRenderer(this);
        box10.setPos(4.1323F, 9.6421F, -1.4585F);
        armband2.addChild(box10);
        box10.texOffs(167, 19).addBox(-10.5091F, -8.1677F, -2.2115F, 1.0F, 3.0F, 1.0F, 0.0F, true);
        box10.texOffs(167, 19).addBox(-10.7651F, -7.2366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box10.texOffs(167, 19).addBox(-10.7651F, -7.7366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box10.texOffs(167, 19).addBox(-10.7651F, -7.9366F, -2.0349F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box10.texOffs(167, 19).addBox(-10.7651F, -7.5194F, -2.0244F, 1.0F, 2.0F, 1.0F, 0.0F, true);
        box10.texOffs(167, 19).addBox(-6.8178F, -7.5194F, -2.0244F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        box10.texOffs(167, 19).addBox(-6.8178F, -7.9366F, -2.0349F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box10.texOffs(167, 19).addBox(-6.8178F, -7.7366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box10.texOffs(167, 19).addBox(-6.8178F, -7.2366F, -1.0599F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        box10.texOffs(167, 19).addBox(-7.0739F, -8.1677F, -2.2115F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        cube_r44 = new ModelRenderer(this);
        cube_r44.setPos(-17.4265F, -0.6653F, -0.3229F);
        box10.addChild(cube_r44);
        setRotationAngle(cube_r44, 0.0F, 0.0F, 0.8421F);
        cube_r44.texOffs(167, 19).addBox(0.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r45 = new ModelRenderer(this);
        cube_r45.setPos(-15.5265F, 4.6097F, -0.3229F);
        box10.addChild(cube_r45);
        setRotationAngle(cube_r45, 0.0F, 0.0F, 0.624F);
        cube_r45.texOffs(167, 19).addBox(0.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r46 = new ModelRenderer(this);
        cube_r46.setPos(-16.1892F, 6.7837F, 0.0737F);
        box10.addChild(cube_r46);
        setRotationAngle(cube_r46, 0.7941F, 0.0F, 0.0F);
        cube_r46.texOffs(167, 19).addBox(9.3714F, -10.4203F, 7.9914F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r46.texOffs(167, 19).addBox(5.4241F, -10.4203F, 7.9914F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r47 = new ModelRenderer(this);
        cube_r47.setPos(-16.1892F, 6.8087F, -0.6763F);
        box10.addChild(cube_r47);
        setRotationAngle(cube_r47, -0.2487F, 0.0F, 0.0F);
        cube_r47.texOffs(167, 19).addBox(9.3714F, -14.1953F, -3.9836F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        cube_r47.texOffs(167, 19).addBox(5.4241F, -14.1953F, -3.9836F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r48 = new ModelRenderer(this);
        cube_r48.setPos(-15.5265F, 4.6097F, -0.3229F);
        box10.addChild(cube_r48);
        setRotationAngle(cube_r48, 0.0F, 0.0F, 0.624F);
        cube_r48.texOffs(167, 19).addBox(0.9526F, -13.1024F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        cube_r49 = new ModelRenderer(this);
        cube_r49.setPos(-1.0565F, 4.6097F, -0.3229F);
        box10.addChild(cube_r49);
        setRotationAngle(cube_r49, 0.0F, 0.0F, -0.624F);
        cube_r49.texOffs(167, 19).addBox(-1.9526F, -13.1024F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        cube_r49.texOffs(167, 19).addBox(-1.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        cube_r50 = new ModelRenderer(this);
        cube_r50.setPos(0.8435F, -0.6653F, -0.3229F);
        box10.addChild(cube_r50);
        setRotationAngle(cube_r50, 0.0F, 0.0F, -0.8421F);
        cube_r50.texOffs(167, 19).addBox(-1.9526F, -13.4524F, -1.8886F, 1.0F, 1.0F, 1.0F, 0.0F, true);

        box11 = new ModelRenderer(this);
        box11.setPos(-11.1006F, 11.1411F, -1.4585F);
        armband2.addChild(box11);
        box11.texOffs(191, 17).addBox(4.5894F, -8.8544F, -1.3473F, 1.0F, 1.0F, 4.0F, 0.0F, true);
        box11.texOffs(191, 17).addBox(5.2113F, -8.8544F, 1.7837F, 4.0F, 1.0F, 1.0F, 0.0F, true);
        box11.texOffs(191, 17).addBox(4.7113F, -8.8544F, 1.7837F, 1.0F, 1.0F, 1.0F, 0.0F, true);
        box11.texOffs(191, 17).addBox(8.3329F, -8.8544F, -1.3473F, 1.0F, 1.0F, 4.0F, 0.0F, true);
        box11.texOffs(191, 23).addBox(5.4105F, -10.4108F, -2.283F, 3.0F, 5.0F, 0.0F, 0.0F, true);
        box11.texOffs(191, 23).addBox(6.8728F, -6.0057F, -2.283F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        box11.texOffs(191, 23).addBox(6.0478F, -6.0057F, -2.283F, 1.0F, 1.0F, 0.0F, 0.0F, true);

        box12 = new ModelRenderer(this);
        box12.setPos(-15.395F, 12.154F, -1.5395F);
        armband2.addChild(box12);
        box12.texOffs(208, 1).addBox(9.6367F, -10.0475F, 2.9052F, 4.0F, 1.0F, 0.0F, 0.0F, true);
        box12.texOffs(208, 1).addBox(8.8117F, -10.0475F, 2.9052F, 1.0F, 1.0F, 0.0F, 0.0F, true);
        box12.texOffs(207, -3).addBox(13.656F, -10.0475F, -1.1032F, 0.0F, 1.0F, 4.0F, 0.0F, true);
        box12.texOffs(207, -3).addBox(8.806F, -10.0475F, -1.1282F, 0.0F, 1.0F, 4.0F, 0.0F, true);
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
