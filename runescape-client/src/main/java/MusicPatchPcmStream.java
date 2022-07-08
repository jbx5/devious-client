import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jy")
@Implements("MusicPatchPcmStream")
public class MusicPatchPcmStream extends PcmStream {
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ljp;")
	@Export("superStream")
	MidiPcmStream superStream;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llo;")
	@Export("queue")
	NodeDeque queue;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lam;")
	@Export("mixer")
	PcmStreamMixer mixer;

	@ObfuscatedSignature(descriptor = "(Ljp;)V")
	MusicPatchPcmStream(MidiPcmStream var1) {
		this.queue = new NodeDeque();
		this.mixer = new PcmStreamMixer();
		this.superStream = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljm;[IIIIB)V", garbageValue = "110")
	void method5439(MusicPatchNode var1, int[] var2, int var3, int var4, int var5) {
		if ((this.superStream.field3210[var1.field3284] & 4) != 0 && var1.field3278 < 0) {
			int var6 = this.superStream.field3207[var1.field3284] / PcmPlayer.field287;
			while (true) {
				int var7 = (var6 + 1048575 - var1.field3270) / var6;
				if (var7 > var4) {
					var1.field3270 += var6 * var4;
					break;
				}
				var1.stream.fill(var2, var3, var7);
				var3 += var7;
				var4 -= var7;
				var1.field3270 += var7 * var6 - 1048576;
				int var8 = PcmPlayer.field287 / 100;
				int var9 = 262144 / var6;
				if (var9 < var8) {
					var8 = var9;
				}
				RawPcmStream var10 = var1.stream;
				if (this.superStream.field3229[var1.field3284] == 0) {
					var1.stream = RawPcmStream.method775(var1.rawSound, var10.method819(), var10.method918(), var10.method782());
				} else {
					var1.stream = RawPcmStream.method775(var1.rawSound, var10.method819(), 0, var10.method782());
					this.superStream.method5264(var1, var1.patch.field3250[var1.field3269] < 0);
					var1.stream.method890(var8, var10.method918());
				}
				if (var1.patch.field3250[var1.field3269] < 0) {
					var1.stream.setNumLoops(-1);
				}
				var10.method802(var8);
				var10.fill(var2, var3, var5 - var3);
				if (var10.method792()) {
					this.mixer.addSubStream(var10);
				}
			} 
		}
		var1.stream.fill(var2, var3, var4);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljm;IB)V", garbageValue = "79")
	void method5440(MusicPatchNode var1, int var2) {
		if ((this.superStream.field3210[var1.field3284] & 4) != 0 && var1.field3278 < 0) {
			int var3 = this.superStream.field3207[var1.field3284] / PcmPlayer.field287;
			int var4 = (var3 + 1048575 - var1.field3270) / var3;
			var1.field3270 = var3 * var2 + var1.field3270 & 1048575;
			if (var4 <= var2) {
				if (this.superStream.field3229[var1.field3284] == 0) {
					var1.stream = RawPcmStream.method775(var1.rawSound, var1.stream.method819(), var1.stream.method918(), var1.stream.method782());
				} else {
					var1.stream = RawPcmStream.method775(var1.rawSound, var1.stream.method819(), 0, var1.stream.method782());
					this.superStream.method5264(var1, var1.patch.field3250[var1.field3269] < 0);
				}
				if (var1.patch.field3250[var1.field3269] < 0) {
					var1.stream.setNumLoops(-1);
				}
				var2 = var1.field3270 / var3;
			}
		}
		var1.stream.skip(var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		MusicPatchNode var1 = ((MusicPatchNode) (this.queue.last()));
		if (var1 == null) {
			return null;
		} else {
			return ((PcmStream) (var1.stream != null ? var1.stream : this.nextSubStream()));
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "()Laz;")
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		MusicPatchNode var1;
		do {
			var1 = ((MusicPatchNode) (this.queue.previous()));
			if (var1 == null) {
				return null;
			}
		} while (var1.stream == null );
		return var1.stream;
	}

	@ObfuscatedName("w")
	protected int vmethod5437() {
		return 0;
	}

	@ObfuscatedName("y")
	@Export("fill")
	protected void fill(int[] var1, int var2, int var3) {
		this.mixer.fill(var1, var2, var3);
		for (MusicPatchNode var6 = ((MusicPatchNode) (this.queue.last())); var6 != null; var6 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5287(var6)) {
				int var4 = var2;
				int var5 = var3;
				do {
					if (var5 <= var6.field3283) {
						this.method5439(var6, var1, var4, var5, var5 + var4);
						var6.field3283 -= var5;
						break;
					}
					this.method5439(var6, var1, var4, var6.field3283, var5 + var4);
					var4 += var6.field3283;
					var5 -= var6.field3283;
				} while (!this.superStream.method5317(var6, var1, var4, var5) );
			}
		}
	}

	@ObfuscatedName("s")
	@Export("skip")
	protected void skip(int var1) {
		this.mixer.skip(var1);
		for (MusicPatchNode var3 = ((MusicPatchNode) (this.queue.last())); var3 != null; var3 = ((MusicPatchNode) (this.queue.previous()))) {
			if (!this.superStream.method5287(var3)) {
				int var2 = var1;
				do {
					if (var2 <= var3.field3283) {
						this.method5440(var3, var2);
						var3.field3283 -= var2;
						break;
					}
					this.method5440(var3, var3.field3283);
					var2 -= var3.field3283;
				} while (!this.superStream.method5317(var3, ((int[]) (null)), 0, var2) );
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(Lbc;Lbc;IZIZB)I", garbageValue = "44")
	static int method5445(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class133.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = class133.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(descriptor = "(Lcq;ZB)V", garbageValue = "38")
	@Export("closeInterface")
	static final void closeInterface(InterfaceParent var0, boolean var1) {
		int var2 = var0.group;
		int var3 = ((int) (var0.key));
		var0.remove();
		if (var1 && var2 != -1 && class228.Widget_loadedInterfaces[var2]) {
			Widget_archive.clearFilesGroup(var2);
			if (SoundCache.Widget_interfaceComponents[var2] != null) {
				boolean var4 = true;
				for (int var5 = 0; var5 < SoundCache.Widget_interfaceComponents[var2].length; ++var5) {
					if (SoundCache.Widget_interfaceComponents[var2][var5] != null) {
						if (SoundCache.Widget_interfaceComponents[var2][var5].type != 2) {
							SoundCache.Widget_interfaceComponents[var2][var5] = null;
						} else {
							var4 = false;
						}
					}
				}
				if (var4) {
					SoundCache.Widget_interfaceComponents[var2] = null;
				}
				class228.Widget_loadedInterfaces[var2] = false;
			}
		}
		for (IntegerNode var6 = ((IntegerNode) (Client.widgetFlags.first())); var6 != null; var6 = ((IntegerNode) (Client.widgetFlags.next()))) {
			if (((long) (var2)) == (var6.key >> 48 & 65535L)) {
				var6.remove();
			}
		}
		Widget var7 = class140.getWidget(var3);
		if (var7 != null) {
			ChatChannel.invalidateWidget(var7);
		}
		if (Client.rootInterface != -1) {
			class7.runIntfCloseListeners(Client.rootInterface, 1);
		}
	}
}