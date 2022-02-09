import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mk")
@Implements("UserList")
public abstract class UserList {
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -2122754397)
    @Export("capacity")
    final int capacity;

    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = 1047417793)
    @Export("size")
    int size;

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "[Lmy;")
    @Export("array")
    User[] array;

    @ObfuscatedName("u")
    @Export("usernamesMap")
    HashMap usernamesMap;

    @ObfuscatedName("h")
    @Export("previousUsernamesMap")
    HashMap previousUsernamesMap;

    @ObfuscatedName("q")
    @Export("comparator")
    Comparator comparator;

    UserList(int var1) {
        this.size = 0;
        this.comparator = null;
        this.capacity = var1;
        this.array = this.newTypedArray(var1);
        this.usernamesMap = new HashMap(var1 / 8);
        this.previousUsernamesMap = new HashMap(var1 / 8);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Lmy;", garbageValue = "2000225121")
    @Export("newInstance")
    abstract User newInstance();

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)[Lmy;", garbageValue = "55")
    @Export("newTypedArray")
    abstract User[] newTypedArray(int var1);

    @ObfuscatedName("aa")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-661540097")
    @Export("clear")
    public void clear() {
        this.size = 0;
        Arrays.fill(this.array, ((Object) (null)));
        this.usernamesMap.clear();
        this.previousUsernamesMap.clear();
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2086649966")
    @Export("getSize")
    public int getSize() {
        return this.size;
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1457033736")
    @Export("isFull")
    public boolean isFull() {
        return this.capacity == this.size;
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(descriptor = "(Lpb;I)Z", garbageValue = "-1935298620")
    @Export("contains")
    public boolean contains(Username var1) {
        if (!var1.hasCleanName()) {
            return false;
        } else {
            return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
        }
    }

    @ObfuscatedName("ac")
    @ObfuscatedSignature(descriptor = "(Lpb;B)Lmy;", garbageValue = "125")
    @Export("getByUsername")
    public User getByUsername(Username var1) {
        User var2 = this.getByCurrentUsername(var1);
        return var2 != null ? var2 : this.getByPreviousUsername(var1);
    }

    @ObfuscatedName("ab")
    @ObfuscatedSignature(descriptor = "(Lpb;I)Lmy;", garbageValue = "-1311447368")
    @Export("getByCurrentUsername")
    User getByCurrentUsername(Username var1) {
        return !var1.hasCleanName() ? null : ((User) (this.usernamesMap.get(var1)));
    }

    @ObfuscatedName("as")
    @ObfuscatedSignature(descriptor = "(Lpb;I)Lmy;", garbageValue = "-690730641")
    @Export("getByPreviousUsername")
    User getByPreviousUsername(Username var1) {
        return !var1.hasCleanName() ? null : ((User) (this.previousUsernamesMap.get(var1)));
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(descriptor = "(Lpb;I)Z", garbageValue = "854760448")
    @Export("removeByUsername")
    public final boolean removeByUsername(Username var1) {
        User var2 = this.getByCurrentUsername(var1);
        if (var2 == null) {
            return false;
        } else {
            this.remove(var2);
            return true;
        }
    }

    @ObfuscatedName("az")
    @ObfuscatedSignature(descriptor = "(Lmy;B)V", garbageValue = "13")
    @Export("remove")
    final void remove(User var1) {
        int var2 = this.indexOf(var1);
        if (var2 != (-1)) {
            this.arrayRemove(var2);
            this.mapRemove(var1);
        }
    }

    @ObfuscatedName("ad")
    @ObfuscatedSignature(descriptor = "(Lpb;I)Lmy;", garbageValue = "663320918")
    @Export("addLastNoPreviousUsername")
    User addLastNoPreviousUsername(Username var1) {
        return this.addLast(var1, ((Username) (null)));
    }

    @ObfuscatedName("au")
    @ObfuscatedSignature(descriptor = "(Lpb;Lpb;B)Lmy;", garbageValue = "109")
    @Export("addLast")
    User addLast(Username var1, Username var2) {
        if (this.getByCurrentUsername(var1) != null) {
            throw new IllegalStateException();
        } else {
            User var3 = this.newInstance();
            var3.set(var1, var2);
            this.arrayAddLast(var3);
            this.mapPut(var3);
            return var3;
        }
    }

    @ObfuscatedName("at")
    @ObfuscatedSignature(descriptor = "(II)Lmy;", garbageValue = "-233529081")
    @Export("get")
    public final User get(int var1) {
        if ((var1 >= 0) && (var1 < this.size)) {
            return this.array[var1];
        } else {
            throw new ArrayIndexOutOfBoundsException(var1);
        }
    }

    @ObfuscatedName("ae")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "16777216")
    @Export("sort")
    public final void sort() {
        if (this.comparator == null) {
            Arrays.sort(this.array, 0, this.size);
        } else {
            Arrays.sort(this.array, 0, this.size, this.comparator);
        }
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(descriptor = "(Lmy;Lpb;Lpb;I)V", garbageValue = "-65407818")
    @Export("changeName")
    final void changeName(User var1, Username var2, Username var3) {
        this.mapRemove(var1);
        var1.set(var2, var3);
        this.mapPut(var1);
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(descriptor = "(Lmy;I)I", garbageValue = "-520407892")
    @Export("indexOf")
    final int indexOf(User var1) {
        for (int var2 = 0; var2 < this.size; ++var2) {
            if (this.array[var2] == var1) {
                return var2;
            }
        }
        return -1;
    }

    @ObfuscatedName("aj")
    @ObfuscatedSignature(descriptor = "(Lmy;I)V", garbageValue = "-978617431")
    @Export("mapRemove")
    final void mapRemove(User var1) {
        if (var1.previousUsername != null) {
            this.previousUsernamesMap.remove(var1.previousUsername);
        }
    }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(descriptor = "(Lmy;B)V", garbageValue = "15")
    @Export("arrayAddLast")
    final void arrayAddLast(User var1) {
        this.array[(++this.size) - 1] = var1;
    }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(descriptor = "(Lmy;I)V", garbageValue = "141432444")
    @Export("mapPut")
    final void mapPut(User var1) {
        this.usernamesMap.put(var1.username, var1);
        if (var1.previousUsername != null) {
            User var2 = ((User) (this.previousUsernamesMap.put(var1.previousUsername, var1)));
            if ((var2 != null) && (var2 != var1)) {
                var2.previousUsername = null;
            }
        }
    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-10")
    @Export("arrayRemove")
    final void arrayRemove(int var1) {
        --this.size;
        if (var1 < this.size) {
            System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
        }
    }

    @ObfuscatedName("am")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "5")
    @Export("removeComparator")
    public final void removeComparator() {
        this.comparator = null;
    }

    @ObfuscatedName("bt")
    @ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;I)V", garbageValue = "-1644735272")
    @Export("addComparator")
    public final void addComparator(Comparator var1) {
        if (this.comparator == null) {
            this.comparator = var1;
        } else if (this.comparator instanceof AbstractUserComparator) {
            ((AbstractUserComparator) (this.comparator)).addComparator(var1);
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;IIS)[Lpt;", garbageValue = "-16546")
    public static SpritePixels[] method6415(AbstractArchive var0, int var1, int var2) {
        return !class125.method2744(var0, var1, var2) ? null : class10.method104();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Lfq;", garbageValue = "-2147182011")
    @Export("getEnum")
    public static EnumComposition getEnum(int var0) {
        EnumComposition var1 = ((EnumComposition) (EnumComposition.EnumDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
            var1 = new EnumComposition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            EnumComposition.EnumDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }

    @ObfuscatedName("kl")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-605118733")
    @Export("clanKickUser")
    static final void clanKickUser(String var0) {
        if (class67.friendsChat != null) {
            PacketBufferNode var1 = class135.getPacketBufferNode(ClientPacket.field2878, Client.packetWriter.isaacCipher);
            var1.packetBuffer.writeByte(GrandExchangeEvents.stringCp1252NullTerminatedByteSize(var0));
            var1.packetBuffer.writeStringCp1252NullTerminated(var0);
            Client.packetWriter.addNode(var1);
        }
    }
}