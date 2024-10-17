import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsj;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("aj")
	@Export("name")
	public String name;
	@ObfuscatedName("ai")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ay")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1948475207
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1168678619
	)
	int field4996;

	@ObfuscatedSignature(
		descriptor = "(Lur;Lsj;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4996 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lse;",
		garbageValue = "-807171089"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)[Lse;",
		garbageValue = "1608525822"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "12"
	)
	final void method8962(String var1) {
		String var3 = Script.base37DecodeLong(WorldMapData_1.method6172(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "7"
	)
	final void method8957(String var1) {
		String var3 = Script.base37DecodeLong(WorldMapData_1.method6172(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "-1689308347"
	)
	public final void method8960(Buffer var1, int var2) {
		this.method8957(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		this.method8962(class190.method3979(var3));
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

		if (var5 != var6) {
			int var7 = var5;
			this.clear();

			for (int var8 = 0; var8 < var7; ++var8) {
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var10 = var1.readUnsignedShort();
				var9.set(var10, ++this.field4996 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "153807419"
	)
	public final void method8961(Buffer var1) {
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

			var6.set(var3, ++this.field4996 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "14"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2098001327"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsp;I)V",
		garbageValue = "333871552"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}
