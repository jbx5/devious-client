import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rx")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltr;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lrd;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("at")
	@Export("name")
	public String name;
	@ObfuscatedName("an")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ao")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 326395263
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -450657103
	)
	int field4781;

	@ObfuscatedSignature(
		descriptor = "(Ltr;Lrd;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4781 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lrr;",
		garbageValue = "958125629"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lrr;",
		garbageValue = "8"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1466026233"
	)
	final void method8061(String var1) {
		String var3 = ModelData0.base37DecodeLong(HttpMethod.method83(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	final void method8062(String var1) {
		String var3 = ModelData0.base37DecodeLong(HttpMethod.method83(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-582457281"
	)
	public final void method8063(Buffer var1, int var2) {
		this.method8062(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		this.method8061(class204.method3849(var3));
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
				ClanMate var9 = (ClanMate)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType));
				int var10 = var1.readUnsignedShort();
				var9.set(var10, ++this.field4781 - 1);
				var9.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var9);
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lur;S)V",
		garbageValue = "-27733"
	)
	public final void method8064(Buffer var1) {
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

			var6.set(var3, ++this.field4781 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-23993344"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1982522955"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lry;I)V",
		garbageValue = "-244184152"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "659347855"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
