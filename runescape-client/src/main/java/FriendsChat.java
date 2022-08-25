import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nn")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lpl;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lne;")
	@Export("localUser")
	final Usernamed localUser;

	@ObfuscatedName("v")
	@Export("name")
	public String name = null;

	@ObfuscatedName("c")
	@Export("owner")
	public String owner = null;

	@ObfuscatedName("q")
	@Export("minKick")
	public byte minKick;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -1509260973)
	@Export("rank")
	public int rank;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -986186667)
	int field4291 = 1;

	@ObfuscatedSignature(descriptor = "(Lpl;Lne;)V")
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)Lnb;", garbageValue = "1043377845")
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)[Lnb;", garbageValue = "46467081")
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-429965392")
	final void method6551(String var1) {
		long var5 = 0L;
		int var7 = var1.length();
		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += ((long) (var9 + 1 - 65));
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += ((long) (var9 + 1 - 97));
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += ((long) (var9 + 27 - 48));
			}
			if (var5 >= 177917621779460413L) {
				break;
			}
		}
		while (0L == var5 % 37L && var5 != 0L) {
			var5 /= 37L;
		} 
		String var10 = Huffman.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}
		this.name = var10;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "62")
	final void method6554(String var1) {
		long var5 = 0L;
		int var7 = var1.length();
		for (int var8 = 0; var8 < var7; ++var8) {
			var5 *= 37L;
			char var9 = var1.charAt(var8);
			if (var9 >= 'A' && var9 <= 'Z') {
				var5 += ((long) (var9 + 1 - 65));
			} else if (var9 >= 'a' && var9 <= 'z') {
				var5 += ((long) (var9 + 1 - 97));
			} else if (var9 >= '0' && var9 <= '9') {
				var5 += ((long) (var9 + 27 - 48));
			}
			if (var5 >= 177917621779460413L) {
				break;
			}
		}
		while (var5 % 37L == 0L && 0L != var5) {
			var5 /= 37L;
		} 
		String var10 = Huffman.base37DecodeLong(var5);
		if (var10 == null) {
			var10 = "";
		}
		this.owner = var10;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Lqr;II)V", garbageValue = "-1186412773")
	public final void method6553(Buffer var1, int var2) {
		this.method6554(var1.readStringCp1252NullTerminated());
		long var3 = var1.readLong();
		long var6 = var3;
		String var5;
		int var8;
		if (var3 > 0L && var3 < 6582952005840035281L) {
			if (0L == var3 % 37L) {
				var5 = null;
			} else {
				var8 = 0;
				for (long var9 = var3; var9 != 0L; var9 /= 37L) {
					++var8;
				}
				StringBuilder var11 = new StringBuilder(var8);
				while (var6 != 0L) {
					long var12 = var6;
					var6 /= 37L;
					var11.append(class345.base37Table[((int) (var12 - 37L * var6))]);
				} 
				var5 = var11.reverse().toString();
			}
		} else {
			var5 = null;
		}
		this.method6551(var5);
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
				var16.set(var13, ++this.field4291 - 1);
				var16.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var16);
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "750050170")
	public final void method6556(Buffer var1) {
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
			var6.set(var3, ++this.field4291 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1186289190")
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsFriend();
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1711305340")
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsIgnored();
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lnp;S)V", garbageValue = "1982")
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}
	}
}