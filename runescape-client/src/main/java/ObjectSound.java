import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bu")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lls;")
    @Export("objectSounds")
    static NodeDeque objectSounds;

    @ObfuscatedName("ik")
    @ObfuscatedSignature(descriptor = "[Lpt;")
    @Export("headIconPkSprites")
    static SpritePixels[] headIconPkSprites;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1786252123)
    @Export("plane")
    int plane;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 2120521357)
    int field820;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -2074760199)
    @Export("x")
    int x;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "Lfg;")
    @Export("obj")
    ObjectComposition obj;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -997931779)
    @Export("y")
    int y;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1792934911)
    @Export("maxX")
    int maxX;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1121538931)
    @Export("maxY")
    int maxY;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 1848798585)
    int field822;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -1730887729)
    @Export("soundEffectId")
    int soundEffectId;

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "Lae;")
    @Export("stream1")
    RawPcmStream stream1;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1302815923)
    int field830;

    @ObfuscatedName("h")
    @Export("soundEffectIds")
    int[] soundEffectIds;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 368518999)
    int field826;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "Lae;")
    @Export("stream2")
    RawPcmStream stream2;

    static {
        objectSounds = new NodeDeque();
    }

    ObjectSound() {
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1608300064")
    @Export("set")
    void set() {
        int var1 = this.soundEffectId;
        ObjectComposition var2 = this.obj.transform();
        if (var2 != null) {
            this.soundEffectId = var2.ambientSoundId;
            this.field822 = var2.int7 * 128;
            this.field820 = var2.int5;
            this.field830 = var2.int6;
            this.soundEffectIds = var2.soundEffectIds;
        } else {
            this.soundEffectId = -1;
            this.field822 = 0;
            this.field820 = 0;
            this.field830 = 0;
            this.soundEffectIds = null;
        }
        if ((var1 != this.soundEffectId) && (this.stream1 != null)) {
            class123.pcmStreamMixer.removeSubStream(this.stream1);
            this.stream1 = null;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;I)V", garbageValue = "754798947")
    public static void method1743(AbstractArchive var0) {
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(Llv;Llv;Llv;B)V", garbageValue = "-36")
    @Export("drawTitle")
    static void drawTitle(Font var0, Font var1, Font var2) {
        Login.xPadding = (DirectByteArrayCopier.canvasWidth - 765) / 2;
        Login.loginBoxX = Login.xPadding + 202;
        class4.loginBoxCenter = Login.loginBoxX + 180;
        byte var3;
        int var4;
        int var9;
        int var11;
        int var14;
        int var26;
        int var27;
        int var33;
        int var42;
        int var43;
        if (Login.worldSelectOpen) {
            if (WorldMapRectangle.worldSelectBackSprites == null) {
                WorldMapRectangle.worldSelectBackSprites = ArchiveLoader.method2061(Message.archive8, "sl_back", "");
            }
            if (Occluder.worldSelectFlagSprites == null) {
                Occluder.worldSelectFlagSprites = Huffman.method5278(Message.archive8, "sl_flags", "");
            }
            if (VertexNormal.worldSelectArrows == null) {
                VertexNormal.worldSelectArrows = Huffman.method5278(Message.archive8, "sl_arrows", "");
            }
            if (Archive.worldSelectStars == null) {
                Archive.worldSelectStars = Huffman.method5278(Message.archive8, "sl_stars", "");
            }
            if (class186.worldSelectLeftSprite == null) {
                class186.worldSelectLeftSprite = class91.SpriteBuffer_getIndexedSpriteByName(Message.archive8, "leftarrow", "");
            }
            if (DirectByteArrayCopier.worldSelectRightSprite == null) {
                DirectByteArrayCopier.worldSelectRightSprite = class91.SpriteBuffer_getIndexedSpriteByName(Message.archive8, "rightarrow", "");
            }
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
            Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
            Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
            var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
            if (Archive.worldSelectStars != null) {
                Archive.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
                var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
                Archive.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
                var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
            }
            if (VertexNormal.worldSelectArrows != null) {
                var33 = Login.xPadding + 280;
                if ((World.World_sortOption1[0] == 0) && (World.World_sortOption2[0] == 0)) {
                    VertexNormal.worldSelectArrows[2].drawAt(var33, 4);
                } else {
                    VertexNormal.worldSelectArrows[0].drawAt(var33, 4);
                }
                if ((World.World_sortOption1[0] == 0) && (World.World_sortOption2[0] == 1)) {
                    VertexNormal.worldSelectArrows[3].drawAt(var33 + 15, 4);
                } else {
                    VertexNormal.worldSelectArrows[1].drawAt(var33 + 15, 4);
                }
                var0.draw("World", var33 + 32, 17, 16777215, -1);
                var4 = Login.xPadding + 390;
                if ((World.World_sortOption1[0] == 1) && (World.World_sortOption2[0] == 0)) {
                    VertexNormal.worldSelectArrows[2].drawAt(var4, 4);
                } else {
                    VertexNormal.worldSelectArrows[0].drawAt(var4, 4);
                }
                if ((World.World_sortOption1[0] == 1) && (World.World_sortOption2[0] == 1)) {
                    VertexNormal.worldSelectArrows[3].drawAt(var4 + 15, 4);
                } else {
                    VertexNormal.worldSelectArrows[1].drawAt(var4 + 15, 4);
                }
                var0.draw("Players", var4 + 32, 17, 16777215, -1);
                var42 = Login.xPadding + 500;
                if ((World.World_sortOption1[0] == 2) && (World.World_sortOption2[0] == 0)) {
                    VertexNormal.worldSelectArrows[2].drawAt(var42, 4);
                } else {
                    VertexNormal.worldSelectArrows[0].drawAt(var42, 4);
                }
                if ((World.World_sortOption1[0] == 2) && (World.World_sortOption2[0] == 1)) {
                    VertexNormal.worldSelectArrows[3].drawAt(var42 + 15, 4);
                } else {
                    VertexNormal.worldSelectArrows[1].drawAt(var42 + 15, 4);
                }
                var0.draw("Location", var42 + 32, 17, 16777215, -1);
                var27 = Login.xPadding + 610;
                if ((World.World_sortOption1[0] == 3) && (World.World_sortOption2[0] == 0)) {
                    VertexNormal.worldSelectArrows[2].drawAt(var27, 4);
                } else {
                    VertexNormal.worldSelectArrows[0].drawAt(var27, 4);
                }
                if ((World.World_sortOption1[0] == 3) && (World.World_sortOption2[0] == 1)) {
                    VertexNormal.worldSelectArrows[3].drawAt(var27 + 15, 4);
                } else {
                    VertexNormal.worldSelectArrows[1].drawAt(var27 + 15, 4);
                }
                var0.draw("Type", var27 + 32, 17, 16777215, -1);
            }
            Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
            var1.drawCentered("Cancel", (Login.xPadding + 708) + 25, 16, 16777215, -1);
            Login.hoveredWorldIndex = -1;
            if (WorldMapRectangle.worldSelectBackSprites != null) {
                var3 = 88;
                byte var39 = 19;
                var42 = (765 / (var3 + 1)) - 1;
                var27 = 480 / (var39 + 1);
                do {
                    var43 = var27;
                    var26 = var42;
                    if ((var27 * (var42 - 1)) >= World.World_count) {
                        --var42;
                    }
                    if ((var42 * (var27 - 1)) >= World.World_count) {
                        --var27;
                    }
                    if ((var42 * (var27 - 1)) >= World.World_count) {
                        --var27;
                    }
                } while ((var43 != var27) || (var26 != var42) );
                var43 = (765 - (var3 * var42)) / (var42 + 1);
                if (var43 > 5) {
                    var43 = 5;
                }
                var26 = (480 - (var27 * var39)) / (var27 + 1);
                if (var26 > 5) {
                    var26 = 5;
                }
                var9 = ((765 - (var3 * var42)) - (var43 * (var42 - 1))) / 2;
                int var30 = ((480 - (var39 * var27)) - (var26 * (var27 - 1))) / 2;
                var11 = ((var27 + World.World_count) - 1) / var27;
                Login.worldSelectPagesCount = var11 - var42;
                if ((class186.worldSelectLeftSprite != null) && (Login.worldSelectPage > 0)) {
                    class186.worldSelectLeftSprite.drawAt(8, (NPC.canvasHeight / 2) - (class186.worldSelectLeftSprite.subHeight / 2));
                }
                if ((DirectByteArrayCopier.worldSelectRightSprite != null) && (Login.worldSelectPage < Login.worldSelectPagesCount)) {
                    DirectByteArrayCopier.worldSelectRightSprite.drawAt((DirectByteArrayCopier.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth) - 8, (NPC.canvasHeight / 2) - (DirectByteArrayCopier.worldSelectRightSprite.subHeight / 2));
                }
                int var37 = var30 + 23;
                int var38 = var9 + Login.xPadding;
                var14 = 0;
                boolean var40 = false;
                int var16 = Login.worldSelectPage;
                int var17;
                for (var17 = var16 * var27; (var17 < World.World_count) && ((var16 - Login.worldSelectPage) < var42); ++var17) {
                    World var18 = class33.World_worlds[var17];
                    boolean var19 = true;
                    String var20 = Integer.toString(var18.population);
                    if (var18.population == (-1)) {
                        var20 = "OFF";
                        var19 = false;
                    } else if (var18.population > 1980) {
                        var20 = "FULL";
                        var19 = false;
                    }
                    int var22 = 0;
                    byte var21;
                    if (var18.isBeta()) {
                        if (var18.isMembersOnly()) {
                            var21 = 7;
                        } else {
                            var21 = 6;
                        }
                    } else if (var18.isDeadman()) {
                        var22 = 16711680;
                        if (var18.isMembersOnly()) {
                            var21 = 5;
                        } else {
                            var21 = 4;
                        }
                    } else if (var18.method1640()) {
                        if (var18.isMembersOnly()) {
                            var21 = 9;
                        } else {
                            var21 = 8;
                        }
                    } else if (var18.isPvp()) {
                        if (var18.isMembersOnly()) {
                            var21 = 3;
                        } else {
                            var21 = 2;
                        }
                    } else if (var18.isMembersOnly()) {
                        var21 = 1;
                    } else {
                        var21 = 0;
                    }
                    if (((((MouseHandler.MouseHandler_x >= var38) && (MouseHandler.MouseHandler_y >= var37)) && (MouseHandler.MouseHandler_x < (var38 + var3))) && (MouseHandler.MouseHandler_y < (var39 + var37))) && var19) {
                        Login.hoveredWorldIndex = var17;
                        WorldMapRectangle.worldSelectBackSprites[var21].drawTransOverlayAt(var38, var37, 128, 16777215);
                        var40 = true;
                    } else {
                        WorldMapRectangle.worldSelectBackSprites[var21].drawAt(var38, var37);
                    }
                    if (Occluder.worldSelectFlagSprites != null) {
                        Occluder.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var38 + 29, var37);
                    }
                    var0.drawCentered(Integer.toString(var18.id), var38 + 15, ((var39 / 2) + var37) + 5, var22, -1);
                    var1.drawCentered(var20, var38 + 60, ((var39 / 2) + var37) + 5, 268435455, -1);
                    var37 = (var37 + var39) + var26;
                    ++var14;
                    if (var14 >= var27) {
                        var37 = var30 + 23;
                        var38 = (var38 + var3) + var43;
                        var14 = 0;
                        ++var16;
                    }
                }
                if (var40) {
                    var17 = var1.stringWidth(class33.World_worlds[Login.hoveredWorldIndex].activity) + 6;
                    int var31 = var1.ascent + 8;
                    int var41 = MouseHandler.MouseHandler_y + 25;
                    if ((var41 + var31) > 480) {
                        var41 = (MouseHandler.MouseHandler_y - 25) - var31;
                    }
                    Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - (var17 / 2), var41, var17, var31, 16777120);
                    Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - (var17 / 2), var41, var17, var31, 0);
                    var1.drawCentered(class33.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, (var41 + var1.ascent) + 4, 0, -1);
                }
            }
            PcmPlayer.rasterProvider.drawFull(0, 0);
        } else {
            class260.leftTitleSprite.drawAt(Login.xPadding, 0);
            FriendSystem.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
            class28.logoSprite.drawAt((Login.xPadding + 382) - (class28.logoSprite.subWidth / 2), 18);
            if ((Client.gameState == 0) || (Client.gameState == 5)) {
                var3 = 20;
                var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
                var4 = 253 - var3;
                Rasterizer2D.Rasterizer2D_drawRectangle((Login.loginBoxX + 180) - 152, var4, 304, 34, 9179409);
                Rasterizer2D.Rasterizer2D_drawRectangle((Login.loginBoxX + 180) - 151, var4 + 1, 302, 32, 0);
                Rasterizer2D.Rasterizer2D_fillRectangle((Login.loginBoxX + 180) - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
                Rasterizer2D.Rasterizer2D_fillRectangle(((Login.loginBoxX + 180) - 150) + (Login.Login_loadingPercent * 3), var4 + 2, 300 - (Login.Login_loadingPercent * 3), 30, 0);
                var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
            }
            String var5;
            String var7;
            String var8;
            char[] var10;
            short var32;
            short var34;
            if (Client.gameState == 20) {
                Login.titleboxSprite.drawAt((Login.loginBoxX + 180) - (Login.titleboxSprite.subWidth / 2), 271 - (Login.titleboxSprite.subHeight / 2));
                var32 = 201;
                var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
                var33 = var32 + 15;
                var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
                var33 += 15;
                var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
                var33 += 15;
                var33 += 7;
                if ((Login.loginIndex != 4) && (Login.loginIndex != 10)) {
                    var0.draw("Login: ", (Login.loginBoxX + 180) - 110, var33, 16777215, 0);
                    var34 = 200;
                    for (var5 = FloorOverlayDefinition.method3573(); var0.stringWidth(var5) > var34; var5 = var5.substring(0, var5.length() - 1)) {
                    }
                    var0.draw(AbstractFont.escapeBrackets(var5), (Login.loginBoxX + 180) - 70, var33, 16777215, 0);
                    var33 += 15;
                    var7 = Login.Login_password;
                    var9 = var7.length();
                    var10 = new char[var9];
                    for (var11 = 0; var11 < var9; ++var11) {
                        var10[var11] = '*';
                    }
                    var8 = new String(var10);
                    for (var8 = var8; var0.stringWidth(var8) > var34; var8 = var8.substring(1)) {
                    }
                    var0.draw("Password: " + var8, (Login.loginBoxX + 180) - 108, var33, 16777215, 0);
                    var33 += 15;
                }
            }
            if (((Client.gameState == 10) || (Client.gameState == 11)) || (Client.gameState == 50)) {
                Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
                short var23;
                if (Login.loginIndex == 0) {
                    var32 = 251;
                    var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
                    var33 = var32 + 30;
                    var4 = (Login.loginBoxX + 180) - 80;
                    var23 = 291;
                    class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                    var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    var4 = (Login.loginBoxX + 180) + 80;
                    class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                    var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (Login.loginIndex == 1) {
                    var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
                    var32 = 236;
                    var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
                    var33 = var32 + 15;
                    var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
                    var33 += 15;
                    var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
                    var33 += 15;
                    var4 = (Login.loginBoxX + 180) - 80;
                    var23 = 321;
                    class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                    var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
                    var4 = (Login.loginBoxX + 180) + 80;
                    class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                    var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
                } else {
                    IndexedSprite var35;
                    if (Login.loginIndex == 2) {
                        var32 = 201;
                        var0.drawCentered(Login.Login_response1, class4.loginBoxCenter, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var0.drawCentered(Login.Login_response2, class4.loginBoxCenter, var33, 16776960, 0);
                        var33 += 15;
                        var0.drawCentered(Login.Login_response3, class4.loginBoxCenter, var33, 16776960, 0);
                        var33 += 15;
                        var33 += 7;
                        var0.draw("Login: ", class4.loginBoxCenter - 110, var33, 16777215, 0);
                        var34 = 200;
                        for (var5 = FloorOverlayDefinition.method3573(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) {
                        }
                        var0.draw(AbstractFont.escapeBrackets(var5) + ((Login.currentLoginField == 0) & ((Client.cycle % 40) < 20) ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), class4.loginBoxCenter - 70, var33, 16777215, 0);
                        var33 += 15;
                        var7 = Login.Login_password;
                        var9 = var7.length();
                        var10 = new char[var9];
                        for (var11 = 0; var11 < var9; ++var11) {
                            var10[var11] = '*';
                        }
                        var8 = new String(var10);
                        for (var8 = var8; var0.stringWidth(var8) > var34; var8 = var8.substring(1)) {
                        }
                        var0.draw(("Password: " + var8) + ((Login.currentLoginField == 1) & ((Client.cycle % 40) < 20) ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), class4.loginBoxCenter - 108, var33, 16777215, 0);
                        var33 += 15;
                        var32 = 277;
                        var9 = class4.loginBoxCenter + (-117);
                        var35 = class377.method6795(Client.Login_isUsernameRemembered, Login.field912);
                        var35.drawAt(var9, var32);
                        var9 = (var9 + var35.subWidth) + 5;
                        var1.draw("Remember username", var9, var32 + 13, 16776960, 0);
                        var9 = class4.loginBoxCenter + 24;
                        boolean var12 = class424.clientPreferences.hideUsername;
                        boolean var13 = Login.field913;
                        IndexedSprite var28 = (var12) ? var13 ? Bounds.field4220 : class1.options_buttons_2Sprite : var13 ? class143.field1638 : Script.options_buttons_0Sprite;
                        var28.drawAt(var9, var32);
                        var9 = (var9 + var28.subWidth) + 5;
                        var1.draw("Hide username", var9, var32 + 13, 16776960, 0);
                        var33 = var32 + 15;
                        var14 = class4.loginBoxCenter - 80;
                        short var15 = 321;
                        class259.titlebuttonSprite.drawAt(var14 - 73, var15 - 20);
                        var0.drawCentered("Login", var14, var15 + 5, 16777215, 0);
                        var14 = class4.loginBoxCenter + 80;
                        class259.titlebuttonSprite.drawAt(var14 - 73, var15 - 20);
                        var0.drawCentered("Cancel", var14, var15 + 5, 16777215, 0);
                        var32 = 357;
                        switch (Login.field918) {
                            case 2 :
                                class374.field4266 = "Having trouble logging in?";
                                break;
                            default :
                                class374.field4266 = "Can't login? Click here.";
                        }
                        class6.field25 = new Bounds(class4.loginBoxCenter, var32, var1.stringWidth(class374.field4266), 11);
                        PendingSpawn.field1107 = new Bounds(class4.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11);
                        var1.drawCentered(class374.field4266, class4.loginBoxCenter, var32, 16777215, 0);
                    } else if (Login.loginIndex == 3) {
                        var32 = 201;
                        var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var32, 16776960, 0);
                        var33 = var32 + 20;
                        var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var4 = Login.loginBoxX + 180;
                        var23 = 276;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
                        var4 = Login.loginBoxX + 180;
                        var23 = 326;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
                    } else if (Login.loginIndex == 4) {
                        var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
                        var32 = 236;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
                        var33 = var32 + 15;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
                        var33 += 15;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
                        var33 += 15;
                        var5 = "PIN: ";
                        var7 = class145.otp;
                        var9 = var7.length();
                        var10 = new char[var9];
                        for (var11 = 0; var11 < var9; ++var11) {
                            var10[var11] = '*';
                        }
                        var8 = new String(var10);
                        var0.draw((var5 + var8) + ((Client.cycle % 40) < 20 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), (Login.loginBoxX + 180) - 108, var33, 16777215, 0);
                        var33 -= 8;
                        var0.draw("Trust this computer", (Login.loginBoxX + 180) - 9, var33, 16776960, 0);
                        var33 += 15;
                        var0.draw("for 30 days: ", (Login.loginBoxX + 180) - 9, var33, 16776960, 0);
                        var26 = (((180 + Login.loginBoxX) - 9) + var0.stringWidth("for 30 days: ")) + 15;
                        var9 = var33 - var0.ascent;
                        if (Login.field893) {
                            var35 = class1.options_buttons_2Sprite;
                        } else {
                            var35 = Script.options_buttons_0Sprite;
                        }
                        var35.drawAt(var26, var9);
                        var33 += 15;
                        var11 = (Login.loginBoxX + 180) - 80;
                        short var36 = 321;
                        class259.titlebuttonSprite.drawAt(var11 - 73, var36 - 20);
                        var0.drawCentered("Continue", var11, var36 + 5, 16777215, 0);
                        var11 = (Login.loginBoxX + 180) + 80;
                        class259.titlebuttonSprite.drawAt(var11 - 73, var36 - 20);
                        var0.drawCentered("Cancel", var11, var36 + 5, 16777215, 0);
                        var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0);
                    } else if (Login.loginIndex == 5) {
                        var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
                        var32 = 221;
                        var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var33 += 14;
                        var0.draw("Username/email: ", (Login.loginBoxX + 180) - 145, var33, 16777215, 0);
                        var34 = 174;
                        for (var5 = FloorOverlayDefinition.method3573(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) {
                        }
                        var0.draw(AbstractFont.escapeBrackets(var5) + ((Client.cycle % 40) < 20 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), (Login.loginBoxX + 180) - 34, var33, 16777215, 0);
                        var33 += 15;
                        var27 = (Login.loginBoxX + 180) - 80;
                        short var25 = 321;
                        class259.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
                        var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0);
                        var27 = (Login.loginBoxX + 180) + 80;
                        class259.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
                        var0.drawCentered("Back", var27, var25 + 5, 16777215, 0);
                        var25 = 356;
                        var1.drawCentered("Still having trouble logging in?", class4.loginBoxCenter, var25, 268435455, 0);
                    } else if (Login.loginIndex == 6) {
                        var32 = 201;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var4 = Login.loginBoxX + 180;
                        var23 = 321;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
                    } else if (Login.loginIndex == 7) {
                        if (class261.field3085 && (!Client.onMobile)) {
                            var32 = 201;
                            var0.drawCentered(Login.Login_response1, class4.loginBoxCenter, var32, 16776960, 0);
                            var33 = var32 + 15;
                            var0.drawCentered(Login.Login_response2, class4.loginBoxCenter, var33, 16776960, 0);
                            var33 += 15;
                            var0.drawCentered(Login.Login_response3, class4.loginBoxCenter, var33, 16776960, 0);
                            var4 = class4.loginBoxCenter - 150;
                            var33 += 10;
                            for (var42 = 0; var42 < 8; ++var42) {
                                class259.titlebuttonSprite.method7753(var4, var33, 30, 40);
                                boolean var46 = (var42 == Login.field910) & ((Client.cycle % 40) < 20);
                                var0.draw((Login.field911[var42] == null ? "" : Login.field911[var42]) + (var46 ? LoginScreenAnimation.colorStartTag(16776960) + "|" : ""), var4 + 10, var33 + 27, 16777215, 0);
                                if ((var42 != 1) && (var42 != 3)) {
                                    var4 += 35;
                                } else {
                                    var4 += 50;
                                    var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var33 + 27, 16777215, 0);
                                }
                            }
                            var42 = class4.loginBoxCenter - 80;
                            short var47 = 321;
                            class259.titlebuttonSprite.drawAt(var42 - 73, var47 - 20);
                            var0.drawCentered("Submit", var42, var47 + 5, 16777215, 0);
                            var42 = class4.loginBoxCenter + 80;
                            class259.titlebuttonSprite.drawAt(var42 - 73, var47 - 20);
                            var0.drawCentered("Cancel", var42, var47 + 5, 16777215, 0);
                        } else {
                            var32 = 216;
                            var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0);
                            var33 = var32 + 15;
                            var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0);
                            var33 += 15;
                            var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0);
                            var33 += 15;
                            var4 = (Login.loginBoxX + 180) - 80;
                            var23 = 321;
                            class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                            var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
                            var4 = (Login.loginBoxX + 180) + 80;
                            class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                            var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
                        }
                    } else if (Login.loginIndex == 8) {
                        var32 = 216;
                        var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var4 = (Login.loginBoxX + 180) - 80;
                        var23 = 321;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
                        var4 = (Login.loginBoxX + 180) + 80;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
                    } else if (Login.loginIndex == 9) {
                        var32 = 221;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
                        var33 = var32 + 25;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 25;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
                        var4 = Login.loginBoxX + 180;
                        var23 = 311;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
                    } else if (Login.loginIndex == 10) {
                        var33 = Login.loginBoxX + 180;
                        var34 = 209;
                        var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0);
                        var4 = var34 + 20;
                        Login.field894.drawAt(var33 - 109, var4);
                        class138.field1613.drawAt(var33 - 48, var4 + 18);
                    } else if (Login.loginIndex == 12) {
                        var33 = class4.loginBoxCenter;
                        var34 = 216;
                        var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0);
                        var4 = var34 + 17;
                        var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0);
                        var4 += 17;
                        var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0);
                        var33 = class4.loginBoxCenter - 80;
                        var34 = 311;
                        class259.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
                        var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0);
                        var33 = class4.loginBoxCenter + 80;
                        class259.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
                        var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0);
                    } else if (Login.loginIndex == 13) {
                        var32 = 231;
                        var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0);
                        var33 = var32 + 20;
                        var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0);
                        var4 = Login.loginBoxX + 180;
                        var32 = 311;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var32 - 20);
                        var0.drawCentered("Back", var4, var32 + 5, 16777215, 0);
                    } else if (Login.loginIndex == 14) {
                        var32 = 201;
                        String var24 = "";
                        var5 = "";
                        String var6 = "";
                        switch (Login.Login_banType) {
                            case 0 :
                                var24 = "Your account has been disabled.";
                                var5 = Strings.field3634;
                                var6 = "";
                                break;
                            case 1 :
                                var24 = "Account locked as we suspect it has been stolen.";
                                var5 = Strings.field3763;
                                var6 = "";
                                break;
                            default :
                                Archive.Login_promptCredentials(false);
                        }
                        var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0);
                        var33 = var32 + 15;
                        var2.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var2.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0);
                        var33 += 15;
                        var43 = Login.loginBoxX + 180;
                        short var44 = 276;
                        class259.titlebuttonSprite.drawAt(var43 - 73, var44 - 20);
                        var0.drawCentered("Support Page", var43, var44 + 5, 16777215, 0);
                        var43 = Login.loginBoxX + 180;
                        var44 = 326;
                        class259.titlebuttonSprite.drawAt(var43 - 73, var44 - 20);
                        var0.drawCentered("Back", var43, var44 + 5, 16777215, 0);
                    } else if (Login.loginIndex == 24) {
                        var32 = 221;
                        var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
                        var33 = var32 + 15;
                        var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
                        var33 += 15;
                        var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
                        var33 += 15;
                        var4 = Login.loginBoxX + 180;
                        var23 = 301;
                        class259.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
                        var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
                    }
                }
            }
            if (Client.gameState >= 10) {
                int[] var29 = new int[4];
                Rasterizer2D.Rasterizer2D_getClipArray(var29);
                Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, NPC.canvasHeight);
                Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
                Login.loginScreenRunesAnimation.draw(((Login.xPadding + 22) + 765) - 128, Client.cycle);
                Rasterizer2D.Rasterizer2D_setClipArray(var29);
            }
            class371.title_muteSprite[class424.clientPreferences.titleMusicDisabled ? 1 : 0].drawAt((Login.xPadding + 765) - 40, 463);
            if ((Client.gameState > 5) && (Language.Language_EN == class122.clientLanguage)) {
                if (Coord.field3230 != null) {
                    var33 = Login.xPadding + 5;
                    var34 = 463;
                    byte var45 = 100;
                    byte var48 = 35;
                    Coord.field3230.drawAt(var33, var34);
                    var0.drawCentered(("World" + " ") + Client.worldId, (var45 / 2) + var33, ((var48 / 2) + var34) - 2, 16777215, 0);
                    if (WorldMapID.World_request != null) {
                        var1.drawCentered("Loading...", (var45 / 2) + var33, ((var48 / 2) + var34) + 12, 16777215, 0);
                    } else {
                        var1.drawCentered("Click to switch", (var45 / 2) + var33, ((var48 / 2) + var34) + 12, 16777215, 0);
                    }
                } else {
                    Coord.field3230 = class91.SpriteBuffer_getIndexedSpriteByName(Message.archive8, "sl_button", "");
                }
            }
        }
    }
}