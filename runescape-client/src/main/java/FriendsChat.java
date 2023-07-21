import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qk")
@Implements("FriendsChat")
public class FriendsChat extends UserList {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("am")
	@Export("name")
	public String name;
	@ObfuscatedName("as")
	@Export("owner")
	public String owner;
	@ObfuscatedName("aj")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1945538007
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1246827895
	)
	int field4639;

	@ObfuscatedSignature(
		descriptor = "(Lsi;Lqv;)V"
	)
	public FriendsChat(LoginType var1, Usernamed var2) {
		super(500);
		this.name = null;
		this.owner = null;
		this.field4639 = 1;
		this.loginType = var1;
		this.localUser = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Lqe;",
		garbageValue = "3401"
	)
	@Export("newInstance")
	User newInstance() {
		return new ClanMate();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqe;",
		garbageValue = "7"
	)
	@Export("newTypedArray")
	User[] newTypedArray(int var1) {
		return new ClanMate[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1311029407"
	)
	final void method7891(String var1) {
		this.name = MusicPatchPcmStream.method6034(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-429338938"
	)
	final void method7892(String var1) {
		this.owner = MusicPatchPcmStream.method6034(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lty;II)V",
		garbageValue = "-1516158083"
	)
	public final void method7893(Buffer var1, int var2) {
		this.method7892(var1.readStringCp1252NullTerminated());
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

				while (var6 != 0L) {
					long var12 = var6;
					var6 /= 37L;
					var11.append(class389.base37Table[(int)(var12 - 37L * var6)]);
				}

				var5 = var11.reverse().toString();
			}
		} else {
			var5 = null;
		}

		this.method7891(var5);
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
				var16.set(var13, ++this.field4639 - 1);
				var16.rank = var1.readByte();
				var1.readStringCp1252NullTerminated();
				this.isLocalPlayer(var16);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "808649523"
	)
	public final void method7903(Buffer var1) {
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

			var6.set(var3, ++this.field4639 - 1);
			var6.rank = var4;
			this.isLocalPlayer(var6);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-157826721"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsFriend();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) {
			((ClanMate)this.get(var1)).clearIsIgnored();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqg;B)V",
		garbageValue = "115"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(ClanMate var1) {
		if (var1.getUsername().equals(this.localUser.username())) {
			this.rank = var1.rank;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lsi;I)Ljava/lang/String;",
		garbageValue = "-1798627336"
	)
	public static String method7912(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && WorldMapArea.method5212(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && WorldMapArea.method5212(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1 && var4 <= DelayFadeTask.method7631(var1)) {
				StringBuilder var5 = new StringBuilder(var4);

				for (int var6 = var2; var6 < var3; ++var6) {
					char var7 = var0.charAt(var6);
					boolean var8;
					if (Character.isISOControl(var7)) {
						var8 = false;
					} else if (class126.isAlphaNumeric(var7)) {
						var8 = true;
					} else {
						char[] var9 = class494.field4999;
						int var10 = 0;

						label77:
						while (true) {
							char var11;
							if (var10 >= var9.length) {
								var9 = class494.field4998;

								for (var10 = 0; var10 < var9.length; ++var10) {
									var11 = var9[var10];
									if (var11 == var7) {
										var8 = true;
										break label77;
									}
								}

								var8 = false;
								break;
							}

							var11 = var9[var10];
							if (var7 == var11) {
								var8 = true;
								break;
							}

							++var10;
						}
					}

					if (var8) {
						char var12 = class20.method296(var7);
						if (var12 != 0) {
							var5.append(var12);
						}
					}
				}

				if (var5.length() == 0) {
					return null;
				} else {
					return var5.toString();
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "256"
	)
	static void method7908(int var0) {
		Client.oculusOrbState = var0;
	}
}
