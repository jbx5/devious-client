import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nw")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("cb")
	static boolean field4305;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lnc;")
	@Export("localUser")
	final Usernamed localUser;

	@ObfuscatedName("u")
	@Export("name")
	public String name = null;

	@ObfuscatedName("c")
	@Export("owner")
	public String owner = null;

	@ObfuscatedName("w")
	@Export("minKick")
	public byte minKick;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1510429921)
	@Export("rank")
	public int rank;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1038646649)
	int field4309 = 1;

	@ObfuscatedSignature(descriptor = "(Lpa;Lnc;)V")
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Lnd;", garbageValue = "12")
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)[Lnd;", garbageValue = "-1607059691")
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-5")
	final void method6653(String var1) {
		String var3 = Script.base37DecodeLong(GrandExchangeOfferAgeComparator.method6010(var1));
		if (var3 == null) {
			var3 = "";
		}
		this.name = var3;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-799881786")
	final void method6677(String var1) {
		String var3 = Script.base37DecodeLong(GrandExchangeOfferAgeComparator.method6010(var1));
		if (var3 == null) {
			var3 = "";
		}
		this.owner = var3;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lqw;IB)V", garbageValue = "-56")
	public final void method6655(Buffer var1, int var2) {
		this.method6677(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		this.method6653(GrandExchangeOfferOwnWorldComparator.method1107(var3));
		this.minKick = var1.readByte();
		int var5;
		short var6;
		if (var2 == 1) {
			var5 = var1.readUnsignedByte();
			var6 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}
			var5 = var1.readShortSmartSub();
			var6 = -1;
		}
		if (var6 != var5) {
			int var7 = var5;
			this.clear();
			for (int var8 = 0; var8 < var7; ++var8) {
				ClanMate var9 = ((ClanMate) (this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType))));
				int var10 = var1.readUnsignedShort();
				var9.set(var10, ++this.field4309 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lqw;S)V", garbageValue = "15740")
	public final void method6656(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType);
		int var3 = var1.readUnsignedShort();
		byte var4 = var1.readByte();
		boolean var5 = false;
		if (var4 == -128) {
			var5 = true;
		}
		ClanMate var6;
		if (var5) {
			if (this.getSize() == 0) {
				return;
			}
			var6 = ((ClanMate) (this.getByCurrentUsername(var2)));
			if (var6 != null && var6.getWorld() == var3) {
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
			var6.set(var3, ++this.field4309 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2068405661")
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsFriend();
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-61")
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsIgnored();
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lnt;B)V", garbageValue = "-123")
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Llc;IIIZB)V", garbageValue = "1")
	public static void method6678(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class273.musicPlayerStatus = 1;
		class149.musicTrackArchive = var0;
		class273.musicTrackGroupId = var1;
		UserComparator6.musicTrackFileId = var2;
		class273.musicTrackVolume = var3;
		class347.musicTrackBoolean = var4;
		FaceNormal.pcmSampleLength = 10000;
	}
}