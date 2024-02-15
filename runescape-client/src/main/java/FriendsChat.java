import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rt")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("uq")
	@ObfuscatedGetter(
		intValue = -1532293877
	)
	static int field4736;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lru;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ai")
	@Export("name")
	public String name;
	@ObfuscatedName("ar")
	@Export("owner")
	public String owner;
	@ObfuscatedName("as")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1728806629
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -625990309
	)
	int field4743;

	@ObfuscatedSignature(
		descriptor = "(Lte;Lru;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4743 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lra;",
		garbageValue = "4"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IS)[Lra;",
		garbageValue = "19510"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1677257374"
	)
	final void method8265(String var1) {
		String var3 = class224.base37DecodeLong(class135.method3138(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "68"
	)
	final void method8266(String var1) {
		String var3 = class224.base37DecodeLong(class135.method3138(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-1885490435"
	)
	public final void method8277(Buffer var1, int var2) {
		this.method8266(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		long var6 = var3;
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) {
			if (var3 % 37L == 0L) {
				var5 = null;
			} else {
				var8 = 0;

				for (long var9 = var3; var9 != 0L; var9 /= 37L) {
					++var8;
				}

				StringBuilder var11 = new StringBuilder(var8);

				while (0L != var6) {
					long var12 = var6;
					var6 /= 37L;
					var11.append(class407.base37Table[(int)(var12 - 37L * var6)]);
				}

				var5 = var11.reverse().toString();
			}
		} else {
			var5 = null;
		}

		this.method8265(var5);
		this.minKick = var1.readByte();
		short var14;
		if (var2 == 1) {
			var8 = var1.readUnsignedByte();
			var14 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var8 = var1.readShortSmartSub();
			var14 = -1;
		}

		if (var8 != var14) {
			int var10 = var8;
			this.clear();

			for (int var15 = 0; var15 < var10; ++var15) {
				ClanMate var16 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var13 = var1.readUnsignedShort();
				var16.set(var13, ++this.field4743 - 1);
				var16.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var16);
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Luq;B)V",
		garbageValue = "11"
	)
	public final void method8268(Buffer var1) {
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

			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 != null && var6.getWorld() == var3) {
				this.remove(var6);
			}
		} else {
			var1.readStringCp1252NullTerminated();
			var6 = (ClanMate)this.getByCurrentUsername(var2);
			if (var6 == null) {
				if (this.getSize() > super.capacity) {
					return;
				}

				var6 = (ClanMate)this.addLastNoPreviousUsername(var2);
			}

			var6.set(var3, ++this.field4743 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-260912037"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-19"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lrj;B)V",
		garbageValue = "-35"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
