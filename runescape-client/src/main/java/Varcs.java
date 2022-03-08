import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@Deprecated
@ObfuscatedName("ct")
@Implements("Varcs")
public class Varcs {
    @ObfuscatedName("eo")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive20")
    static Archive archive20;

    @ObfuscatedName("hr")
    @Export("regionMapArchiveIds")
    static int[] regionMapArchiveIds;

    @ObfuscatedName("ip")
    @ObfuscatedSignature(descriptor = "[Lpt;")
    @Export("mapMarkerSprites")
    static SpritePixels[] mapMarkerSprites;

    @ObfuscatedName("s")
    @Export("intsPersistence")
    boolean[] intsPersistence;

    @ObfuscatedName("e")
    @Export("map")
    Map map;

    @ObfuscatedName("r")
    @Export("strings")
    String[] strings;

    @ObfuscatedName("o")
    @Export("unwrittenChanges")
    boolean unwrittenChanges;

    @ObfuscatedName("i")
    @ObfuscatedGetter(longValue = 7617412601181389901L)
    long field1298;

    Varcs() {
        this.unwrittenChanges = false;
        int var1 = FriendLoginUpdate.archive2.getGroupFileCount(19);
        this.map = new HashMap();
        this.intsPersistence = new boolean[var1];
        int var2;
        for (var2 = 0; var2 < var1; ++var2) {
            VarcInt var3 = HealthBarDefinition.method3244(var2);
            this.intsPersistence[var2] = var3.persist;
        }
        var2 = 0;
        if (FriendLoginUpdate.archive2.method5530(15)) {
            var2 = FriendLoginUpdate.archive2.getGroupFileCount(15);
        }
        this.strings = new String[var2];
        this.read();
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-263295047")
    @Export("setInt")
    void setInt(int var1, int var2) {
        this.map.put(var1, var2);
        if (this.intsPersistence[var1]) {
            this.unwrittenChanges = true;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1030542246")
    @Export("getInt")
    int getInt(int var1) {
        Object var2 = this.map.get(var1);
        return var2 instanceof Integer ? ((Integer) (var2)) : -1;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)V", garbageValue = "-147699187")
    @Export("setString")
    void setString(int var1, String var2) {
        this.map.put(var1, var2);
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-80232321")
    @Export("getString")
    String getString(int var1) {
        Object var2 = this.map.get(var1);
        return var2 instanceof String ? ((String) (var2)) : "";
    }

    @Deprecated
    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;B)V", garbageValue = "28")
    @Export("setStringOld")
    void setStringOld(int var1, String var2) {
        this.strings[var1] = var2;
    }

    @Deprecated
    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "1270462568")
    @Export("getStringOld")
    String getStringOld(int var1) {
        return this.strings[var1];
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-387935350")
    @Export("clearTransient")
    void clearTransient() {
        int var1;
        for (var1 = 0; var1 < this.intsPersistence.length; ++var1) {
            if (!this.intsPersistence[var1]) {
                this.map.remove(var1);
            }
        }
        for (var1 = 0; var1 < this.strings.length; ++var1) {
            this.strings[var1] = null;
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(ZI)Loo;", garbageValue = "-1595550053")
    @Export("getPreferencesFile")
    AccessFile getPreferencesFile(boolean var1) {
        return VarbitComposition.getPreferencesFile("2", HorizontalAlignment.field1846.name, var1);
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1952727021")
    @Export("write")
    void write() {
        AccessFile var1 = this.getPreferencesFile(true);
        try {
            int var2 = 3;
            int var3 = 0;
            Iterator var4 = this.map.entrySet().iterator();
            while (var4.hasNext()) {
                Entry var5 = ((Entry) (var4.next()));
                int var6 = ((Integer) (var5.getKey()));
                if (this.intsPersistence[var6]) {
                    Object var7 = var5.getValue();
                    var2 += 3;
                    if (var7 instanceof Integer) {
                        var2 += 4;
                    } else if (var7 instanceof String) {
                        var2 += GrandExchangeEvents.stringCp1252NullTerminatedByteSize(((String) (var7)));
                    }
                    ++var3;
                }
            } 
            Buffer var23 = new Buffer(var2);
            var23.writeByte(2);
            var23.writeShort(var3);
            Iterator var24 = this.map.entrySet().iterator();
            while (var24.hasNext()) {
                Entry var12 = ((Entry) (var24.next()));
                int var13 = ((Integer) (var12.getKey()));
                if (this.intsPersistence[var13]) {
                    var23.writeShort(var13);
                    Object var8 = var12.getValue();
                    class414 var9 = class414.method7269(var8.getClass());
                    var23.writeByte(var9.field4491);
                    class414.method7256(var8, var23);
                }
            } 
            var1.write(var23.array, 0, var23.offset);
        } catch (Exception var21) {
        } finally {
            try {
                var1.close();
            } catch (Exception var20) {
            }
        }
        this.unwrittenChanges = false;
        this.field1298 = DirectByteArrayCopier.getServerTime();
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1045416279")
    @Export("read")
    void read() {
        AccessFile var1 = this.getPreferencesFile(false);
        label224 : {
            try {
                byte[] var2 = new byte[((int) (var1.length()))];
                int var4;
                for (int var3 = 0; var3 < var2.length; var3 += var4) {
                    var4 = var1.read(var2, var3, var2.length - var3);
                    if (var4 == (-1)) {
                        throw new EOFException();
                    }
                }
                Buffer var14 = new Buffer(var2);
                if ((var14.array.length - var14.offset) < 1) {
                    return;
                }
                int var15 = var14.readUnsignedByte();
                if ((var15 >= 0) && (var15 <= 2)) {
                    int var7;
                    int var8;
                    int var9;
                    int var16;
                    if (var15 >= 2) {
                        var16 = var14.readUnsignedShort();
                        var7 = 0;
                        while (true) {
                            if (var7 >= var16) {
                                break label224;
                            }
                            var8 = var14.readUnsignedShort();
                            var9 = var14.readUnsignedByte();
                            class414 var10 = ((class414) (class140.findEnumerated(class414.method7264(), var9)));
                            Object var11 = var10.method7259(var14);
                            if (this.intsPersistence[var8]) {
                                this.map.put(var8, var11);
                            }
                            ++var7;
                        } 
                    } else {
                        var16 = var14.readUnsignedShort();
                        for (var7 = 0; var7 < var16; ++var7) {
                            var8 = var14.readUnsignedShort();
                            var9 = var14.readInt();
                            if (this.intsPersistence[var8]) {
                                this.map.put(var8, var9);
                            }
                        }
                        var7 = var14.readUnsignedShort();
                        var8 = 0;
                        while (true) {
                            if (var8 >= var7) {
                                break label224;
                            }
                            var14.readUnsignedShort();
                            var14.readStringCp1252NullTerminated();
                            ++var8;
                        } 
                    }
                }
            } catch (Exception var25) {
                break label224;
            } finally {
                try {
                    var1.close();
                } catch (Exception var24) {
                }
            }
            return;
        }
        this.unwrittenChanges = false;
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "16777215")
    @Export("tryWrite")
    void tryWrite() {
        if (this.unwrittenChanges && (this.field1298 < (DirectByteArrayCopier.getServerTime() - 60000L))) {
            this.write();
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "16")
    @Export("hasUnwrittenChanges")
    boolean hasUnwrittenChanges() {
        return this.unwrittenChanges;
    }
}