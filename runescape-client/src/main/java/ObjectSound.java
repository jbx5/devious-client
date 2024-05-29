import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -628097453
	)
	static int field866;
	@ObfuscatedName("hv")
	static int[] field869;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1864766337
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 56891629
	)
	@Export("x")
	int x;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2142850895
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1066887777
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1156688000
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2046732581
	)
	int field859;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1096256259
	)
	int field858;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 844790461
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 835726103
	)
	int field867;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1986008745
	)
	int field868;
	@ObfuscatedName("aq")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -114126391
	)
	int field870;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lbz;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1305777046"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field859 = var2.int7 * 16384;
			this.field858 = var2.int8 * 16384;
			this.field867 = var2.int5;
			this.field868 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field859 = 0;
			this.field858 = 0;
			this.field867 = 0;
			this.field868 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			class349.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhq;",
		garbageValue = "103"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ldm;",
		garbageValue = "79"
	)
	@Export("getScript")
	static Script getScript(int var0, int var1) {
		Script var2 = (Script)Script.Script_cached.get((long)(var0 << 16));
		if (var2 != null) {
			return var2;
		} else {
			String var3 = String.valueOf(var0);
			int var4 = class438.archive12.getGroupId(var3);
			if (var4 == -1) {
				return null;
			} else {
				byte[] var5 = class438.archive12.takeFileFlat(var4);
				if (var5 != null) {
					if (var5.length <= 1) {
						return null;
					}

					var2 = LoginScreenAnimation.newScript(var5);
					if (var2 != null) {
						Script.Script_cached.put(var2, (long)(var0 << 16));
						return var2;
					}
				}

				return null;
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(Lba;B)V",
		garbageValue = "46"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false;
		if (var0.sound != null) {
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1);
		}

	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZI)Lot;",
		garbageValue = "1244681496"
	)
	static Archive method1963(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class74.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var6, class332.masterDisk, HttpMethod.field32, var0, var1, var2, var3, var4, var5);
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1165354324"
	)
	static void method1954() {
		if (Client.isSpellSelected) {
			Widget var0 = AsyncRestClient.widgetDefinition.getWidgetChild(Strings.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class371.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			class324.invalidateWidget(var0);
		}
	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "111"
	)
	static final void method1966() {
		PacketBufferNode var0 = WorldMapElement.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field895 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				MouseHandler.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			class324.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field895 = false;
	}
}
