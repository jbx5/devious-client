import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nw")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lpa;")

	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lnv;")

	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("g")
	@Export("name")
	public String name;
	@ObfuscatedName("l")
	@Export("owner")
	public String owner;
	@ObfuscatedName("n")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	1904728549)

	@Export("rank")
	public int rank;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-1723570979)

	int field4252;

	@ObfuscatedSignature(descriptor = 
	"(Lpa;Lnv;)V")

	public FriendsChat(LoginType var1, Usernamed var2) {
		super(100);
		this.name = null;
		this.owner = null;
		this.field4252 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Lnc;", garbageValue = 
	"-1289438305")

	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)[Lnc;", garbageValue = 
	"-1075861644")

	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;S)V", garbageValue = 
	"256")

	@Export("readName")
	final void readName(String var1) {
		String var3 = UserComparator7.base37DecodeLong(class306.method5788(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.name = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"1041352742")

	@Export("setOwner")
	final void setOwner(String var1) {
		String var3 = UserComparator7.base37DecodeLong(class306.method5788(var1));
		if (var3 == null) {
			var3 = "";
		}

		this.owner = var3;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"-1861333718")

	@Export("readUpdate")
	public final void readUpdate(Buffer var1) {
		this.setOwner(var1.readStringCp1252NullTerminated());
		long var2 = var1.readLong();
		this.readName(WorldMapArea.method4648(var2));
		this.minKick = var1.readByte();
		int var4 = var1.readUnsignedByte();
		if (var4 != 255) {
			this.clear();

			for (int var5 = 0; var5 < var4; ++var5) {
				ClanMate var6 = ((ClanMate) (this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType))));
				int var7 = var1.readUnsignedShort();
				var6.set(var7, (++this.field4252) - 1);
				var6.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var6);
			}

		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;S)V", garbageValue = 
	"24300")

	public final void method6718(Buffer var1) {
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

			var6.set(var3, (++this.field4252) - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"5720718")

	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsFriend();
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"6")

	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate) (this.get(var1))).clearIsIgnored();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lnp;B)V", garbageValue = 
	"-104")

	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}
}