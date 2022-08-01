import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.net.URL;
import java.util.LinkedHashMap;
@ObfuscatedName("bq")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 3633049326970285473L)
	static long field797;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -683802885)
	static int field807;

	@ObfuscatedName("lr")
	@ObfuscatedGetter(intValue = -1303524487)
	@Export("Client_plane")
	static int Client_plane;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("loginType")
	final LoginType loginType;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lna;")
	@Export("friendsList")
	public final FriendsList friendsList;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lnv;")
	@Export("ignoreList")
	public final IgnoreList ignoreList;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -8431215)
	int field801 = 0;

	@ObfuscatedSignature(descriptor = "(Lpa;)V")
	FriendSystem(LoginType var1) {
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "51")
	boolean method1694() {
		return this.field801 == 2;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1539788133")
	final void method1733() {
		this.field801 = 1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-850235504")
	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field801 = 2;
		ObjectComposition.method3698();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-927072501")
	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.last())); var1 != null; var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.previous()))) {
			if (((long) (var1.field4316)) < class131.method2916() / 1000L - 5L) {
				if (var1.world > 0) {
					FileSystem.addGameMessage(5, "", var1.username + " has logged in.");
				}
				if (var1.world == 0) {
					FileSystem.addGameMessage(5, "", var1.username + " has logged out.");
				}
				var1.remove();
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "492776381")
	@Export("clear")
	final void clear() {
		this.field801 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqi;ZI)Z", garbageValue = "-403272270")
	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class28.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lqi;B)Z", garbageValue = "0")
	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1969765153")
	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsListIsFull()) {
					LoginScreenAnimation.method2279("Your friend list is full. Max of 200 for free users, and 400 for members");
				} else if (class28.localPlayer.username.equals(var2)) {
					ScriptFrame.method1057();
				} else if (this.isFriended(var2, false)) {
					LoginScreenAnimation.method2279(var1 + " is already on your friend list");
				} else if (this.isIgnored(var2)) {
					LoginScreenAnimation.method2279("Please remove " + var1 + " from your ignore list first");
				} else {
					ApproximateRouteStrategy.method1088(var1);
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(S)Z", garbageValue = "1689")
	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || this.friendsList.getSize() >= 200 && Client.field770 != 1;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "188006359")
	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.canAddIgnore()) {
					LoginScreenAnimation.method2279("Your ignore list is full. Max of 100 for free users, and 400 for members");
				} else if (class28.localPlayer.username.equals(var2)) {
					class6.method34();
				} else if (this.isIgnored(var2)) {
					LoginScreenAnimation.method2279(var1 + " is already on your ignore list");
				} else if (this.isFriended(var2, false)) {
					LoginScreenAnimation.method2279("Please remove " + var1 + " from your friend list first");
				} else {
					PacketBufferNode var3 = class433.getPacketBufferNode(ClientPacket.field2940, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-72")
	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || this.ignoreList.getSize() >= 100 && Client.field770 != 1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "735155702")
	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field750 = Client.cycleCntr;
					PacketBufferNode var3 = class433.getPacketBufferNode(ClientPacket.FRIEND_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
				ObjectComposition.method3698();
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;B)V", garbageValue = "-14")
	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field750 = Client.cycleCntr;
					PacketBufferNode var3 = class433.getPacketBufferNode(ClientPacket.IGNORE_DELUSER, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
				class16.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lqi;I)Z", garbageValue = "2021397835")
	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = ((Friend) (this.friendsList.getByUsername(var1)));
		return var2 != null && var2.hasWorld();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-2081672931")
	public static void method1766(int var0, int var1) {
		VarbitComposition var3 = ((VarbitComposition) (VarbitComposition.VarbitDefinition_cached.get(((long) (var0)))));
		VarbitComposition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var3 = new VarbitComposition();
			if (var4 != null) {
				var3.decode(new Buffer(var4));
			}
			VarbitComposition.VarbitDefinition_cached.put(var3, ((long) (var0)));
			var2 = var3;
		}
		int var8 = var2.baseVar;
		int var5 = var2.startBit;
		int var6 = var2.endBit;
		int var7 = Varps.Varps_masks[var6 - var5];
		if (var1 < 0 || var1 > var7) {
			var1 = 0;
		}
		var7 <<= var5;
		Varps.Varps_main[var8] = Varps.Varps_main[var8] & ~var7 | var1 << var5 & var7;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z", garbageValue = "-1156454610")
	static boolean method1696(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field182.startsWith("win")) {
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var10.indexOf(var0.charAt(var4)) == -1) {
							throw new Exception();
						}
					}
					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var3 = class27.method379(class29.field184, var2, new Object[]{ new URL(class29.field184.getCodeBase(), var0).toString() });
				return var3 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.field184.getAppletContext().showDocument(new URL(class29.field184.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				class27.method378(class29.field184, "loggedout");
			} catch (Throwable var9) {
			}
			try {
				class29.field184.getAppletContext().showDocument(new URL(class29.field184.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;IS)V", garbageValue = "12148")
	static final void method1748(String var0, int var1) {
		PacketBufferNode var2 = class433.getPacketBufferNode(ClientPacket.field2977, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeByteAdd(var1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lbk;I)V", garbageValue = "1782863326")
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != ItemComposition.ItemDefinition_inMembersWorld) {
				ItemComposition.ItemDefinition_cached.clear();
				ItemComposition.ItemDefinition_cachedModels.clear();
				ItemComposition.ItemDefinition_cachedSprites.clear();
				ItemComposition.ItemDefinition_inMembersWorld = var1;
			}
		}
		if (var0.properties != Client.worldProperties) {
			MilliClock.method3293(AbstractWorldMapData.archive8, var0.properties);
		}
		WorldMapSectionType.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class18.worldPort = (Client.gameBuild == 0) ? 'ꩊ' : var0.id + '鱀';
		DbRowType.js5Port = (Client.gameBuild == 0) ? 443 : var0.id + '썐';
		class117.currentPort = class18.worldPort;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "16")
	protected static final void method1769() {
		class238.clock.mark();
		int var0;
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.graphicsTickTimes[var0] = 0L;
		}
		for (var0 = 0; var0 < 32; ++var0) {
			GameEngine.clientTickTimes[var0] = 0L;
		}
		class142.gameCyclesToDo = 0;
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "6461500")
	static final void method1762(boolean var0) {
		if (var0) {
			Client.field645 = (Login.field893) ? class124.field1515 : class124.field1518;
		} else {
			LinkedHashMap var1 = class260.clientPreferences.parameters;
			String var3 = Login.Login_username;
			int var4 = var3.length();
			int var5 = 0;
			for (int var6 = 0; var6 < var4; ++var6) {
				var5 = (var5 << 5) - var5 + var3.charAt(var6);
			}
			Client.field645 = (var1.containsKey(var5)) ? class124.field1517 : class124.field1516;
		}
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "32")
	static final void method1764(int var0, int var1, int var2) {
		if (WorldMapLabelSize.cameraX < var0) {
			WorldMapLabelSize.cameraX = (var0 - WorldMapLabelSize.cameraX) * SoundCache.field325 / 1000 + WorldMapLabelSize.cameraX + class115.field1419;
			if (WorldMapLabelSize.cameraX > var0) {
				WorldMapLabelSize.cameraX = var0;
			}
		}
		if (WorldMapLabelSize.cameraX > var0) {
			WorldMapLabelSize.cameraX -= (WorldMapLabelSize.cameraX - var0) * SoundCache.field325 / 1000 + class115.field1419;
			if (WorldMapLabelSize.cameraX < var0) {
				WorldMapLabelSize.cameraX = var0;
			}
		}
		if (class123.cameraY < var1) {
			class123.cameraY = (var1 - class123.cameraY) * SoundCache.field325 / 1000 + class123.cameraY + class115.field1419;
			if (class123.cameraY > var1) {
				class123.cameraY = var1;
			}
		}
		if (class123.cameraY > var1) {
			class123.cameraY -= (class123.cameraY - var1) * SoundCache.field325 / 1000 + class115.field1419;
			if (class123.cameraY < var1) {
				class123.cameraY = var1;
			}
		}
		if (Widget.cameraZ < var2) {
			Widget.cameraZ = (var2 - Widget.cameraZ) * SoundCache.field325 / 1000 + Widget.cameraZ + class115.field1419;
			if (Widget.cameraZ > var2) {
				Widget.cameraZ = var2;
			}
		}
		if (Widget.cameraZ > var2) {
			Widget.cameraZ -= (Widget.cameraZ - var2) * SoundCache.field325 / 1000 + class115.field1419;
			if (Widget.cameraZ < var2) {
				Widget.cameraZ = var2;
			}
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(descriptor = "(Lku;I)Z", garbageValue = "1778050602")
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = class343.method6335(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}
			return true;
		}
	}
}