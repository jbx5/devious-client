import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class164 {
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -592304533
	)
	static int field1812;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = -2954807226888514321L
	)
	long field1811;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		longValue = 7504978253578014429L
	)
	public long field1808;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	IterableNodeDeque field1809;

	@ObfuscatedSignature(
		descriptor = "(Lvp;)V"
	)
	public class164(Buffer var1) {
		this.field1808 = -1L;
		this.field1809 = new IterableNodeDeque();
		this.method3452(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "2078305167"
	)
	void method3452(Buffer var1) {
		this.field1811 = var1.readLong();
		this.field1808 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class159(this);
			} else if (var2 == 4) {
				var3 = new class170(this);
			} else if (var2 == 3) {
				var3 = new class155(this);
			} else if (var2 == 2) {
				var3 = new class153(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class160(this);
			}

			((class163)var3).vmethod3524(var1);
			this.field1809.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lgj;I)V",
		garbageValue = "1710439935"
	)
	public void method3453(ClanChannel var1) {
		if (var1.key == this.field1811 && var1.field1821 == this.field1808) {
			for (class163 var2 = (class163)this.field1809.last(); var2 != null; var2 = (class163)this.field1809.previous()) {
				var2.vmethod3523(var1);
			}

			++var1.field1821;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "371239413"
	)
	@Export("ItemDefinition_get")
	public static ItemComposition ItemDefinition_get(int var0) {
		ItemComposition var1 = (ItemComposition)ItemComposition.ItemDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ItemComposition.ItemDefinition_archive.takeFile(10, var0);
			var1 = new ItemComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.post();
			if (var1.noteTemplate != -1) {
				var1.genCert(ItemDefinition_get(var1.noteTemplate), ItemDefinition_get(var1.note));
			}

			if (var1.notedId != -1) {
				var1.genBought(ItemDefinition_get(var1.notedId), ItemDefinition_get(var1.unnotedId));
			}

			if (var1.placeholderTemplate != -1) {
				var1.genPlaceholder(ItemDefinition_get(var1.placeholderTemplate), ItemDefinition_get(var1.placeholder));
			}

			if (!ItemComposition.ItemDefinition_inMembersWorld && var1.isMembersOnly) {
				if (var1.noteTemplate == -1 && var1.notedId == -1 && var1.placeholderTemplate == -1) {
					var1.name = var1.name + " (Members)";
				}

				var1.examine = "Login to a members' server to use this object.";
				var1.isTradable = false;

				int var3;
				for (var3 = 0; var3 < var1.groundActions.length; ++var3) {
					var1.groundActions[var3] = null;
				}

				for (var3 = 0; var3 < var1.inventoryActions.length; ++var3) {
					if (var3 != 4) {
						var1.inventoryActions[var3] = null;
					}
				}

				var1.shiftClickIndex = -2;
				var1.team = 0;
				if (var1.params != null) {
					boolean var6 = false;

					for (Node var4 = var1.params.first(); var4 != null; var4 = var1.params.next()) {
						ParamComposition var5 = ApproximateRouteStrategy.getParamDefinition((int)var4.key);
						if (var5.autoDisable) {
							var4.remove();
						} else {
							var6 = true;
						}
					}

					if (!var6) {
						var1.params = null;
					}
				}
			}

			ItemComposition.ItemDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-693831415"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) {
			class105.clientPreferences.updateRoofsHidden(!class105.clientPreferences.isRoofsHidden());
			if (class105.clientPreferences.isRoofsHidden()) {
				VarbitComposition.addGameMessage(99, "", "Roofs are now all hidden");
			} else {
				VarbitComposition.addGameMessage(99, "", "Roofs will only be removed selectively");
			}
		}

		if (var0.startsWith("zbuf")) {
			boolean var1 = GrandExchangeEvent.method7351(var0.substring(5).trim()) == 1;
			class415.client.method501(var1);
			Rasterizer3D.method5325(var1);
		}

		if (var0.equalsIgnoreCase("z")) {
			Client.z = !Client.z;
		}

		if (var0.equalsIgnoreCase("displayfps")) {
			class105.clientPreferences.toggleDisplayFps();
		}

		if (var0.equalsIgnoreCase("renderself")) {
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (var0.startsWith("setdrawdistance")) {
			String[] var3 = var0.split(" ");

			try {
				int var2 = Integer.parseInt(var3[1]);
				class105.clientPreferences.setDrawDistance(var2);
			} catch (NumberFormatException var5) {
				VarbitComposition.addGameMessage(99, "", String.format("Error setting draw distance. setdrawdistance should be in the format \"::setdrawdistance X\" where X is a valid number. Value provided: %s", var3[1]));
			}
		}

		if (var0.equalsIgnoreCase("getdrawdistance")) {
			VarbitComposition.addGameMessage(99, "", String.format("%d", class105.clientPreferences.getDrawDistance()));
		}

		if (Client.staffModLevel >= 2) {
			if (var0.equalsIgnoreCase("errortest")) {
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				VertexNormal.worldMap.showCoord = !VertexNormal.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) {
				class105.clientPreferences.updateDisplayFps(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) {
				class105.clientPreferences.updateDisplayFps(false);
			}

			if (var0.equalsIgnoreCase("gc")) {
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				class131.method3068();
			}
		}

		PacketBufferNode var6 = class170.getPacketBufferNode(ClientPacket.DOCHEAT, Client.packetWriter.isaacCipher);
		var6.packetBuffer.writeByte(var0.length() + 1);
		var6.packetBuffer.writeStringCp1252NullTerminated(var0);
		Client.packetWriter.addNode(var6);
	}
}
