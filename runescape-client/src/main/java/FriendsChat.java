import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ro")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lrn;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("az")
	@Export("name")
	public String name;
	@ObfuscatedName("af")
	@Export("owner")
	public String owner;
	@ObfuscatedName("aa")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1584426961
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1512347247
	)
	int field4910;

	@ObfuscatedSignature(
		descriptor = "(Lux;Lrn;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4910 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Lsg;",
		garbageValue = "-3"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[Lsg;",
		garbageValue = "1162605348"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-110839802"
	)
	final void method8544(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (0L == var5 % 37L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = class165.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.name = var10;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-16303"
	)
	final void method8545(String var1) {
		long var5 = 0L;
		int var7 = var1.length();

		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += (long)(var9 + 1 - 65);
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += (long)(var9 + 1 - 97);
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += (long)(var9 + 27 - 48);
			}

			if (var5 >= 177917621779460413L) {
				break;
			}
		}

		while (var5 % 37L == 0L && 0L != var5) {
			var5 /= 37L;
		}

		String var10 = class165.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}

		this.owner = var10;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "755505003"
	)
	public final void method8546(Buffer var1, int var2) {
		this.method8545(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		long var6 = var3;
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) {
			if (var3 % 37L == 0L) {
				var5 = null;
			} else {
				var8 = 0;

				for (long var9 = var3; 0L != var9; var9 /= 37L) {
					++var8;
				}

				StringBuilder var11 = new StringBuilder(var8);

				while (0L != var6) {
					long var12 = var6;
					var6 /= 37L;
					var11.append(class416.base37Table[(int)(var12 - 37L * var6)]);
				}

				var5 = var11.reverse().toString();
			}
		} else {
			var5 = null;
		}

		this.method8544(var5);
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
				var16.set(var13, ++this.field4910 - 1);
				var16.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var16);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "2099050592"
	)
	public final void method8547(Buffer var1) {
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

			var6.set(var3, ++this.field4910 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1832084609"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lsn;B)V",
		garbageValue = "-127"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-789628247"
	)
	static void method8575(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}
}
