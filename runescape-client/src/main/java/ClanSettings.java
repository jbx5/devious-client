import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ey")
@Implements("ClanSettings")
public class ClanSettings {
    @ObfuscatedName("ty")
    @ObfuscatedSignature(descriptor = "Lbw;")
    @Export("friendSystem")
    public static FriendSystem friendSystem;

    @ObfuscatedName("cy")
    public static char field1610;

    @ObfuscatedName("l")
    @Export("useHashes")
    boolean useHashes;

    @ObfuscatedName("s")
    @Export("useNames")
    boolean useNames;

    @ObfuscatedName("e")
    @ObfuscatedGetter(longValue = 6193170943395029015L)
    long field1588;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 971129915)
    int field1589;

    @ObfuscatedName("o")
    @Export("name")
    public String name;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1750415559)
    int field1601;

    @ObfuscatedName("w")
    @Export("allowGuests")
    public boolean allowGuests;

    @ObfuscatedName("v")
    public byte field1593;

    @ObfuscatedName("a")
    public byte field1594;

    @ObfuscatedName("y")
    public byte field1595;

    @ObfuscatedName("u")
    public byte field1596;

    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -435152399)
    @Export("memberCount")
    public int memberCount;

    @ObfuscatedName("q")
    @Export("memberHashes")
    long[] memberHashes;

    @ObfuscatedName("x")
    @Export("memberRanks")
    public byte[] memberRanks;

    @ObfuscatedName("p")
    @Export("sortedMembers")
    int[] sortedMembers;

    @ObfuscatedName("n")
    int[] field1585;

    @ObfuscatedName("m")
    public int[] field1602;

    @ObfuscatedName("d")
    public boolean[] field1611;

    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -98051531)
    @Export("currentOwner")
    public int currentOwner;

    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1722294379)
    public int field1591;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = -755737021)
    @Export("bannedMemberCount")
    public int bannedMemberCount;

    @ObfuscatedName("t")
    @Export("bannedMemberHashes")
    long[] bannedMemberHashes;

    @ObfuscatedName("k")
    @Export("memberNames")
    public String[] memberNames;

    @ObfuscatedName("b")
    @Export("bannedMemberNames")
    public String[] bannedMemberNames;

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "Lon;")
    @Export("parameters")
    IterableNodeHashTable parameters;

    @ObfuscatedSignature(descriptor = "(Lpi;)V")
    public ClanSettings(Buffer var1) {
        this.field1589 = 0;
        this.name = null;
        this.field1601 = 0;
        this.currentOwner = -1;
        this.field1591 = -1;
        this.method2865(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1970785685")
    void method2884(int var1) {
        if (this.useHashes) {
            if (this.memberHashes != null) {
                System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
            } else {
                this.memberHashes = new long[var1];
            }
        }
        if (this.useNames) {
            if (this.memberNames != null) {
                System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
            } else {
                this.memberNames = new String[var1];
            }
        }
        if (this.memberRanks != null) {
            System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount);
        } else {
            this.memberRanks = new byte[var1];
        }
        if (this.field1585 != null) {
            System.arraycopy(this.field1585, 0, this.field1585 = new int[var1], 0, this.memberCount);
        } else {
            this.field1585 = new int[var1];
        }
        if (this.field1602 != null) {
            System.arraycopy(this.field1602, 0, this.field1602 = new int[var1], 0, this.memberCount);
        } else {
            this.field1602 = new int[var1];
        }
        if (this.field1611 != null) {
            System.arraycopy(this.field1611, 0, this.field1611 = new boolean[var1], 0, this.memberCount);
        } else {
            this.field1611 = new boolean[var1];
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1754163591")
    void method2863(int var1) {
        if (this.useHashes) {
            if (this.bannedMemberHashes != null) {
                System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount);
            } else {
                this.bannedMemberHashes = new long[var1];
            }
        }
        if (this.useNames) {
            if (this.bannedMemberNames != null) {
                System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
            } else {
                this.bannedMemberNames = new String[var1];
            }
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)I", garbageValue = "2")
    public int method2848(String var1) {
        if ((var1 != null) && (var1.length() != 0)) {
            for (int var2 = 0; var2 < this.memberCount; ++var2) {
                if (this.memberNames[var2].equals(var1)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "939210927")
    public int method2849(int var1, int var2, int var3) {
        int var4 = (var3 == 31) ? -1 : (1 << (var3 + 1)) - 1;
        return (this.field1585[var1] & var4) >>> var2;
    }

    @ObfuscatedName("r")
    @ObfuscatedSignature(descriptor = "(IB)Ljava/lang/Integer;", garbageValue = "-31")
    @Export("getTitleGroupValue")
    public Integer getTitleGroupValue(int var1) {
        if (this.parameters == null) {
            return null;
        } else {
            Node var2 = this.parameters.get(((long) (var1)));
            return (var2 != null) && (var2 instanceof IntegerNode) ? new Integer(((IntegerNode) (var2)).integer) : null;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(I)[I", garbageValue = "-1773630970")
    @Export("getSortedMembers")
    public int[] getSortedMembers() {
        if (this.sortedMembers == null) {
            String[] var1 = new String[this.memberCount];
            this.sortedMembers = new int[this.memberCount];
            for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) {
                var1[var2] = this.memberNames[var2];
                if (var1[var2] != null) {
                    var1[var2] = var1[var2].toLowerCase();
                }
            }
            int[] var3 = this.sortedMembers;
            UrlRequester.method2421(var1, var3, 0, var1.length - 1);
        }
        return this.sortedMembers;
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(JLjava/lang/String;II)V", garbageValue = "-71576260")
    void method2859(long var1, String var3, int var4) {
        if ((var3 != null) && (var3.length() == 0)) {
            var3 = null;
        }
        if ((var1 > 0L) != this.useHashes) {
            throw new RuntimeException("");
        } else if ((var3 != null) != this.useNames) {
            throw new RuntimeException("");
        } else {
            if (((var1 > 0L) && ((this.memberHashes == null) || (this.memberCount >= this.memberHashes.length))) || ((var3 != null) && ((this.memberNames == null) || (this.memberCount >= this.memberNames.length)))) {
                this.method2884(this.memberCount + 5);
            }
            if (this.memberHashes != null) {
                this.memberHashes[this.memberCount] = var1;
            }
            if (this.memberNames != null) {
                this.memberNames[this.memberCount] = var3;
            }
            if (this.currentOwner == (-1)) {
                this.currentOwner = this.memberCount;
                this.memberRanks[this.memberCount] = 126;
            } else {
                this.memberRanks[this.memberCount] = 0;
            }
            this.field1585[this.memberCount] = 0;
            this.field1602[this.memberCount] = var4;
            this.field1611[this.memberCount] = false;
            ++this.memberCount;
            this.sortedMembers = null;
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "13")
    void method2853(int var1) {
        if ((var1 >= 0) && (var1 < this.memberCount)) {
            --this.memberCount;
            this.sortedMembers = null;
            if (this.memberCount == 0) {
                this.memberHashes = null;
                this.memberNames = null;
                this.memberRanks = null;
                this.field1585 = null;
                this.field1602 = null;
                this.field1611 = null;
                this.currentOwner = -1;
                this.field1591 = -1;
            } else {
                System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1);
                System.arraycopy(this.field1585, var1 + 1, this.field1585, var1, this.memberCount - var1);
                System.arraycopy(this.field1602, var1 + 1, this.field1602, var1, this.memberCount - var1);
                System.arraycopy(this.field1611, var1 + 1, this.field1611, var1, this.memberCount - var1);
                if (this.memberHashes != null) {
                    System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
                }
                if (this.memberNames != null) {
                    System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
                }
                this.updateOwner();
            }
        } else {
            throw new RuntimeException("");
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "1023")
    @Export("updateOwner")
    void updateOwner() {
        if (this.memberCount == 0) {
            this.currentOwner = -1;
            this.field1591 = -1;
        } else {
            this.currentOwner = -1;
            this.field1591 = -1;
            int var1 = 0;
            byte var2 = this.memberRanks[0];
            for (int var3 = 1; var3 < this.memberCount; ++var3) {
                if (this.memberRanks[var3] > var2) {
                    if (var2 == 125) {
                        this.field1591 = var1;
                    }
                    var1 = var3;
                    var2 = this.memberRanks[var3];
                } else if ((this.field1591 == (-1)) && (this.memberRanks[var3] == 125)) {
                    this.field1591 = var3;
                }
            }
            this.currentOwner = var1;
            if (this.currentOwner != (-1)) {
                this.memberRanks[this.currentOwner] = 126;
            }
        }
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(JLjava/lang/String;I)V", garbageValue = "1107072540")
    void method2877(long var1, String var3) {
        if ((var3 != null) && (var3.length() == 0)) {
            var3 = null;
        }
        if ((var1 > 0L) != this.useHashes) {
            throw new RuntimeException("");
        } else if ((var3 != null) != this.useNames) {
            throw new RuntimeException("");
        } else {
            if (((var1 > 0L) && ((this.bannedMemberHashes == null) || (this.bannedMemberCount >= this.bannedMemberHashes.length))) || ((var3 != null) && ((this.bannedMemberNames == null) || (this.bannedMemberCount >= this.bannedMemberNames.length)))) {
                this.method2863(this.bannedMemberCount + 5);
            }
            if (this.bannedMemberHashes != null) {
                this.bannedMemberHashes[this.bannedMemberCount] = var1;
            }
            if (this.bannedMemberNames != null) {
                this.bannedMemberNames[this.bannedMemberCount] = var3;
            }
            ++this.bannedMemberCount;
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "619414228")
    void method2856(int var1) {
        --this.bannedMemberCount;
        if (this.bannedMemberCount == 0) {
            this.bannedMemberHashes = null;
            this.bannedMemberNames = null;
        } else {
            if (this.bannedMemberHashes != null) {
                System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
            }
            if (this.bannedMemberNames != null) {
                System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1);
            }
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(IBI)I", garbageValue = "-1088330284")
    int method2857(int var1, byte var2) {
        if ((var2 != 126) && (var2 != 127)) {
            if ((this.currentOwner == var1) && ((this.field1591 == (-1)) || (this.memberRanks[this.field1591] < 125))) {
                return -1;
            } else if (this.memberRanks[var1] == var2) {
                return -1;
            } else {
                this.memberRanks[var1] = var2;
                this.updateOwner();
                return var1;
            }
        } else {
            return -1;
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-227021511")
    boolean method2858(int var1) {
        if ((this.currentOwner != var1) && (this.memberRanks[var1] != 126)) {
            this.memberRanks[this.currentOwner] = 125;
            this.field1591 = this.currentOwner;
            this.memberRanks[var1] = 126;
            this.currentOwner = var1;
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(IZI)I", garbageValue = "-1665860662")
    int method2883(int var1, boolean var2) {
        if (this.field1611[var1] == var2) {
            return -1;
        } else {
            this.field1611[var1] = var2;
            return var1;
        }
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(IIIII)I", garbageValue = "1682375489")
    int method2860(int var1, int var2, int var3, int var4) {
        int var5 = (1 << var3) - 1;
        int var6 = (var4 == 31) ? -1 : (1 << (var4 + 1)) - 1;
        int var7 = var6 ^ var5;
        var2 <<= var3;
        var2 &= var7;
        int var8 = this.field1585[var1];
        if ((var8 & var7) == var2) {
            return -1;
        } else {
            var8 &= ~var7;
            this.field1585[var1] = var8 | var2;
            return var1;
        }
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-608921907")
    boolean method2882(int var1, int var2) {
        if (this.parameters != null) {
            Node var3 = this.parameters.get(((long) (var1)));
            if (var3 != null) {
                if (var3 instanceof IntegerNode) {
                    IntegerNode var4 = ((IntegerNode) (var3));
                    if (var2 == var4.integer) {
                        return false;
                    }
                    var4.integer = var2;
                    return true;
                }
                var3.remove();
            }
        } else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new IntegerNode(var2), ((long) (var1)));
        return true;
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(IIIIB)Z", garbageValue = "-83")
    boolean method2862(int var1, int var2, int var3, int var4) {
        int var5 = (1 << var3) - 1;
        int var6 = (var4 == 31) ? -1 : (1 << (var4 + 1)) - 1;
        int var7 = var6 ^ var5;
        var2 <<= var3;
        var2 &= var7;
        if (this.parameters != null) {
            Node var8 = this.parameters.get(((long) (var1)));
            if (var8 != null) {
                if (var8 instanceof IntegerNode) {
                    IntegerNode var9 = ((IntegerNode) (var8));
                    if ((var9.integer & var7) == var2) {
                        return false;
                    }
                    var9.integer &= ~var7;
                    var9.integer |= var2;
                    return true;
                }
                var8.remove();
            }
        } else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new IntegerNode(var2), ((long) (var1)));
        return true;
    }

    @ObfuscatedName("m")
    boolean method2869(int var1, long var2) {
        if (this.parameters != null) {
            Node var4 = this.parameters.get(((long) (var1)));
            if (var4 != null) {
                if (var4 instanceof class389) {
                    class389 var5 = ((class389) (var4));
                    if (var5.field4297 == var2) {
                        return false;
                    }
                    var5.field4297 = var2;
                    return true;
                }
                var4.remove();
            }
        } else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new class389(var2), ((long) (var1)));
        return true;
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;I)Z", garbageValue = "1187187723")
    boolean method2864(int var1, String var2) {
        if (var2 == null) {
            var2 = "";
        } else if (var2.length() > 80) {
            var2 = var2.substring(0, 80);
        }
        if (this.parameters != null) {
            Node var3 = this.parameters.get(((long) (var1)));
            if (var3 != null) {
                if (var3 instanceof ObjectNode) {
                    ObjectNode var4 = ((ObjectNode) (var3));
                    if (var4.obj instanceof String) {
                        if (var2.equals(var4.obj)) {
                            return false;
                        }
                        var4.remove();
                        this.parameters.put(new ObjectNode(var2), var4.key);
                        return true;
                    }
                }
                var3.remove();
            }
        } else {
            this.parameters = new IterableNodeHashTable(4);
        }
        this.parameters.put(new ObjectNode(var2), ((long) (var1)));
        return true;
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "777712617")
    void method2865(Buffer var1) {
        int var2 = var1.readUnsignedByte();
        if ((var2 >= 1) && (var2 <= 6)) {
            int var3 = var1.readUnsignedByte();
            if ((var3 & 1) != 0) {
                this.useHashes = true;
            }
            if ((var3 & 2) != 0) {
                this.useNames = true;
            }
            if (!this.useHashes) {
                this.memberHashes = null;
                this.bannedMemberHashes = null;
            }
            if (!this.useNames) {
                this.memberNames = null;
                this.bannedMemberNames = null;
            }
            this.field1589 = var1.readInt();
            this.field1601 = var1.readInt();
            if ((var2 <= 3) && (this.field1601 != 0)) {
                this.field1601 += 16912800;
            }
            this.memberCount = var1.readUnsignedShort();
            this.bannedMemberCount = var1.readUnsignedByte();
            this.name = var1.readStringCp1252NullTerminated();
            if (var2 >= 4) {
                var1.readInt();
            }
            this.allowGuests = var1.readUnsignedByte() == 1;
            this.field1593 = var1.readByte();
            this.field1594 = var1.readByte();
            this.field1595 = var1.readByte();
            this.field1596 = var1.readByte();
            int var4;
            if (this.memberCount > 0) {
                if (this.useHashes && ((this.memberHashes == null) || (this.memberHashes.length < this.memberCount))) {
                    this.memberHashes = new long[this.memberCount];
                }
                if (this.useNames && ((this.memberNames == null) || (this.memberNames.length < this.memberCount))) {
                    this.memberNames = new String[this.memberCount];
                }
                if ((this.memberRanks == null) || (this.memberRanks.length < this.memberCount)) {
                    this.memberRanks = new byte[this.memberCount];
                }
                if ((this.field1585 == null) || (this.field1585.length < this.memberCount)) {
                    this.field1585 = new int[this.memberCount];
                }
                if ((this.field1602 == null) || (this.field1602.length < this.memberCount)) {
                    this.field1602 = new int[this.memberCount];
                }
                if ((this.field1611 == null) || (this.field1611.length < this.memberCount)) {
                    this.field1611 = new boolean[this.memberCount];
                }
                for (var4 = 0; var4 < this.memberCount; ++var4) {
                    if (this.useHashes) {
                        this.memberHashes[var4] = var1.readLong();
                    }
                    if (this.useNames) {
                        this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
                    }
                    this.memberRanks[var4] = var1.readByte();
                    if (var2 >= 2) {
                        this.field1585[var4] = var1.readInt();
                    }
                    if (var2 >= 5) {
                        this.field1602[var4] = var1.readUnsignedShort();
                    } else {
                        this.field1602[var4] = 0;
                    }
                    if (var2 >= 6) {
                        this.field1611[var4] = var1.readUnsignedByte() == 1;
                    } else {
                        this.field1611[var4] = false;
                    }
                }
                this.updateOwner();
            }
            if (this.bannedMemberCount > 0) {
                if (this.useHashes && ((this.bannedMemberHashes == null) || (this.bannedMemberHashes.length < this.bannedMemberCount))) {
                    this.bannedMemberHashes = new long[this.bannedMemberCount];
                }
                if (this.useNames && ((this.bannedMemberNames == null) || (this.bannedMemberNames.length < this.bannedMemberCount))) {
                    this.bannedMemberNames = new String[this.bannedMemberCount];
                }
                for (var4 = 0; var4 < this.bannedMemberCount; ++var4) {
                    if (this.useHashes) {
                        this.bannedMemberHashes[var4] = var1.readLong();
                    }
                    if (this.useNames) {
                        this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
                    }
                }
            }
            if (var2 >= 3) {
                var4 = var1.readUnsignedShort();
                if (var4 > 0) {
                    this.parameters = new IterableNodeHashTable(var4 < 16 ? GrandExchangeOfferNameComparator.method5702(var4) : 16);
                    while ((var4--) > 0) {
                        int var5 = var1.readInt();
                        int var6 = var5 & 1073741823;
                        int var7 = var5 >>> 30;
                        if (var7 == 0) {
                            int var12 = var1.readInt();
                            this.parameters.put(new IntegerNode(var12), ((long) (var6)));
                        } else if (var7 == 1) {
                            long var10 = var1.readLong();
                            this.parameters.put(new class389(var10), ((long) (var6)));
                        } else if (var7 == 2) {
                            String var8 = var1.readStringCp1252NullTerminated();
                            this.parameters.put(new ObjectNode(var8), ((long) (var6)));
                        }
                    } 
                }
            }
        } else {
            throw new RuntimeException("" + var2);
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llu;B)I", garbageValue = "2")
    @Export("compareStrings")
    public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
        int var3 = var0.length();
        int var4 = var1.length();
        int var5 = 0;
        int var6 = 0;
        char var7 = 0;
        char var8 = 0;
        while (((var5 - var7) < var3) || ((var6 - var8) < var4)) {
            if ((var5 - var7) >= var3) {
                return -1;
            }
            if ((var6 - var8) >= var4) {
                return 1;
            }
            char var9;
            if (var7 != 0) {
                var9 = var7;
                boolean var14 = false;
            } else {
                var9 = var0.charAt(var5++);
            }
            char var10;
            if (var8 != 0) {
                var10 = var8;
                boolean var15 = false;
            } else {
                var10 = var1.charAt(var6++);
            }
            var7 = Skills.method5473(var9);
            var8 = Skills.method5473(var10);
            var9 = Players.standardizeChar(var9, var2);
            var10 = Players.standardizeChar(var10, var2);
            if ((var9 != var10) && (Character.toUpperCase(var9) != Character.toUpperCase(var10))) {
                var9 = Character.toLowerCase(var9);
                var10 = Character.toLowerCase(var10);
                if (var10 != var9) {
                    return UserComparator6.lowercaseChar(var9, var2) - UserComparator6.lowercaseChar(var10, var2);
                }
            }
        } 
        int var16 = Math.min(var3, var4);
        char var12;
        int var17;
        for (var17 = 0; var17 < var16; ++var17) {
            if (var2 == Language.Language_FR) {
                var5 = (var3 - 1) - var17;
                var6 = (var4 - 1) - var17;
            } else {
                var6 = var17;
                var5 = var17;
            }
            char var11 = var0.charAt(var5);
            var12 = var1.charAt(var6);
            if ((var11 != var12) && (Character.toUpperCase(var11) != Character.toUpperCase(var12))) {
                var11 = Character.toLowerCase(var11);
                var12 = Character.toLowerCase(var12);
                if (var12 != var11) {
                    return UserComparator6.lowercaseChar(var11, var2) - UserComparator6.lowercaseChar(var12, var2);
                }
            }
        }
        var17 = var3 - var4;
        if (var17 != 0) {
            return var17;
        } else {
            for (int var18 = 0; var18 < var16; ++var18) {
                var12 = var0.charAt(var18);
                char var13 = var1.charAt(var18);
                if (var13 != var12) {
                    return UserComparator6.lowercaseChar(var12, var2) - UserComparator6.lowercaseChar(var13, var2);
                }
            }
            return 0;
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "944928550")
    static void method2903() {
        Iterator var0 = Messages.Messages_hashTable.iterator();
        while (var0.hasNext()) {
            Message var1 = ((Message) (var0.next()));
            var1.clearIsFromFriend();
        } 
    }
}