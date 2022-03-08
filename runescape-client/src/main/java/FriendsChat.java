import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ma")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
    @ObfuscatedName("sg")
    @ObfuscatedGetter(intValue = 1974859207)
    static int field4141;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "Lok;")
    @Export("loginType")
    final LoginType loginType;

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "Lmb;")
    @Export("localUser")
    final Usernamed localUser;

    @ObfuscatedName("e")
    @Export("name")
    public String name;

    @ObfuscatedName("r")
    @Export("owner")
    public String owner;

    @ObfuscatedName("o")
    @Export("minKick")
    public byte minKick;

    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 149836569)
    @Export("rank")
    public int rank;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1071475131)
    int field4143;

    @ObfuscatedSignature(descriptor = "(Lok;Lmb;)V")
    public FriendsChat(LoginType var1, Usernamed var2) {
        super(100);
        this.name = null;
        this.owner = null;
        this.field4143 = 1;
        this.loginType = var1;
        this.localUser = var2;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(I)Lmy;", garbageValue = "2000225121")
    @Export("newInstance")
    User newInstance() {
        return new ClanMate();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)[Lmy;", garbageValue = "55")
    @Export("newTypedArray")
    User[] newTypedArray(int var1) {
        return new ClanMate[var1];
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;S)V", garbageValue = "-10629")
    @Export("readName")
    final void readName(String var1) {
        this.name = GrandExchangeOffer.method5751(var1);
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1770567295")
    @Export("setOwner")
    final void setOwner(String var1) {
        this.owner = GrandExchangeOffer.method5751(var1);
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-26")
    @Export("readUpdate")
    public final void readUpdate(Buffer var1) {
        this.setOwner(var1.readStringCp1252NullTerminated());
        long var2 = var1.readLong();
        this.readName(AbstractByteArrayCopier.method5309(var2));
        this.minKick = var1.readByte();
        int var4 = var1.readUnsignedByte();
        if (var4 != 255) {
            this.clear();
            for (int var5 = 0; var5 < var4; ++var5) {
                ClanMate var6 = ((ClanMate) (this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType))));
                int var7 = var1.readUnsignedShort();
                var6.set(var7, (++this.field4143) - 1);
                var6.rank = var1.readByte();
                var1.readStringCp1252NullTerminated();
                this.isLocalPlayer(var6);
            }
        }
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "496706080")
    public final void method6299(Buffer var1) {
        Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
        int var3 = var1.readUnsignedShort();
        byte var4 = var1.readByte();
        boolean var5 = false;
        if (var4 == (-128)) {
            var5 = true;
        }
        ClanMate var6;
        if (var5) {
            if (this.getSize() == 0) {
                return;
            }
            var6 = ((ClanMate) (this.getByCurrentUsername(var2)));
            if ((var6 != null) && (var6.getWorld() == var3)) {
                this.remove(var6);
            }
        } else {
            var1.readStringCp1252NullTerminated();
            var6 = ((ClanMate) (this.getByCurrentUsername(var2)));
            if (var6 == null) {
                if (this.getSize() > super.capacity) {
                    return;
                }
                var6 = ((ClanMate) (this.addLastNoPreviousUsername(var2)));
            }
            var6.set(var3, (++this.field4143) - 1);
            var6.rank = var4;
            this.isLocalPlayer(var6);
        }
    }

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "143838083")
    @Export("clearFriends")
    public final void clearFriends() {
        for (int var1 = 0; var1 < this.getSize(); ++var1) {
            ((ClanMate) (this.get(var1))).clearIsFriend();
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1946048984")
    @Export("invalidateIgnoreds")
    public final void invalidateIgnoreds() {
        for (int var1 = 0; var1 < this.getSize(); ++var1) {
            ((ClanMate) (this.get(var1))).clearIsIgnored();
        }
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(Lmm;I)V", garbageValue = "1351635925")
    @Export("isLocalPlayer")
    final void isLocalPlayer(ClanMate var1) {
        if (var1.getUsername().equals(this.localUser.username())) {
            this.rank = var1.rank;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lok;B)I", garbageValue = "1")
    public static final int method6330(LoginType var0) {
        if (var0 == null) {
            return 12;
        } else {
            switch (var0.field4456) {
                case 1 :
                    return 20;
                default :
                    return 12;
            }
        }
    }
}