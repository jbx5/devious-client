import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class9 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lr;")

	static final class9 field43;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lr;")

	public static final class9 field44;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lr;")

	static final class9 field37;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lr;")

	static final class9 field36;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lr;")

	static final class9 field38;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(intValue = 
	1883426091)

	static int field35;
	@ObfuscatedName("ha")
	@ObfuscatedGetter(intValue = 
	1206861129)

	static int field34;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1164332207)

	int field39;
	@ObfuscatedName("d")
	String field40;
	@ObfuscatedName("f")
	boolean field41;
	@ObfuscatedName("u")
	boolean field42;
	static 
	{
		field43 = new class9(0, "POST", true, true);
		field44 = new class9(1, "GET", true, false);
		field37 = new class9(2, "PUT", false, true);
		field36 = new class9(3, "PATCH", false, true);
		field38 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field39 = var1;
		this.field40 = var2;
		this.field41 = var3;
		this.field42 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"-101")

	boolean method65() {
		return this.field41;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field39;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"-259330959")

	String method73() {
		return this.field40;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"112")

	boolean method67() {
		return this.field42;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)Lfj;", garbageValue = 
	"-2110640851")

	@Export("getNpcDefinition")
	public static NPCComposition getNpcDefinition(int var0) {
		NPCComposition var1 = ((NPCComposition) (NPCComposition.NpcDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = NPCComposition.NpcDefinition_archive.takeFile(9, var0);
			var1 = new NPCComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			NPCComposition.NpcDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpy;II)Z", garbageValue = 
	"-1970074857")

	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}

			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[(++Players.Players_pendingUpdateCount) - 1] = var1;
			}

			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1289[var1] != null) {
					var11.read(Players.field1289[var1]);
				}

				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = (var7 >> 14) & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1285[var1];
				var11.plane = ((byte) (var8));
				var11.resetPath(((var9 << 13) + var3) - ApproximateRouteStrategy.baseX, ((var10 << 13) + var4) - class250.baseY);
				var11.field1109 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = ((((var4 >> 28) + var3) & 3) << 28) + (var4 & 268435455);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = ((var6 >> 28) + var4) & 3;
				var8 = (var6 >> 14) & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}

				if (var5 == 1) {
					--var9;
				}

				if (var5 == 2) {
					++var8;
					--var9;
				}

				if (var5 == 3) {
					--var8;
				}

				if (var5 == 4) {
					++var8;
				}

				if (var5 == 5) {
					--var8;
					++var9;
				}

				if (var5 == 6) {
					++var9;
				}

				if (var5 == 7) {
					++var8;
					++var9;
				}

				Players.Players_regions[var1] = ((var8 << 14) + var9) + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = (var3 >> 8) & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = ((var7 >> 28) + var4) & 3;
				var9 = (var5 + (var7 >> 14)) & 255;
				var10 = (var7 + var6) & 255;
				Players.Players_regions[var1] = ((var9 << 14) + var10) + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-118")

	static final void method64() {
		if (Client.logoutTimer > 0) {
			GameObject.logOut();
		} else {
			Client.timer.method6595();
			InterfaceParent.updateGameState(40);
			BuddyRankComparator.field1378 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}

	@ObfuscatedName("fx")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"1705130221")

	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			Interpreter.clientPreferences.method2254(!Interpreter.clientPreferences.method2255());
			if (Interpreter.clientPreferences.method2255()) {
				Login.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				Login.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			Interpreter.clientPreferences.method2271();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				ClanChannel.worldMap.showCoord = !ClanChannel.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				Interpreter.clientPreferences.method2265(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				Interpreter.clientPreferences.method2265(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				method64();
			}
		}

		PacketBufferNode var1 = ItemContainer.getPacketBufferNode(ClientPacket.field2987, Client.packetWriter.isaacCipher);
		var1.packetBuffer.writeByte(var0.length() + 1);
		var1.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var1);
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-117")

	static final void method85() {
		PacketBufferNode var0 = ItemContainer.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field838 = true;

		for (InterfaceParent var1 = ((InterfaceParent) (Client.interfaceParents.first())); var1 != null; var1 = ((InterfaceParent) (Client.interfaceParents.next()))) {
			if ((var1.type == 0) || (var1.type == 3)) {
				class20.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class290.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field838 = false;
	}
}