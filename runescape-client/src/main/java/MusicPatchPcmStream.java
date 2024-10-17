import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("jt")
	static int[][] field3717;
	@ObfuscatedName("ji")
	static byte[][] field3716;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmn;"
	)
	@Export("superStream")
	MidiPcmStream superStream;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("queue")
	NodeDeque queue;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lbn;"
	)
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(
		descriptor = "(Lmn;)V"
	)
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lnx;[IIIII)V",
		garbageValue = "-1306884751"
	)
	void method6794(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3652[var1.field3735] & 4) != 0 && var1.field3731 < 0) {
			int var6 = this.superStream.field3650[var1.field3735] / (ArchiveLoader.field1059 * -336955471);

			while (true) {
				int var7 = (var6 + 1048575 - var1.field3740) / var6;
				if (var7 > var4) {
					var1.field3740 += var4 * var6;
					break;
				}

				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3740 += var7 * var6 - 1048576;
				int var8 = ArchiveLoader.field1059 * -336955471 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}

				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3655[var1.field3735] == 0) {
					var1.stream = RawPcmStream.method901(var1.rawSound, var10.method1000(), var10.method1028(), var10.method908());
				} else {
					var1.stream = RawPcmStream.method901(var1.rawSound, var10.method1000(), 0, var10.method908());
					this.superStream.method6691(var1, var1.table.field3698[var1.field3725] < 0);
					var1.stream.method912(var8, var10.method1028());
				}

				if (var1.table.field3698[var1.field3725] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var10.method1040(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method918()) {
					this.mixer.addSubStream(var10);
				}
			}
		}

		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnx;II)V",
		garbageValue = "2108729399"
	)
	void method6795(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3652[var1.field3735] & 4) != 0 && var1.field3731 < 0) {
			int var3 = this.superStream.field3650[var1.field3735] / (ArchiveLoader.field1059 * -336955471);
			int var4 = (var3 + 1048575 - var1.field3740) / var3;
			var1.field3740 = var3 * var2 + var1.field3740 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3655[var1.field3735] == 0) {
					var1.stream = RawPcmStream.method901(var1.rawSound, var1.stream.method1000(), var1.stream.method1028(), var1.stream.method908());
				} else {
					var1.stream = RawPcmStream.method901(var1.rawSound, var1.stream.method1000(), 0, var1.stream.method908());
					this.superStream.method6691(var1, var1.table.field3698[var1.field3725] < 0);
				}

				if (var1.table.field3698[var1.field3725] < 0) {
					var1.stream.setNumLoops(-1);
				}

				var2 = var1.field3740 / var3;
			}
		}

		var1.stream.skip(var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = (MusicPatchNode)this.queue.last();
		if (var1 == null) {
			return null;
		} else {
			return (PcmStream)(var1.stream != null ? var1.stream : this.nextSubStream());
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = (MusicPatchNode)this.queue.previous();
			if (var1 == null) {
				return null;
			}
		} while(var1.stream == null);

		return var1.stream;
	}

	@ObfuscatedName("ae")
	protected int vmethod6791() {
		return 0;
	}

	@ObfuscatedName("am")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);

		for (MusicPatchNode var6 = (MusicPatchNode)this.queue.last(); var6 != null; var6 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6625(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3734) {
						this.method6794(var6, var1, var4, var5, var5 + var4);
						var6.field3734 -= var5;
						break;
					}

					this.method6794(var6, var1, var4, var6.field3734, var4 + var5);
					var4 += var6.field3734;
					var5 -= var6.field3734;
				} while(!this.superStream.method6637(var6, var1, var4, var5));
			}
		}

	}

	@ObfuscatedName("au")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);

		for (MusicPatchNode var3 = (MusicPatchNode)this.queue.last(); var3 != null; var3 = (MusicPatchNode)this.queue.previous()) {
			if (!this.superStream.method6625(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3734) {
						this.method6795(var3, var2);
						var3.field3734 -= var2;
						break;
					}

					this.method6795(var3, var3.field3734);
					var2 -= var3.field3734;
				} while(!this.superStream.method6637(var3, (int[])null, 0, var2));
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "-1138328879"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (GrandExchangeOfferNameComparator.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = GrandExchangeOfferNameComparator.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-629903058"
	)
	static final boolean method6800(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (GrandExchangeEvent.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class535.field5348;

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			var1 = class535.field5346;

			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-94"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field772 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (LoginPacket.getWindowedMode() == 1) {
			Projectile.client.setMaxCanvasSize(765, 503);
		} else {
			Projectile.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = class113.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(LoginPacket.getWindowedMode());
			var1.packetBuffer.writeShort(HttpRequestTask.canvasWidth);
			var1.packetBuffer.writeShort(class268.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "614997679"
	)
	static final int method6792() {
		return Client.menu.menuOptionsCount - 1;
	}
}
