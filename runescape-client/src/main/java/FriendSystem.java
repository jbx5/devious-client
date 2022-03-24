import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("FriendSystem")
public class FriendSystem {
	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = 
	"Llp;")

	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("hv")
	@ObfuscatedSignature(descriptor = 
	"Lgs;")

	@Export("scene")
	static Scene scene;
	@ObfuscatedName("he")
	@ObfuscatedGetter(intValue = 
	505945319)

	static int field803;
	@ObfuscatedName("ig")
	@ObfuscatedGetter(intValue = 
	-134669163)

	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lpa;")

	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lnt;")

	@Export("friendsList")
	public final FriendsList friendsList;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lmm;")

	@Export("ignoreList")
	public final IgnoreList ignoreList;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-244669207)

	int field801;

	@ObfuscatedSignature(descriptor = 
	"(Lpa;)V")

	FriendSystem(LoginType var1) {
		this.field801 = 0;
		this.loginType = var1;
		this.friendsList = new FriendsList(var1);
		this.ignoreList = new IgnoreList(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(S)Z", garbageValue = 
	"215")

	boolean method1657() {
		return this.field801 == 2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"16711935")

	final void method1687() {
		this.field801 = 1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"-490203066")

	@Export("readUpdate")
	final void readUpdate(Buffer var1, int var2) {
		this.friendsList.read(var1, var2);
		this.field801 = 2;
		Strings.method5795();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"1")

	@Export("processFriendUpdates")
	final void processFriendUpdates() {
		for (FriendLoginUpdate var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.last())); var1 != null; var1 = ((FriendLoginUpdate) (this.friendsList.friendLoginUpdates.previous()))) {
			if (((long) (var1.field4259)) < ((WorldMapSprite.getServerTime() / 1000L) - 5L)) {
				if (var1.world > 0) {
					Login.addGameMessage(5, "", var1.username + " has logged in.");
				}

				if (var1.world == 0) {
					Login.addGameMessage(5, "", var1.username + " has logged out.");
				}

				var1.remove();
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	@Export("clear")
	final void clear() {
		this.field801 = 0;
		this.friendsList.clear();
		this.ignoreList.clear();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lqy;ZB)Z", garbageValue = 
	"-62")

	@Export("isFriended")
	final boolean isFriended(Username var1, boolean var2) {
		if (var1 == null) {
			return false;
		} else if (var1.equals(class19.localPlayer.username)) {
			return true;
		} else {
			return this.friendsList.isFriended(var1, var2);
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lqy;B)Z", garbageValue = 
	"33")

	@Export("isIgnored")
	final boolean isIgnored(Username var1) {
		if (var1 == null) {
			return false;
		} else {
			return this.ignoreList.contains(var1);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"957037997")

	@Export("addFriend")
	final void addFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var4;
				if (this.friendsListIsFull()) {
					var10000 = null;
					var4 = "Your friend list is full. Max of 200 for free users, and 400 for members";
					Login.addGameMessage(30, "", var4);
				} else if (class19.localPlayer.username.equals(var2)) {
					class33.method632();
				} else if (this.isFriended(var2, false)) {
					class241.method5001(var1);
				} else if (this.isIgnored(var2)) {
					var10000 = new StringBuilder();
					Object var10001 = null;
					var10000 = var10000.append("Please remove ").append(var1);
					var10001 = null;
					var4 = var10000.append(" from your ignore list first").toString();
					Login.addGameMessage(30, "", var4);
				} else {
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"146943112")

	@Export("friendsListIsFull")
	final boolean friendsListIsFull() {
		return this.friendsList.isFull() || ((this.friendsList.getSize() >= 200) && (Client.field607 != 1));
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"32")

	@Export("addIgnore")
	final void addIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				StringBuilder var10000;
				String var4;
				if (this.canAddIgnore()) {
					var10000 = null;
					var4 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
					Login.addGameMessage(30, "", var4);
				} else if (class19.localPlayer.username.equals(var2)) {
					var10000 = null;
					var4 = "You can't add yourself to your own ignore list";
					Login.addGameMessage(30, "", var4);
				} else if (this.isIgnored(var2)) {
					var10000 = new StringBuilder().append(var1);
					Object var10001 = null;
					var4 = var10000.append(" is already on your ignore list").toString();
					Login.addGameMessage(30, "", var4);
				} else if (this.isFriended(var2, false)) {
					class10.method106(var1);
				} else {
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2923, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"117")

	@Export("canAddIgnore")
	final boolean canAddIgnore() {
		return this.ignoreList.isFull() || ((this.ignoreList.getSize() >= 100) && (Client.field607 != 1));
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-780712144")

	@Export("removeFriend")
	final void removeFriend(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.friendsList.removeByUsername(var2)) {
					Client.field685 = Client.cycleCntr;
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2936, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				Strings.method5795();
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)V", garbageValue = 
	"70")

	@Export("removeIgnore")
	final void removeIgnore(String var1) {
		if (var1 != null) {
			Username var2 = new Username(var1, this.loginType);
			if (var2.hasCleanName()) {
				if (this.ignoreList.removeByUsername(var2)) {
					Client.field685 = Client.cycleCntr;
					PacketBufferNode var3 = ItemContainer.getPacketBufferNode(ClientPacket.field2991, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var1));
					var3.packetBuffer.writeStringCp1252NullTerminated(var1);
					Client.packetWriter.addNode(var3);
				}

				ObjectComposition.FriendSystem_invalidateIgnoreds();
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(Lqy;I)Z", garbageValue = 
	"-1790043427")

	@Export("isFriendAndHasWorld")
	final boolean isFriendAndHasWorld(Username var1) {
		Friend var2 = ((Friend) (this.friendsList.getByUsername(var1)));
		return (var2 != null) && var2.hasWorld();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IIII)Lbo;", garbageValue = 
	"878673450")

	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class401.method7247(var1, var0);
		Script var5 = ((Script) (Script.Script_cached.get(((long) (var3 << 16)))));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3);
			int var7 = class135.archive12.getGroupId(var6);
			if (var7 == (-1)) {
				var4 = null;
			} else {
				label59 : {
					byte[] var8 = class135.archive12.takeFileFlat(var7);
					if (var8 != null) {
						if (var8.length <= 1) {
							var4 = null;
							break label59;
						}

						var5 = Message.newScript(var8);
						if (var5 != null) {
							Script.Script_cached.put(var5, ((long) (var3 << 16)));
							var4 = var5;
							break label59;
						}
					}

					var4 = null;
				}
			}
		}

		if (var4 != null) {
			return var4;
		} else {
			var3 = FloorUnderlayDefinition.method3536(var2, var0);
			Script var11 = ((Script) (Script.Script_cached.get(((long) (var3 << 16)))));
			Script var12;
			if (var11 != null) {
				var12 = var11;
			} else {
				String var13 = String.valueOf(var3);
				int var9 = class135.archive12.getGroupId(var13);
				if (var9 == (-1)) {
					var12 = null;
				} else {
					byte[] var10 = class135.archive12.takeFileFlat(var9);
					if (var10 != null) {
						if (var10.length <= 1) {
							var12 = null;
							return var12 != null ? var12 : null;
						}

						var11 = Message.newScript(var10);
						if (var11 != null) {
							Script.Script_cached.put(var11, ((long) (var3 << 16)));
							var12 = var11;
							return var12 != null ? var12 : null;
						}
					}

					var12 = null;
				}
			}

			return var12 != null ? var12 : null;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljt;", garbageValue = 
	"2041104179")

	public static PacketBufferNode method1723() {
		PacketBufferNode var0;
		if (PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0) {
			var0 = new PacketBufferNode();
		} else {
			var0 = PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
		}

		var0.clientPacket = null;
		var0.clientPacketLength = 0;
		var0.packetBuffer = new PacketBuffer(5000);
		return var0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"-92")

	public static boolean method1658(int var0) {
		return ((var0 >> 30) & 1) != 0;
	}
}