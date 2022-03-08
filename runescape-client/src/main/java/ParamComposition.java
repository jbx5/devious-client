import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fl")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("ParamDefinition_archive")
    public static AbstractArchive ParamDefinition_archive;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lic;")
    @Export("ParamDefinition_cached")
    static EvictingDualNodeHashTable ParamDefinition_cached;

    @ObfuscatedName("ol")
    @ObfuscatedGetter(intValue = 448976703)
    static int field1938;

    @ObfuscatedName("s")
    @Export("type")
    char type;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -223058499)
    @Export("defaultInt")
    public int defaultInt;

    @ObfuscatedName("r")
    @Export("defaultStr")
    public String defaultStr;

    @ObfuscatedName("o")
    @Export("autoDisable")
    boolean autoDisable;

    static {
        ParamDefinition_cached = new EvictingDualNodeHashTable(64);
    }

    ParamComposition() {
        this.autoDisable = true;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-14")
    @Export("postDecode")
    void postDecode() {
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "1681074183")
    @Export("decode")
    void decode(Buffer var1) {
        while (true) {
            int var2 = var1.readUnsignedByte();
            if (var2 == 0) {
                return;
            }
            this.decodeNext(var1, var2);
        } 
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(Lpi;II)V", garbageValue = "1518510708")
    @Export("decodeNext")
    void decodeNext(Buffer var1, int var2) {
        if (var2 == 1) {
            byte var4 = var1.readByte();
            int var5 = var4 & 255;
            if (var5 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var5, 16));
            }
            if ((var5 >= 128) && (var5 < 160)) {
                char var6 = class333.cp1252AsciiExtension[var5 - 128];
                if (var6 == 0) {
                    var6 = '?';
                }
                var5 = var6;
            }
            char var3 = ((char) (var5));
            this.type = var3;
        } else if (var2 == 2) {
            this.defaultInt = var1.readInt();
        } else if (var2 == 4) {
            this.autoDisable = false;
        } else if (var2 == 5) {
            this.defaultStr = var1.readStringCp1252NullTerminated();
        }
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1954682272")
    @Export("isString")
    public boolean isString() {
        return this.type == 's';
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)J", garbageValue = "1598733625")
    static long method3381(CharSequence var0) {
        long var1 = 0L;
        int var3 = var0.length();
        for (int var4 = 0; var4 < var3; ++var4) {
            var1 *= 37L;
            char var5 = var0.charAt(var4);
            if ((var5 >= 'A') && (var5 <= 'Z')) {
                var1 += ((long) ((var5 + 1) - 65));
            } else if ((var5 >= 'a') && (var5 <= 'z')) {
                var1 += ((long) ((var5 + 1) - 97));
            } else if ((var5 >= '0') && (var5 <= '9')) {
                var1 += ((long) ((var5 + 27) - 48));
            }
            if (var1 >= 177917621779460413L) {
                break;
            }
        }
        while ((0L == (var1 % 37L)) && (var1 != 0L)) {
            var1 /= 37L;
        } 
        return var1;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)Lfg;", garbageValue = "21")
    @Export("getObjectDefinition")
    public static ObjectComposition getObjectDefinition(int var0) {
        ObjectComposition var1 = ((ObjectComposition) (ObjectComposition.ObjectDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = class12.ObjectDefinition_archive.takeFile(6, var0);
            var1 = new ObjectComposition();
            var1.id = var0;
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            var1.postDecode();
            if (var1.isSolid) {
                var1.interactType = 0;
                var1.boolean1 = false;
            }
            ObjectComposition.ObjectDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(ILbl;ZB)I", garbageValue = "98")
    static int method3370(int var0, Script var1, boolean var2) {
        int var3;
        int var6;
        int var9;
        if (var0 == ScriptOpcodes.ENUM_STRING) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            EnumComposition var10 = UserList.getEnum(var3);
            if (var10.outputType != 's') {
            }
            for (var6 = 0; var6 < var10.outputCount; ++var6) {
                if (var9 == var10.keys[var6]) {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var10.strVals[var6];
                    var10 = null;
                    break;
                }
            }
            if (var10 != null) {
                Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var10.defaultStr;
            }
            return 1;
        } else if (var0 != ScriptOpcodes.ENUM) {
            if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
                var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                EnumComposition var4 = UserList.getEnum(var3);
                Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.size();
                return 1;
            } else {
                return 2;
            }
        } else {
            Interpreter.Interpreter_intStackSize -= 4;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            EnumComposition var7 = UserList.getEnum(var5);
            if ((var3 == var7.inputType) && (var9 == var7.outputType)) {
                for (int var8 = 0; var8 < var7.outputCount; ++var8) {
                    if (var6 == var7.keys[var8]) {
                        if (var9 == 115) {
                            Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var7.strVals[var8];
                        } else {
                            Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.intVals[var8];
                        }
                        var7 = null;
                        break;
                    }
                }
                if (var7 != null) {
                    if (var9 == 115) {
                        Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = var7.defaultStr;
                    } else {
                        Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var7.defaultInt;
                    }
                }
                return 1;
            } else {
                if (var9 == 115) {
                    Interpreter.Interpreter_stringStack[(++BufferedNetSocket.Interpreter_stringStackSize) - 1] = "null";
                } else {
                    Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
                }
                return 1;
            }
        }
    }
}