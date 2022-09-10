import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("n")
	@Export("name")
	public String name;
	@ObfuscatedName("k")
	@Export("owner")
	public String owner;
	@ObfuscatedName("w")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1428903561
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1564077435
	)
	int field4331;

	@ObfuscatedSignature(
		descriptor = "(Lpn;Lnp;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4331 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lnc;",
		garbageValue = "-25"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate(); // L: 26
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lnc;",
		garbageValue = "0"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1]; // L: 31
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1384357634"
	)
	final void method6803(String var1) {
		String var3 = class241.base37DecodeLong(class241.method5128(var1)); // L: 37
		if (var3 == null) {
			var3 = ""; // L: 38
		}

		this.name = var3; // L: 41
	} // L: 42

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	final void method6826(String var1) {
		String var3 = class241.base37DecodeLong(class241.method5128(var1)); // L: 47
		if (var3 == null) { // L: 48
			var3 = "";
		}

		this.owner = var3; // L: 51
	} // L: 52

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-232368300"
	)
	public final void method6823(Buffer var1, int var2) {
		this.method6826(var1.readStringCp1252NullTerminated()); // L: 55
		long var3 = var1.readLong(); // L: 56
		long var6 = var3; // L: 58
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) { // L: 60
			if (var3 % 37L == 0L) { // L: 64
				var5 = null; // L: 65
			} else {
				var8 = 0; // L: 68

				for (long var9 = var3; var9 != 0L; var9 /= 37L) { // L: 69 70 72
					++var8; // L: 71
				}

				StringBuilder var11 = new StringBuilder(var8); // L: 74

				while (var6 != 0L) { // L: 75
					long var12 = var6; // L: 76
					var6 /= 37L; // L: 77
					var11.append(class346.base37Table[(int)(var12 - 37L * var6)]); // L: 78
				}

				var5 = var11.reverse().toString(); // L: 80
			}
		} else {
			var5 = null; // L: 61
		}

		this.method6803(var5); // L: 82
		this.minKick = var1.readByte(); // L: 83
		short var14;
		if (var2 == 1) { // L: 86
			var8 = var1.readUnsignedByte(); // L: 87
			var14 = 255; // L: 88
		} else {
			if (var2 != 2) { // L: 90
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 95
			}

			var8 = var1.readShortSmartSub(); // L: 91
			var14 = -1; // L: 92
		}

		if (var14 != var8) { // L: 97
			int var10 = var8; // L: 100
			this.clear(); // L: 101

			for (int var15 = 0; var15 < var10; ++var15) { // L: 102
				ClanMate var16 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 103
				int var13 = var1.readUnsignedShort(); // L: 104
				var16.set(var13, ++this.field4331 - 1); // L: 105
				var16.rank = var1.readByte(); // L: 106
				var1.readStringCp1252NullTerminated(); // L: 107
				this.isLocalPlayer(var16); // L: 108
			}

		}
	} // L: 98 110

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-2147044263"
	)
	public final void method6806(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 113
		int var3 = var1.readUnsignedShort(); // L: 114
		byte var4 = var1.readByte(); // L: 115
		boolean var5 = false; // L: 116
		if (var4 == -128) { // L: 117
			var5 = true;
		}

		ClanMate var6;
		if (var5) { // L: 118
			if (this.getSize() == 0) { // L: 119
				return;
			}

			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 120
			if (var6 != null && var6.getWorld() == var3) { // L: 121
				this.remove(var6); // L: 122
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 126
			var6 = (ClanMate)this.getByCurrentUsername(var2); // L: 127
			if (var6 == null) { // L: 128
				if (this.getSize() > super.capacity) { // L: 129
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2); // L: 130
			}

			var6.set(var3, ++this.field4331 - 1); // L: 132
			var6.rank = var4; // L: 133
			this.isLocalPlayer(var6); // L: 134
		}

	} // L: 136

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1607775912"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 139
			((ClanMate)this.get(var1)).clearIsFriend(); // L: 140
		}

	} // L: 142

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1859270101"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 145
			((ClanMate)this.get(var1)).clearIsIgnored(); // L: 146
		}

	} // L: 148

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnh;I)V",
		garbageValue = "1061559077"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 151
			this.rank = var1.rank;
		}

	} // L: 152
}
