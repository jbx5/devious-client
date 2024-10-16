import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1439838631
	)
	int field830;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	FriendSystem(LoginType var1) {
		this.field830 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-394772392"
	)
	boolean method2004() {
		return this.field830 == 2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-959783569"
	)
	final void method2005() {
		this.field830 = 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "-824509786"
	)
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field830 = 2;
		class92.method2582();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "1536"
	)
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.last(); var1 != null; var1 = (FriendLoginUpdate)this.friendsList.friendLoginUpdates.previous()) {
			if ((long)var1.field5000 < class77.method2338() / 1000L - 5L) {
				if (var1.world > 0) {
					class430.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					class430.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1459371402"
	)
	@Export("clear")
	final void clear() {
		this.field830 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lwx;ZI)Z",
		garbageValue = "-267762668"
	)
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(SpriteMask.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)Z",
		garbageValue = "1788332060"
	)
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-825818667"
	)
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					Decimator.method1167();
				} else if (SpriteMask.localPlayer.username.equals(var2)) {
					Object var10000 = null;
					String var3 = "You can't add yourself to your own friend list";
					class430.addGameMessage(30, "", var3);
				} else if (this.isFriended(var2, false)) {
					Messages.method3171(var1);
				} else if (this.isIgnored(var2)) {
					Tile.method4793(var1);
				} else {
					Canvas.method327(var1);
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "9"
	)
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field630 != 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1074477015"
	)
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					SceneTilePaint.method5490();
				} else if (SpriteMask.localPlayer.username.equals(var2)) {
					HealthBarUpdate.method2777();
				} else if (this.isIgnored(var2)) {
					StringBuilder var10000 = (new StringBuilder()).append(var1);
					Object var10001 = null;
					String var4 = var10000.append(" is already on your ignore list").toString();
					class430.addGameMessage(30, "", var4);
				} else if (this.isFriended(var2, false)) {
					class384.method7545(var1);
				} else {
					PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.field3349, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "115"
	)
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field630 != 1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1939512759"
	)
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field586 = Client.cycleCntr;
					PacketBufferNode var3 = class113.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				class92.method2582();
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "-46"
	)
	@Export("removeIgnore")
	public final void removeIgnore(String var1, boolean var2) {
		if (var1 != null) {
			Username var3 = new Username(var1, this.loginType);
			if (var3.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var3)) {
					class151.method3583();
					if (var2) {
						PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
						var4.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var1));
						var4.packetBuffer.writeStringCp1252NullTerminated(var1);
						Client.packetWriter.addNode(var4);
					}
				}

				class369.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lwx;I)Z",
		garbageValue = "245279052"
	)
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = (Friend)this.friendsList.getByUsername(var1);
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-62"
	)
	static boolean method2013() {
		Date var0;
		try {
			var0 = WorldMapSection1.method6333();
		} catch (ParseException var7) {
			class6.method43(7);
			class132.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
			return false;
		}

		if (var0 == null) {
			return false;
		} else {
			boolean var5 = class215.method4423(var0);
			java.util.Calendar var4 = java.util.Calendar.getInstance();
			var4.set(2, 0);
			var4.set(5, 1);
			var4.set(1, 1900);
			Date var3 = var4.getTime();
			boolean var2 = var0.after(var3);
			if (!var2) {
				class6.method43(7);
				class132.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
				return false;
			} else {
				if (!var5) {
					class197.field2064 = 8388607;
				} else {
					class197.field2064 = (int)(var0.getTime() / 86400000L - 11745L);
				}

				return true;
			}
		}
	}

	@ObfuscatedName("nt")
	static final void method2071(double var0) {
		Rasterizer3D.buildPalette(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (LoginState.worldMap != null) {
			LoginState.worldMap.method9711();
		}

		class204.method4135();
		TaskHandler.clientPreferences.updateBrightness(var0);
	}
}
