import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("no")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lpe;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lnv;")
	@Export("localUser")
	final Usernamed localUser;

	@ObfuscatedName("f")
	@Export("name")
	public String name;

	@ObfuscatedName("j")
	@Export("owner")
	public String owner;

	@ObfuscatedName("e")
	@Export("minKick")
	public byte minKick;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -1691262047)
	@Export("rank")
	public int rank;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 860712691)
	int field4297;

	@ObfuscatedSignature(descriptor = "(Lpe;Lnv;)V")
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4297 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(S)Lne;", garbageValue = "-7122")
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)[Lne;", garbageValue = "77510907")
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-82")
	final void method6590(String var1) {
		this.name = TaskHandler.method3240(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "1")
	final void method6591(String var1) {
		this.owner = TaskHandler.method3240(var1);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "-1186116576")
	public final void method6592(Buffer var1, int var2) {
		this.method6591(var1.readStringCp1252NullTerminated());
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
					var11.append(class344.base37Table[((int) (var12 - 37L * var6))]);
				} 
				var5 = var11.reverse().toString();
			}
		} else {
			var5 = null;
		}
		this.method6590(var5);
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
		if (var14 != var8) {
			int var10 = var8;
			this.clear();
			for (int var15 = 0; var15 < var10; ++var15) {
				ClanMate var16 = ((ClanMate) (this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType))));
				int var13 = var1.readUnsignedShort();
				var16.set(var13, ++this.field4297 - 1);
				var16.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var16);
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "123")
	public final void method6612(Buffer var1) {
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
			var6.set(var3, ++this.field4297 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "679696158")
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsFriend();
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1412688360")
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsIgnored();
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lnj;I)V", garbageValue = "2099019894")
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}
	}
}