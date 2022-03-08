import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("dt")
public class class115 {
    @ObfuscatedName("ps")
    @ObfuscatedSignature(descriptor = "Lop;")
    @Export("HitSplatDefinition_cachedSprites")
    static class409 HitSplatDefinition_cachedSprites;

    @ObfuscatedName("c")
    boolean field1434;

    @ObfuscatedName("l")
    boolean field1418;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Ldi;")
    class114 field1422;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "Ldi;")
    class114 field1420;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "[Ldz;")
    class111[] field1430;

    @ObfuscatedName("o")
    boolean field1421;

    @ObfuscatedName("i")
    float field1423;

    @ObfuscatedName("w")
    float field1424;

    @ObfuscatedName("v")
    float[] field1425;

    @ObfuscatedName("a")
    float[] field1426;

    @ObfuscatedName("y")
    boolean field1419;

    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 653716445)
    int field1428;

    @ObfuscatedName("h")
    float[] field1429;

    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1292100391)
    int field1417;

    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -1964265085)
    int field1427;

    @ObfuscatedName("p")
    float field1431;

    @ObfuscatedName("n")
    float field1433;

    class115() {
        this.field1425 = new float[4];
        this.field1426 = new float[4];
        this.field1419 = true;
        this.field1428 = 0;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;II)I", garbageValue = "-1427192972")
    int method2619(Buffer var1, int var2) {
        int var3 = var1.readUnsignedShort();
        class334.method6128(var1.readUnsignedByte());
        int var5 = var1.readUnsignedByte();
        class114 var6 = ((class114) (class140.findEnumerated(UrlRequester.method2418(), var5)));
        if (var6 == null) {
            var6 = class114.field1408;
        }
        this.field1422 = var6;
        int var7 = var1.readUnsignedByte();
        class114 var8 = ((class114) (class140.findEnumerated(UrlRequester.method2418(), var7)));
        if (var8 == null) {
            var8 = class114.field1408;
        }
        this.field1420 = var8;
        this.field1434 = var1.readUnsignedByte() != 0;
        this.field1430 = new class111[var3];
        class111 var11 = null;
        int var9;
        for (var9 = 0; var9 < var3; ++var9) {
            class111 var10 = new class111();
            var10.method2526(var1, var2);
            this.field1430[var9] = var10;
            if (var11 != null) {
                var11.field1383 = var10;
            }
            var11 = var10;
        }
        this.field1417 = this.field1430[0].field1377;
        this.field1427 = this.field1430[this.method2617() - 1].field1377;
        this.field1429 = new float[this.method2622() + 1];
        for (var9 = this.method2612(); var9 <= this.method2613(); ++var9) {
            this.field1429[var9 - this.method2612()] = class127.method2767(this, ((float) (var9)));
        }
        this.field1430 = null;
        this.field1431 = class127.method2767(this, ((float) (this.method2612() - 1)));
        this.field1433 = class127.method2767(this, ((float) (this.method2613() + 1)));
        return var3;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)F", garbageValue = "789038903")
    public float method2611(int var1) {
        if (var1 < this.method2612()) {
            return this.field1431;
        } else {
            return var1 > this.method2613() ? this.field1433 : this.field1429[var1 - this.method2612()];
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1770559129")
    int method2612() {
        return this.field1417;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1803710712")
    int method2613() {
        return this.field1427;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "2138979238")
    int method2622() {
        return this.method2613() - this.method2612();
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(FB)I", garbageValue = "69")
    int method2615(float var1) {
        if (((this.field1428 < 0) || (((float) (this.field1430[this.field1428].field1377)) > var1)) || ((this.field1430[this.field1428].field1383 != null) && (((float) (this.field1430[this.field1428].field1383.field1377)) <= var1))) {
            if ((var1 >= ((float) (this.method2612()))) && (var1 <= ((float) (this.method2613())))) {
                int var2 = this.method2617();
                int var3 = this.field1428;
                if (var2 > 0) {
                    int var4 = 0;
                    int var5 = var2 - 1;
                    do {
                        int var6 = (var4 + var5) >> 1;
                        if (var1 < ((float) (this.field1430[var6].field1377))) {
                            if (var1 > ((float) (this.field1430[var6 - 1].field1377))) {
                                var3 = var6 - 1;
                                break;
                            }
                            var5 = var6 - 1;
                        } else {
                            if (var1 <= ((float) (this.field1430[var6].field1377))) {
                                var3 = var6;
                                break;
                            }
                            if (var1 < ((float) (this.field1430[var6 + 1].field1377))) {
                                var3 = var6;
                                break;
                            }
                            var4 = var6 + 1;
                        }
                    } while (var4 <= var5 );
                }
                if (var3 != this.field1428) {
                    this.field1428 = var3;
                    this.field1419 = true;
                }
                return this.field1428;
            } else {
                return -1;
            }
        } else {
            return this.field1428;
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(FI)Ldz;", garbageValue = "-1285668133")
    class111 method2616(float var1) {
        int var2 = this.method2615(var1);
        return (var2 >= 0) && (var2 < this.field1430.length) ? this.field1430[var2] : null;
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "0")
    int method2617() {
        return this.field1430 == null ? 0 : this.field1430.length;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(B)[Ldp;", garbageValue = "38")
    static class121[] method2620() {
        return new class121[]{ class121.field1483, class121.field1485, class121.field1481, class121.field1487, class121.field1480, class121.field1484, class121.field1479, class121.field1486, class121.field1482 };
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-596145677")
    public static void method2638(boolean var0) {
        if (var0 != MilliClock.ItemDefinition_inMembersWorld) {
            ItemComposition.ItemDefinition_cached.clear();
            ItemComposition.ItemDefinition_cachedModels.clear();
            ItemComposition.ItemDefinition_cachedSprites.clear();
            MilliClock.ItemDefinition_inMembersWorld = var0;
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(ILbl;ZI)I", garbageValue = "-1910308552")
    static int method2637(int var0, Script var1, boolean var2) {
        String var7;
        if (var0 == ScriptOpcodes.MES) {
            var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
            LoginScreenAnimation.addGameMessage(0, "", var7);
            return 1;
        } else if (var0 == ScriptOpcodes.ANIM) {
            Interpreter.Interpreter_intStackSize -= 2;
            ItemContainer.performPlayerAnimation(WorldMapSprite.localPlayer, Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
            return 1;
        } else if (var0 == ScriptOpcodes.IF_CLOSE) {
            if (!Interpreter.field848) {
                Interpreter.field846 = true;
            }
            return 1;
        } else {
            int var16;
            if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
                var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                var16 = 0;
                if (class117.isNumber(var7)) {
                    var16 = UserComparator7.method2464(var7);
                }
                PacketBufferNode var14 = class135.getPacketBufferNode(ClientPacket.RESUME_P_COUNTDIALOG, Client.packetWriter.isaacCipher);
                var14.packetBuffer.writeInt(var16);
                Client.packetWriter.addNode(var14);
                return 1;
            } else {
                PacketBufferNode var12;
                if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
                    var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    var12 = class135.getPacketBufferNode(ClientPacket.RESUME_P_NAMEDIALOG, Client.packetWriter.isaacCipher);
                    var12.packetBuffer.writeByte(var7.length() + 1);
                    var12.packetBuffer.writeStringCp1252NullTerminated(var7);
                    Client.packetWriter.addNode(var12);
                    return 1;
                } else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
                    var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                    var12 = class135.getPacketBufferNode(ClientPacket.RESUME_P_STRINGDIALOG, Client.packetWriter.isaacCipher);
                    var12.packetBuffer.writeByte(var7.length() + 1);
                    var12.packetBuffer.writeStringCp1252NullTerminated(var7);
                    Client.packetWriter.addNode(var12);
                    return 1;
                } else {
                    String var4;
                    int var10;
                    if (var0 == ScriptOpcodes.OPPLAYER) {
                        var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var4 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                        ModelData0.method4274(var10, var4);
                        return 1;
                    } else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
                        Interpreter.Interpreter_intStackSize -= 3;
                        var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                        var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        int var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                        Widget var15 = class130.getWidget(var9);
                        class11.clickWidget(var15, var10, var16);
                        return 1;
                    } else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                        var16 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        Widget var13 = (var2) ? class16.scriptDotWidget : Interpreter.scriptActiveWidget;
                        class11.clickWidget(var13, var10, var16);
                        return 1;
                    } else if (var0 == ScriptOpcodes.MOUSECAM) {
                        class370.mouseCam = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        return 1;
                    } else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class424.clientPreferences.roofsHidden) ? 1 : 0;
                        return 1;
                    } else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
                        class424.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        GameEngine.savePreferences();
                        return 1;
                    } else if (var0 == ScriptOpcodes.OPENURL) {
                        var7 = Interpreter.Interpreter_stringStack[--BufferedNetSocket.Interpreter_stringStackSize];
                        boolean var8 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        MilliClock.openURL(var7, var8, false);
                        return 1;
                    } else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
                        var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        var12 = class135.getPacketBufferNode(ClientPacket.RESUME_P_OBJDIALOG, Client.packetWriter.isaacCipher);
                        var12.packetBuffer.writeShort(var10);
                        Client.packetWriter.addNode(var12);
                        return 1;
                    } else if (var0 == ScriptOpcodes.BUG_REPORT) {
                        var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        BufferedNetSocket.Interpreter_stringStackSize -= 2;
                        var4 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize];
                        String var5 = Interpreter.Interpreter_stringStack[BufferedNetSocket.Interpreter_stringStackSize + 1];
                        if (var4.length() > 500) {
                            return 1;
                        } else if (var5.length() > 500) {
                            return 1;
                        } else {
                            PacketBufferNode var6 = class135.getPacketBufferNode(ClientPacket.field2879, Client.packetWriter.isaacCipher);
                            var6.packetBuffer.writeShort((1 + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var4)) + GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var5));
                            var6.packetBuffer.writeStringCp1252NullTerminated(var5);
                            var6.packetBuffer.writeStringCp1252NullTerminated(var4);
                            var6.packetBuffer.writeByteNeg(var10);
                            Client.packetWriter.addNode(var6);
                            return 1;
                        }
                    } else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
                        Client.shiftClickDrop = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        return 1;
                    } else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
                        Client.showMouseOverText = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        return 1;
                    } else if (var0 == ScriptOpcodes.RENDERSELF) {
                        Client.renderSelf = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        return 1;
                    } else if (var0 == 3120) {
                        if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                            Client.drawPlayerNames |= 1;
                        } else {
                            Client.drawPlayerNames &= -2;
                        }
                        return 1;
                    } else if (var0 == 3121) {
                        if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                            Client.drawPlayerNames |= 2;
                        } else {
                            Client.drawPlayerNames &= -3;
                        }
                        return 1;
                    } else if (var0 == 3122) {
                        if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                            Client.drawPlayerNames |= 4;
                        } else {
                            Client.drawPlayerNames &= -5;
                        }
                        return 1;
                    } else if (var0 == 3123) {
                        if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
                            Client.drawPlayerNames |= 8;
                        } else {
                            Client.drawPlayerNames &= -9;
                        }
                        return 1;
                    } else if (var0 == 3124) {
                        Client.drawPlayerNames = 0;
                        return 1;
                    } else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
                        Client.showMouseCross = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        return 1;
                    } else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
                        Client.showLoadingMessages = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        return 1;
                    } else if (var0 == ScriptOpcodes.SETTAPTODROP) {
                        Archive.setTapToDrop(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1);
                        return 1;
                    } else if (var0 == ScriptOpcodes.GETTAPTODROP) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class126.getTapToDrop()) ? 1 : 0;
                        return 1;
                    } else if (var0 == 3129) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                        Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                        return 1;
                    } else if (var0 == 3130) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        return 1;
                    } else if (var0 == 3131) {
                        --Interpreter.Interpreter_intStackSize;
                        return 1;
                    } else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = DirectByteArrayCopier.canvasWidth;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = NPC.canvasHeight;
                        return 1;
                    } else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
                        --Interpreter.Interpreter_intStackSize;
                        return 1;
                    } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
                        return 1;
                    } else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
                        Interpreter.Interpreter_intStackSize -= 2;
                        return 1;
                    } else if (var0 == 3136) {
                        Client.field666 = 3;
                        Client.field667 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        return 1;
                    } else if (var0 == 3137) {
                        Client.field666 = 2;
                        Client.field667 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                        return 1;
                    } else if (var0 == 3138) {
                        Client.field666 = 0;
                        return 1;
                    } else if (var0 == 3139) {
                        Client.field666 = 1;
                        return 1;
                    } else if (var0 == 3140) {
                        Client.field666 = 3;
                        Client.field667 = (var2) ? (class16.scriptDotWidget.id * 98457465) * (-180788535) : (Interpreter.scriptActiveWidget.id * 98457465) * (-180788535);
                        return 1;
                    } else {
                        boolean var11;
                        if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
                            var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            class424.clientPreferences.hideUsername = var11;
                            GameEngine.savePreferences();
                            return 1;
                        } else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class424.clientPreferences.hideUsername) ? 1 : 0;
                            return 1;
                        } else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
                            var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            Client.Login_isUsernameRemembered = var11;
                            if (!var11) {
                                class424.clientPreferences.rememberedUsername = "";
                                GameEngine.savePreferences();
                            }
                            return 1;
                        } else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Client.Login_isUsernameRemembered) ? 1 : 0;
                            return 1;
                        } else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
                            return 1;
                        } else if (var0 == 3146) {
                            var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                            if (var11 == class424.clientPreferences.titleMusicDisabled) {
                                class424.clientPreferences.titleMusicDisabled = !var11;
                                GameEngine.savePreferences();
                            }
                            return 1;
                        } else if (var0 == 3147) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class424.clientPreferences.titleMusicDisabled) ? 0 : 1;
                            return 1;
                        } else if (var0 == 3148) {
                            return 1;
                        } else if (var0 == 3149) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3150) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3151) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3152) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3153) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Login.Login_loadingPercent;
                            return 1;
                        } else if (var0 == 3154) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Actor.method2178();
                            return 1;
                        } else if (var0 == 3155) {
                            --BufferedNetSocket.Interpreter_stringStackSize;
                            return 1;
                        } else if (var0 == 3156) {
                            return 1;
                        } else if (var0 == 3157) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            return 1;
                        } else if (var0 == 3158) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3159) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3160) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3161) {
                            --Interpreter.Interpreter_intStackSize;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3162) {
                            --Interpreter.Interpreter_intStackSize;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3163) {
                            --BufferedNetSocket.Interpreter_stringStackSize;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3164) {
                            --Interpreter.Interpreter_intStackSize;
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            return 1;
                        } else if (var0 == 3165) {
                            --Interpreter.Interpreter_intStackSize;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3166) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3167) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3168) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                            return 1;
                        } else if (var0 == 3169) {
                            return 1;
                        } else if (var0 == 3170) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3171) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3172) {
                            --Interpreter.Interpreter_intStackSize;
                            return 1;
                        } else if (var0 == 3173) {
                            --Interpreter.Interpreter_intStackSize;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3174) {
                            --Interpreter.Interpreter_intStackSize;
                            return 1;
                        } else if (var0 == 3175) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                            return 1;
                        } else if (var0 == 3176) {
                            return 1;
                        } else if (var0 == 3177) {
                            return 1;
                        } else if (var0 == 3178) {
                            --BufferedNetSocket.Interpreter_stringStackSize;
                            return 1;
                        } else if (var0 == 3179) {
                            return 1;
                        } else if (var0 == 3180) {
                            --BufferedNetSocket.Interpreter_stringStackSize;
                            return 1;
                        } else if (var0 == 3181) {
                            var10 = 100 - Math.min(Math.max(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize], 0), 100);
                            LoginType.method7149(((double) ((((float) (var10)) / 200.0F) + 0.5F)));
                            return 1;
                        } else if (var0 == 3182) {
                            float var3 = (((float) (class424.clientPreferences.brightness)) - 0.5F) * 200.0F;
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 100 - Math.round(var3);
                            return 1;
                        } else if ((var0 != 3183) && (var0 != 3184)) {
                            if (var0 == 3187) {
                                BufferedNetSocket.Interpreter_stringStackSize -= 2;
                                return 1;
                            } else {
                                return var0 == 3188 ? 1 : 2;
                            }
                        } else {
                            --Interpreter.Interpreter_intStackSize;
                            return 1;
                        }
                    }
                }
            }
        }
    }
}