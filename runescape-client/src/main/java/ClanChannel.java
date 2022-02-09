import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("eg")
@Implements("ClanChannel")
public class ClanChannel extends Node {
    @ObfuscatedName("c")
    boolean field1663;

    @ObfuscatedName("l")
    boolean field1657;

    @ObfuscatedName("s")
    @Export("members")
    public List members;

    @ObfuscatedName("e")
    @Export("sortedMembers")
    int[] sortedMembers;

    @ObfuscatedName("r")
    @ObfuscatedGetter(longValue = 4772024494693371989L)
    long field1660;

    @ObfuscatedName("o")
    @Export("name")
    public String name;

    @ObfuscatedName("i")
    public byte field1656;

    @ObfuscatedName("w")
    public byte field1658;

    static {
        new BitSet(65536);
    }

    @ObfuscatedSignature(descriptor = "(Lpi;)V")
    public ClanChannel(Buffer var1) {
        this.field1657 = true;
        this.name = null;
        this.method2991(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "564190789")
    @Export("getSortedMembers")
    public int[] getSortedMembers() {
        if (this.sortedMembers == null) {
            String[] var1 = new String[this.members.size()];
            this.sortedMembers = new int[this.members.size()];
            for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
                var1[var2] = ((ClanChannelMember) (this.members.get(var2))).username.method7949();
            }
            int[] var3 = this.sortedMembers;
            UrlRequester.method2421(var1, var3, 0, var1.length - 1);
        }
        return this.sortedMembers;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ldc;B)V", garbageValue = "-73")
    @Export("addMember")
    void addMember(ClanChannelMember var1) {
        this.members.add(var1);
        this.sortedMembers = null;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "503357714")
    @Export("removeMember")
    void removeMember(int var1) {
        this.members.remove(var1);
        this.sortedMembers = null;
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-448680935")
    public int method2982() {
        return this.members.size();
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "932031898")
    public int method2984(String var1) {
        if (!this.field1657) {
            throw new RuntimeException("Displaynames not available");
        } else {
            for (int var2 = 0; var2 < this.members.size(); ++var2) {
                if (((ClanChannelMember) (this.members.get(var2))).username.getName().equalsIgnoreCase(var1)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "-336394177")
    void method2991(Buffer var1) {
        int var2 = var1.readUnsignedByte();
        if ((var2 & 1) != 0) {
            this.field1663 = true;
        }
        if ((var2 & 2) != 0) {
            this.field1657 = true;
        }
        int var3 = 2;
        if ((var2 & 4) != 0) {
            var3 = var1.readUnsignedByte();
        }
        super.key = var1.readLong();
        this.field1660 = var1.readLong();
        this.name = var1.readStringCp1252NullTerminated();
        var1.readBoolean();
        this.field1658 = var1.readByte();
        this.field1656 = var1.readByte();
        int var4 = var1.readUnsignedShort();
        if (var4 > 0) {
            this.members = new ArrayList(var4);
            for (int var5 = 0; var5 < var4; ++var5) {
                ClanChannelMember var6 = new ClanChannelMember();
                if (this.field1663) {
                    var1.readLong();
                }
                if (this.field1657) {
                    var6.username = new Username(var1.readStringCp1252NullTerminated());
                }
                var6.rank = var1.readByte();
                var6.world = var1.readUnsignedShort();
                if (var3 >= 3) {
                    var1.readBoolean();
                }
                this.members.add(var5, var6);
            }
        }
    }
}