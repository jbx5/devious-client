import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ci")
@Implements("Players")
public class Players {
    @ObfuscatedName("s")
    static byte[] field1276;

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "[Lgl;")
    static class185[] field1277;

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "[Lpi;")
    static Buffer[] field1278;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -997920691)
    @Export("Players_count")
    static int Players_count;

    @ObfuscatedName("i")
    @Export("Players_indices")
    static int[] Players_indices;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 295337231)
    @Export("Players_emptyIdxCount")
    static int Players_emptyIdxCount;

    @ObfuscatedName("v")
    @Export("Players_emptyIndices")
    static int[] Players_emptyIndices;

    @ObfuscatedName("a")
    @Export("Players_regions")
    static int[] Players_regions;

    @ObfuscatedName("y")
    @Export("Players_orientations")
    static int[] Players_orientations;

    @ObfuscatedName("u")
    @Export("Players_targetIndices")
    static int[] Players_targetIndices;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 221870495)
    @Export("Players_pendingUpdateCount")
    static int Players_pendingUpdateCount;

    @ObfuscatedName("q")
    @Export("Players_pendingUpdateIndices")
    static int[] Players_pendingUpdateIndices;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "Lpi;")
    static Buffer field1275;

    @ObfuscatedName("gv")
    @ObfuscatedSignature(descriptor = "Llv;")
    @Export("fontPlain12")
    static Font fontPlain12;

    static {
        field1276 = new byte[2048];
        field1277 = new class185[2048];
        field1278 = new Buffer[2048];
        Players_count = 0;
        Players_indices = new int[2048];
        Players_emptyIdxCount = 0;
        Players_emptyIndices = new int[2048];
        Players_regions = new int[2048];
        Players_orientations = new int[2048];
        Players_targetIndices = new int[2048];
        Players_pendingUpdateCount = 0;
        Players_pendingUpdateIndices = new int[2048];
        field1275 = new Buffer(new byte[5000]);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)Lbl;", garbageValue = "-502833726")
    @Export("getScript")
    static Script getScript(int var0) {
        Script var1 = ((Script) (Script.Script_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = class148.archive12.takeFile(var0, 0);
            if (var2 == null) {
                return null;
            } else {
                var1 = ScriptFrame.newScript(var2);
                Script.Script_cached.put(var1, ((long) (var0)));
                return var1;
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(CLlu;I)C", garbageValue = "1415681673")
    @Export("standardizeChar")
    static char standardizeChar(char var0, Language var1) {
        if ((var0 >= 192) && (var0 <= 255)) {
            if ((var0 >= 192) && (var0 <= 198)) {
                return 'A';
            }
            if (var0 == 199) {
                return 'C';
            }
            if ((var0 >= 200) && (var0 <= 203)) {
                return 'E';
            }
            if ((var0 >= 204) && (var0 <= 207)) {
                return 'I';
            }
            if ((var0 == 209) && (var1 != Language.Language_ES)) {
                return 'N';
            }
            if ((var0 >= 210) && (var0 <= 214)) {
                return 'O';
            }
            if ((var0 >= 217) && (var0 <= 220)) {
                return 'U';
            }
            if (var0 == 221) {
                return 'Y';
            }
            if (var0 == 223) {
                return 's';
            }
            if ((var0 >= 224) && (var0 <= 230)) {
                return 'a';
            }
            if (var0 == 231) {
                return 'c';
            }
            if ((var0 >= 232) && (var0 <= 235)) {
                return 'e';
            }
            if ((var0 >= 236) && (var0 <= 239)) {
                return 'i';
            }
            if ((var0 == 241) && (var1 != Language.Language_ES)) {
                return 'n';
            }
            if ((var0 >= 242) && (var0 <= 246)) {
                return 'o';
            }
            if ((var0 >= 249) && (var0 <= 252)) {
                return 'u';
            }
            if ((var0 == 253) || (var0 == 255)) {
                return 'y';
            }
        }
        if (var0 == 338) {
            return 'O';
        } else if (var0 == 339) {
            return 'o';
        } else if (var0 == 376) {
            return 'Y';
        } else {
            return var0;
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "([Lbi;II[I[IB)V", garbageValue = "16")
    @Export("sortWorlds")
    static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
        if (var1 < var2) {
            int var5 = var1 - 1;
            int var6 = var2 + 1;
            int var7 = (var2 + var1) / 2;
            World var8 = var0[var7];
            var0[var7] = var0[var1];
            var0[var1] = var8;
            while (var5 < var6) {
                boolean var9 = true;
                int var10;
                int var11;
                int var12;
                do {
                    --var6;
                    for (var10 = 0; var10 < 4; ++var10) {
                        if (var3[var10] == 2) {
                            var11 = var0[var6].index;
                            var12 = var8.index;
                        } else if (var3[var10] == 1) {
                            var11 = var0[var6].population;
                            var12 = var8.population;
                            if ((var11 == (-1)) && (var4[var10] == 1)) {
                                var11 = 2001;
                            }
                            if ((var12 == (-1)) && (var4[var10] == 1)) {
                                var12 = 2001;
                            }
                        } else if (var3[var10] == 3) {
                            var11 = (var0[var6].isMembersOnly()) ? 1 : 0;
                            var12 = (var8.isMembersOnly()) ? 1 : 0;
                        } else {
                            var11 = var0[var6].id;
                            var12 = var8.id;
                        }
                        if (var12 != var11) {
                            if (((var4[var10] != 1) || (var11 <= var12)) && ((var4[var10] != 0) || (var11 >= var12))) {
                                var9 = false;
                            }
                            break;
                        }
                        if (var10 == 3) {
                            var9 = false;
                        }
                    }
                } while (var9 );
                var9 = true;
                do {
                    ++var5;
                    for (var10 = 0; var10 < 4; ++var10) {
                        if (var3[var10] == 2) {
                            var11 = var0[var5].index;
                            var12 = var8.index;
                        } else if (var3[var10] == 1) {
                            var11 = var0[var5].population;
                            var12 = var8.population;
                            if ((var11 == (-1)) && (var4[var10] == 1)) {
                                var11 = 2001;
                            }
                            if ((var12 == (-1)) && (var4[var10] == 1)) {
                                var12 = 2001;
                            }
                        } else if (var3[var10] == 3) {
                            var11 = (var0[var5].isMembersOnly()) ? 1 : 0;
                            var12 = (var8.isMembersOnly()) ? 1 : 0;
                        } else {
                            var11 = var0[var5].id;
                            var12 = var8.id;
                        }
                        if (var12 != var11) {
                            if (((var4[var10] != 1) || (var11 >= var12)) && ((var4[var10] != 0) || (var11 <= var12))) {
                                var9 = false;
                            }
                            break;
                        }
                        if (var10 == 3) {
                            var9 = false;
                        }
                    }
                } while (var9 );
                if (var5 < var6) {
                    World var13 = var0[var5];
                    var0[var5] = var0[var6];
                    var0[var6] = var13;
                }
            } 
            sortWorlds(var0, var1, var6, var3, var4);
            sortWorlds(var0, var6 + 1, var2, var3, var4);
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "187224492")
    static boolean method2308(char var0) {
        for (int var1 = 0; var1 < "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".length(); ++var1) {
            if (var0 == "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:\'@#~,<.>/?\\| ".charAt(var1)) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("az")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "97")
    static int method2305(int var0, Script var1, boolean var2) {
        if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (class6.loadWorlds()) ? 1 : 0;
            return 1;
        } else {
            World var9;
            if (var0 == ScriptOpcodes.WORLDLIST_START) {
                var9 = MusicPatch.worldListStart();
                if (var9 != null) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.id;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.properties;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var9.activity;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.location;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.population;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var9.host;
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                }
                return 1;
            } else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
                var9 = class114.getNextWorldListWorld();
                if (var9 != null) {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.id;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.properties;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var9.activity;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.location;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var9.population;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var9.host;
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                }
                return 1;
            } else {
                int var3;
                World var7;
                int var8;
                if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    var7 = null;
                    for (var8 = 0; var8 < World.World_count; ++var8) {
                        if (var3 == class33.World_worlds[var8].id) {
                            var7 = class33.World_worlds[var8];
                            break;
                        }
                    }
                    if (var7 != null) {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.id;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.properties;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var7.activity;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.location;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.population;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var7.host;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    }
                    return 1;
                } else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
                    Interpreter.Interpreter_intStackSize -= 4;
                    var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                    boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
                    var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
                    boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
                    class126.sortWorldList(var3, var10, var8, var6);
                    return 1;
                } else if (var0 != 6511) {
                    if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
                        Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
                        return 1;
                    } else {
                        int var4;
                        ParamComposition var5;
                        if (var0 == ScriptOpcodes.NC_PARAM) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            var5 = HealthBarUpdate.getParamDefinition(var4);
                            if (var5.isString()) {
                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = UserComparator10.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
                            } else {
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = UserComparator10.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
                            }
                            return 1;
                        } else if (var0 == ScriptOpcodes.LC_PARAM) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            var5 = HealthBarUpdate.getParamDefinition(var4);
                            if (var5.isString()) {
                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = ParamComposition.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
                            } else {
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ParamComposition.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
                            }
                            return 1;
                        } else if (var0 == ScriptOpcodes.OC_PARAM) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            var5 = HealthBarUpdate.getParamDefinition(var4);
                            if (var5.isString()) {
                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = Client.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
                            } else {
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
                            }
                            return 1;
                        } else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
                            Interpreter.Interpreter_intStackSize -= 2;
                            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
                            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
                            var5 = HealthBarUpdate.getParamDefinition(var4);
                            if (var5.isString()) {
                                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = class136.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
                            } else {
                                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = class136.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
                            }
                            return 1;
                        } else if (var0 == ScriptOpcodes.ON_MOBILE) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (Client.onMobile) ? 1 : 0;
                            return 1;
                        } else if (var0 == ScriptOpcodes.CLIENTTYPE) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.clientType;
                            return 1;
                        } else if (var0 == 6520) {
                            return 1;
                        } else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
                            return 1;
                        } else if (var0 == 6522) {
                            --BufferedNetSocket.Interpreter_stringStackSize;
                            --Interpreter.Interpreter_intStackSize;
                            return 1;
                        } else if (var0 == 6523) {
                            --BufferedNetSocket.Interpreter_stringStackSize;
                            --Interpreter.Interpreter_intStackSize;
                            return 1;
                        } else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                            return 1;
                        } else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                            return 1;
                        } else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 1;
                            return 1;
                        } else if (var0 == 6527) {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.field502;
                            return 1;
                        } else {
                            return 2;
                        }
                    }
                } else {
                    var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                    if ((var3 >= 0) && (var3 < World.World_count)) {
                        var7 = class33.World_worlds[var3];
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.id;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.properties;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var7.activity;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.location;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.population;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var7.host;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "";
                    }
                    return 1;
                }
            }
        }
    }
}