import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("jj")
@Implements("MusicPatch")
public class MusicPatch extends Node {
    @ObfuscatedName("y")
    @Export("musicTrackBoolean")
    public static boolean musicTrackBoolean;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -1275283679)
    int field3160;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "[Lab;")
    @Export("rawSounds")
    RawSound[] rawSounds;

    @ObfuscatedName("s")
    short[] field3157;

    @ObfuscatedName("e")
    byte[] field3156;

    @ObfuscatedName("r")
    byte[] field3161;

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "[Lju;")
    MusicPatchNode2[] field3155;

    @ObfuscatedName("i")
    byte[] field3159;

    @ObfuscatedName("w")
    int[] field3158;

    MusicPatch(byte[] var1) {
        this.rawSounds = new RawSound[128];
        this.field3157 = new short[128];
        this.field3156 = new byte[128];
        this.field3161 = new byte[128];
        this.field3155 = new MusicPatchNode2[128];
        this.field3159 = new byte[128];
        this.field3158 = new int[128];
        Buffer var2 = new Buffer(var1);
        int var3;
        for (var3 = 0; var2.array[var3 + var2.offset] != 0; ++var3) {
        }
        byte[] var4 = new byte[var3];
        int var5;
        for (var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var2.readByte();
        }
        ++var2.offset;
        ++var3;
        var5 = var2.offset;
        var2.offset += var3;
        int var6;
        for (var6 = 0; var2.array[var6 + var2.offset] != 0; ++var6) {
        }
        byte[] var7 = new byte[var6];
        int var8;
        for (var8 = 0; var8 < var6; ++var8) {
            var7[var8] = var2.readByte();
        }
        ++var2.offset;
        ++var6;
        var8 = var2.offset;
        var2.offset += var6;
        int var9;
        for (var9 = 0; var2.array[var9 + var2.offset] != 0; ++var9) {
        }
        byte[] var10 = new byte[var9];
        for (int var11 = 0; var11 < var9; ++var11) {
            var10[var11] = var2.readByte();
        }
        ++var2.offset;
        ++var9;
        byte[] var38 = new byte[var9];
        int var12;
        int var14;
        if (var9 > 1) {
            var38[1] = 1;
            int var13 = 1;
            var12 = 2;
            for (var14 = 2; var14 < var9; ++var14) {
                int var43 = var2.readUnsignedByte();
                if (var43 == 0) {
                    var13 = var12++;
                } else {
                    if (var43 <= var13) {
                        --var43;
                    }
                    var13 = var43;
                }
                var38[var14] = ((byte) (var13));
            }
        } else {
            var12 = var9;
        }
        MusicPatchNode2[] var39 = new MusicPatchNode2[var12];
        MusicPatchNode2 var15;
        for (var14 = 0; var14 < var39.length; ++var14) {
            var15 = var39[var14] = new MusicPatchNode2();
            int var42 = var2.readUnsignedByte();
            if (var42 > 0) {
                var15.field3094 = new byte[var42 * 2];
            }
            var42 = var2.readUnsignedByte();
            if (var42 > 0) {
                var15.field3099 = new byte[(var42 * 2) + 2];
                var15.field3099[1] = 64;
            }
        }
        var14 = var2.readUnsignedByte();
        byte[] var44 = (var14 > 0) ? new byte[var14 * 2] : null;
        var14 = var2.readUnsignedByte();
        byte[] var16 = (var14 > 0) ? new byte[var14 * 2] : null;
        int var17;
        for (var17 = 0; var2.array[var17 + var2.offset] != 0; ++var17) {
        }
        byte[] var18 = new byte[var17];
        int var19;
        for (var19 = 0; var19 < var17; ++var19) {
            var18[var19] = var2.readByte();
        }
        ++var2.offset;
        ++var17;
        var19 = 0;
        int var20;
        for (var20 = 0; var20 < 128; ++var20) {
            var19 += var2.readUnsignedByte();
            this.field3157[var20] = ((short) (var19));
        }
        var19 = 0;
        short[] var50;
        for (var20 = 0; var20 < 128; ++var20) {
            var19 += var2.readUnsignedByte();
            var50 = this.field3157;
            var50[var20] = ((short) (var50[var20] + (var19 << 8)));
        }
        var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23;
        for (var23 = 0; var23 < 128; ++var23) {
            if (var20 == 0) {
                if (var21 < var18.length) {
                    var20 = var18[var21++];
                } else {
                    var20 = -1;
                }
                var22 = var2.readVarInt();
            }
            var50 = this.field3157;
            var50[var23] = ((short) (var50[var23] + (((var22 - 1) & 2) << 14)));
            this.field3158[var23] = var22;
            --var20;
        }
        var20 = 0;
        var21 = 0;
        var23 = 0;
        int var24;
        for (var24 = 0; var24 < 128; ++var24) {
            if (this.field3158[var24] != 0) {
                if (var20 == 0) {
                    if (var21 < var4.length) {
                        var20 = var4[var21++];
                    } else {
                        var20 = -1;
                    }
                    var23 = var2.array[var5++] - 1;
                }
                this.field3159[var24] = ((byte) (var23));
                --var20;
            }
        }
        var20 = 0;
        var21 = 0;
        var24 = 0;
        for (int var25 = 0; var25 < 128; ++var25) {
            if (this.field3158[var25] != 0) {
                if (var20 == 0) {
                    if (var21 < var7.length) {
                        var20 = var7[var21++];
                    } else {
                        var20 = -1;
                    }
                    var24 = (var2.array[var8++] + 16) << 2;
                }
                this.field3161[var25] = ((byte) (var24));
                --var20;
            }
        }
        var20 = 0;
        var21 = 0;
        MusicPatchNode2 var40 = null;
        int var26;
        for (var26 = 0; var26 < 128; ++var26) {
            if (this.field3158[var26] != 0) {
                if (var20 == 0) {
                    var40 = var39[var38[var21]];
                    if (var21 < var10.length) {
                        var20 = var10[var21++];
                    } else {
                        var20 = -1;
                    }
                }
                this.field3155[var26] = var40;
                --var20;
            }
        }
        var20 = 0;
        var21 = 0;
        var26 = 0;
        int var27;
        for (var27 = 0; var27 < 128; ++var27) {
            if (var20 == 0) {
                if (var21 < var18.length) {
                    var20 = var18[var21++];
                } else {
                    var20 = -1;
                }
                if (this.field3158[var27] > 0) {
                    var26 = var2.readUnsignedByte() + 1;
                }
            }
            this.field3156[var27] = ((byte) (var26));
            --var20;
        }
        this.field3160 = var2.readUnsignedByte() + 1;
        int var29;
        MusicPatchNode2 var41;
        for (var27 = 0; var27 < var12; ++var27) {
            var41 = var39[var27];
            if (var41.field3094 != null) {
                for (var29 = 1; var29 < var41.field3094.length; var29 += 2) {
                    var41.field3094[var29] = var2.readByte();
                }
            }
            if (var41.field3099 != null) {
                for (var29 = 3; var29 < (var41.field3099.length - 2); var29 += 2) {
                    var41.field3099[var29] = var2.readByte();
                }
            }
        }
        if (var44 != null) {
            for (var27 = 1; var27 < var44.length; var27 += 2) {
                var44[var27] = var2.readByte();
            }
        }
        if (var16 != null) {
            for (var27 = 1; var27 < var16.length; var27 += 2) {
                var16[var27] = var2.readByte();
            }
        }
        for (var27 = 0; var27 < var12; ++var27) {
            var41 = var39[var27];
            if (var41.field3099 != null) {
                var19 = 0;
                for (var29 = 2; var29 < var41.field3099.length; var29 += 2) {
                    var19 = (var19 + 1) + var2.readUnsignedByte();
                    var41.field3099[var29] = ((byte) (var19));
                }
            }
        }
        for (var27 = 0; var27 < var12; ++var27) {
            var41 = var39[var27];
            if (var41.field3094 != null) {
                var19 = 0;
                for (var29 = 2; var29 < var41.field3094.length; var29 += 2) {
                    var19 = (1 + var19) + var2.readUnsignedByte();
                    var41.field3094[var29] = ((byte) (var19));
                }
            }
        }
        byte var30;
        int var32;
        int var33;
        int var34;
        int var35;
        int var36;
        int var47;
        byte var49;
        if (var44 != null) {
            var19 = var2.readUnsignedByte();
            var44[0] = ((byte) (var19));
            for (var27 = 2; var27 < var44.length; var27 += 2) {
                var19 = (1 + var19) + var2.readUnsignedByte();
                var44[var27] = ((byte) (var19));
            }
            var49 = var44[0];
            byte var28 = var44[1];
            for (var29 = 0; var29 < var49; ++var29) {
                this.field3156[var29] = ((byte) (((var28 * this.field3156[var29]) + 32) >> 6));
            }
            for (var29 = 2; var29 < var44.length; var29 += 2) {
                var30 = var44[var29];
                byte var31 = var44[var29 + 1];
                var32 = (var28 * (var30 - var49)) + ((var30 - var49) / 2);
                for (var33 = var49; var33 < var30; ++var33) {
                    var35 = var30 - var49;
                    var36 = var32 >>> 31;
                    var34 = ((var36 + var32) / var35) - var36;
                    this.field3156[var33] = ((byte) (((var34 * this.field3156[var33]) + 32) >> 6));
                    var32 += var31 - var28;
                }
                var49 = var30;
                var28 = var31;
            }
            for (var47 = var49; var47 < 128; ++var47) {
                this.field3156[var47] = ((byte) (((var28 * this.field3156[var47]) + 32) >> 6));
            }
            var15 = null;
        }
        if (var16 != null) {
            var19 = var2.readUnsignedByte();
            var16[0] = ((byte) (var19));
            for (var27 = 2; var27 < var16.length; var27 += 2) {
                var19 = (1 + var19) + var2.readUnsignedByte();
                var16[var27] = ((byte) (var19));
            }
            var49 = var16[0];
            int var46 = var16[1] << 1;
            for (var29 = 0; var29 < var49; ++var29) {
                var47 = var46 + (this.field3161[var29] & 255);
                if (var47 < 0) {
                    var47 = 0;
                }
                if (var47 > 128) {
                    var47 = 128;
                }
                this.field3161[var29] = ((byte) (var47));
            }
            int var48;
            for (var29 = 2; var29 < var16.length; var29 += 2) {
                var30 = var16[var29];
                var48 = var16[var29 + 1] << 1;
                var32 = (var46 * (var30 - var49)) + ((var30 - var49) / 2);
                for (var33 = var49; var33 < var30; ++var33) {
                    var35 = var30 - var49;
                    var36 = var32 >>> 31;
                    var34 = ((var36 + var32) / var35) - var36;
                    int var37 = var34 + (this.field3161[var33] & 255);
                    if (var37 < 0) {
                        var37 = 0;
                    }
                    if (var37 > 128) {
                        var37 = 128;
                    }
                    this.field3161[var33] = ((byte) (var37));
                    var32 += var48 - var46;
                }
                var49 = var30;
                var46 = var48;
            }
            for (var47 = var49; var47 < 128; ++var47) {
                var48 = var46 + (this.field3161[var47] & 255);
                if (var48 < 0) {
                    var48 = 0;
                }
                if (var48 > 128) {
                    var48 = 128;
                }
                this.field3161[var47] = ((byte) (var48));
            }
            Object var45 = null;
        }
        for (var27 = 0; var27 < var12; ++var27) {
            var39[var27].field3095 = var2.readUnsignedByte();
        }
        for (var27 = 0; var27 < var12; ++var27) {
            var41 = var39[var27];
            if (var41.field3094 != null) {
                var41.field3096 = var2.readUnsignedByte();
            }
            if (var41.field3099 != null) {
                var41.field3097 = var2.readUnsignedByte();
            }
            if (var41.field3095 > 0) {
                var41.field3098 = var2.readUnsignedByte();
            }
        }
        for (var27 = 0; var27 < var12; ++var27) {
            var39[var27].field3100 = var2.readUnsignedByte();
        }
        for (var27 = 0; var27 < var12; ++var27) {
            var41 = var39[var27];
            if (var41.field3100 > 0) {
                var41.field3102 = var2.readUnsignedByte();
            }
        }
        for (var27 = 0; var27 < var12; ++var27) {
            var41 = var39[var27];
            if (var41.field3102 > 0) {
                var41.field3101 = var2.readUnsignedByte();
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Lau;[B[II)Z", garbageValue = "1378476376")
    boolean method5223(SoundCache var1, byte[] var2, int[] var3) {
        boolean var4 = true;
        int var5 = 0;
        RawSound var6 = null;
        for (int var7 = 0; var7 < 128; ++var7) {
            if ((var2 == null) || (var2[var7] != 0)) {
                int var8 = this.field3158[var7];
                if (var8 != 0) {
                    if (var8 != var5) {
                        var5 = var8--;
                        if ((var8 & 1) == 0) {
                            var6 = var1.getSoundEffect(var8 >> 2, var3);
                        } else {
                            var6 = var1.getMusicSample(var8 >> 2, var3);
                        }
                        if (var6 == null) {
                            var4 = false;
                        }
                    }
                    if (var6 != null) {
                        this.rawSounds[var7] = var6;
                        this.field3158[var7] = 0;
                    }
                }
            }
        }
        return var4;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2048555855")
    @Export("clear")
    void clear() {
        this.field3158 = null;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "([Ljava/lang/String;[SIIB)V", garbageValue = "24")
    @Export("sortItemsByName")
    static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
        if (var2 < var3) {
            int var4 = (var3 + var2) / 2;
            int var5 = var2;
            String var6 = var0[var4];
            var0[var4] = var0[var3];
            var0[var3] = var6;
            short var7 = var1[var4];
            var1[var4] = var1[var3];
            var1[var3] = var7;
            for (int var8 = var2; var8 < var3; ++var8) {
                if ((var6 == null) || ((var0[var8] != null) && (var0[var8].compareTo(var6) < (var8 & 1)))) {
                    String var9 = var0[var8];
                    var0[var8] = var0[var5];
                    var0[var5] = var9;
                    short var10 = var1[var8];
                    var1[var8] = var1[var5];
                    var1[var5++] = var10;
                }
            }
            var0[var3] = var0[var5];
            var0[var5] = var6;
            var1[var3] = var1[var5];
            var1[var5] = var7;
            sortItemsByName(var0, var1, var2, var5 - 1);
            sortItemsByName(var0, var1, var5 + 1, var3);
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(B)Lbi;", garbageValue = "19")
    @Export("worldListStart")
    static World worldListStart() {
        World.World_listCount = 0;
        return class114.getNextWorldListWorld();
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "9")
    static int method5236(int var0, Script var1, boolean var2) {
        if (var0 == 7100) {
            ++Interpreter.Interpreter_intStackSize;
            return 1;
        } else if (var0 == 7101) {
            BufferedNetSocket.Interpreter_stringStackSize += 2;
            return 1;
        } else if (((((var0 != 7102) && (var0 != 7103)) && (var0 != 7104)) && (var0 != 7105)) && (var0 != 7109)) {
            if (var0 == 7106) {
                ++Interpreter.Interpreter_intStackSize;
                return 1;
            } else if (var0 == 7107) {
                ++Interpreter.Interpreter_intStackSize;
                return 1;
            } else if (var0 == 7108) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class17.method247()) ? 1 : 0;
                return 1;
            } else if (var0 == 7110) {
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                return 1;
            } else if (var0 == 7120) {
                --Interpreter.Interpreter_intStackSize;
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                return 1;
            } else if (var0 == 7121) {
                Interpreter.Interpreter_intStackSize -= 2;
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                return 1;
            } else if (var0 == 7122) {
                Interpreter.Interpreter_intStackSize -= 2;
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                return 1;
            } else {
                return 2;
            }
        } else {
            ++Interpreter.Interpreter_intStackSize;
            return 1;
        }
    }

    @ObfuscatedName("fp")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1603196432")
    static void method5233() {
        Client.mouseLastLastPressedTimeMillis = -1L;
        PacketWriter.mouseRecorder.index = 0;
        class297.hasFocus = true;
        Client.hadFocus = true;
        Client.field685 = -1L;
        KeyHandler.method353();
        Client.packetWriter.clearBuffer();
        Client.packetWriter.packetBuffer.offset = 0;
        Client.packetWriter.serverPacket = null;
        Client.packetWriter.field1325 = null;
        Client.packetWriter.field1326 = null;
        Client.packetWriter.field1327 = null;
        Client.packetWriter.serverPacketLength = 0;
        Client.packetWriter.field1323 = 0;
        Client.rebootTimer = 0;
        Client.logoutTimer = 0;
        Client.hintArrowType = 0;
        HitSplatDefinition.method3454();
        Script.method1993(0);
        AttackOption.method2288();
        Client.isItemSelected = 0;
        Client.isSpellSelected = false;
        Client.soundEffectCount = 0;
        Client.camAngleY = 0;
        Client.oculusOrbState = 0;
        class9.field58 = null;
        Client.minimapState = 0;
        Client.field735 = -1;
        Client.destinationX = 0;
        Client.destinationY = 0;
        Client.playerAttackOption = AttackOption.AttackOption_hidden;
        Client.npcAttackOption = AttackOption.AttackOption_hidden;
        Client.npcCount = 0;
        ClientPacket.method4977();
        int var0;
        for (var0 = 0; var0 < 2048; ++var0) {
            Client.players[var0] = null;
        }
        for (var0 = 0; var0 < 32768; ++var0) {
            Client.npcs[var0] = null;
        }
        Client.combatTargetPlayerIndex = -1;
        Client.projectiles.clear();
        Client.graphicsObjects.clear();
        for (var0 = 0; var0 < 4; ++var0) {
            for (int var4 = 0; var4 < 104; ++var4) {
                for (int var2 = 0; var2 < 104; ++var2) {
                    Client.groundItems[var0][var4][var2] = null;
                }
            }
        }
        Client.pendingSpawns = new NodeDeque();
        ClanSettings.friendSystem.clear();
        for (var0 = 0; var0 < VarpDefinition.VarpDefinition_fileCount; ++var0) {
            VarpDefinition var1 = PcmPlayer.VarpDefinition_get(var0);
            if (var1 != null) {
                Varps.Varps_temp[var0] = 0;
                Varps.Varps_main[var0] = 0;
            }
        }
        JagexCache.varcs.clearTransient();
        Client.followerIndex = -1;
        if (Client.rootInterface != (-1)) {
            MusicPatchNode.method5276(Client.rootInterface);
        }
        for (InterfaceParent var3 = ((InterfaceParent) (Client.interfaceParents.first())); var3 != null; var3 = ((InterfaceParent) (Client.interfaceParents.next()))) {
            class127.closeInterface(var3, true);
        }
        Client.rootInterface = -1;
        Client.interfaceParents = new NodeHashTable(8);
        Client.meslayerContinueWidget = null;
        HitSplatDefinition.method3454();
        Client.playerAppearance.update(((int[]) (null)), new int[]{ 0, 0, 0, 0, 0 }, false, -1);
        for (var0 = 0; var0 < 8; ++var0) {
            Client.playerMenuActions[var0] = null;
            Client.playerOptionsPriorities[var0] = false;
        }
        ItemContainer.itemContainers = new NodeHashTable(32);
        Client.isLoading = true;
        for (var0 = 0; var0 < 100; ++var0) {
            Client.field713[var0] = true;
        }
        DesktopPlatformInfoProvider.method6847();
        class67.friendsChat = null;
        UserComparator7.guestClanSettings = null;
        Arrays.fill(Client.currentClanSettings, ((Object) (null)));
        InterfaceParent.guestClanChannel = null;
        Arrays.fill(Client.currentClanChannels, ((Object) (null)));
        for (var0 = 0; var0 < 8; ++var0) {
            Client.grandExchangeOffers[var0] = new GrandExchangeOffer();
        }
        class135.grandExchangeEvents = null;
    }
}