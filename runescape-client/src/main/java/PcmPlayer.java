import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
@Implements("PcmPlayer")
public class PcmPlayer {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 198001113
	)
	public static int field307;
	@ObfuscatedName("w")
	@Export("PcmPlayer_stereo")
	protected static boolean PcmPlayer_stereo;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1129159487
	)
	static int field289;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static Archive field308;
	@ObfuscatedName("t")
	@Export("samples")
	protected int[] samples;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	@Export("stream")
	PcmStream stream;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 345659719
	)
	int field305;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		longValue = -4829683574331307973L
	)
	@Export("timeMs")
	long timeMs;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 281559795
	)
	@Export("capacity")
	int capacity;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1788039721
	)
	int field296;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -51038683
	)
	int field309;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = -6052758255276747429L
	)
	long field287;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1751912477
	)
	int field292;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1590684117
	)
	int field300;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1088142097
	)
	int field301;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		longValue = -5715826514371147267L
	)
	long field302;
	@ObfuscatedName("o")
	boolean field303;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 703781733
	)
	int field304;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	PcmStream[] field288;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lay;"
	)
	PcmStream[] field306;

	protected PcmPlayer() {
		this.field305 = 32;
		this.timeMs = Language.method6232();
		this.field287 = 0L; // L: 27
		this.field292 = 0; // L: 28
		this.field300 = 0; // L: 29
		this.field301 = 0; // L: 30
		this.field302 = 0L; // L: 31
		this.field303 = true; // L: 32
		this.field304 = 0; // L: 38
		this.field288 = new PcmStream[8]; // L: 39
		this.field306 = new PcmStream[8]; // L: 40
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1258996867"
	)
	@Export("init")
	protected void init() throws Exception {
	} // L: 284

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-18767"
	)
	@Export("open")
	protected void open(int var1) throws Exception {
	} // L: 285

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1605756455"
	)
	@Export("position")
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}

	@ObfuscatedName("n")
	@Export("write")
	protected void write() throws Exception {
	} // L: 291

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1217659327"
	)
	@Export("close")
	protected void close() {
	} // L: 292

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1686238954"
	)
	@Export("discard")
	protected void discard() throws Exception {
	} // L: 293

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lay;I)V",
		garbageValue = "-1505570976"
	)
	@Export("setStream")
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2009296387"
	)
	@Export("run")
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = Language.method6232(); // L: 88

			try {
				if (this.field287 != 0L) { // L: 90
					if (var1 < this.field287) { // L: 91
						return;
					}

					this.open(this.capacity); // L: 92
					this.field287 = 0L; // L: 93
					this.field303 = true; // L: 94
				}

				int var3 = this.position(); // L: 96
				if (this.field301 - var3 > this.field292) { // L: 97
					this.field292 = this.field301 - var3;
				}

				int var4 = this.field296 + this.field309; // L: 98
				if (var4 + 256 > 16384) { // L: 99
					var4 = 16128;
				}

				if (var4 + 256 > this.capacity) { // L: 100
					this.capacity += 1024; // L: 101
					if (this.capacity > 16384) { // L: 102
						this.capacity = 16384;
					}

					this.close(); // L: 103
					this.open(this.capacity); // L: 104
					var3 = 0; // L: 105
					this.field303 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field309 = var4 - this.field296; // L: 109
					}
				}

				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}

				if (var1 > this.field302) { // L: 117
					if (!this.field303) { // L: 118
						if (this.field292 == 0 && this.field300 == 0) { // L: 119
							this.close(); // L: 120
							this.field287 = var1 + 2000L; // L: 121
							return; // L: 122
						}

						this.field309 = Math.min(this.field300, this.field292); // L: 124
						this.field300 = this.field292; // L: 125
					} else {
						this.field303 = false; // L: 127
					}

					this.field292 = 0; // L: 128
					this.field302 = 2000L + var1; // L: 129
				}

				this.field301 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field287 = var1 + 2000L; // L: 135
			}

			try {
				if (var1 > 500000L + this.timeMs) { // L: 138
					var1 = this.timeMs;
				}

				while (var1 > 5000L + this.timeMs) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long)(256000 / field307); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}

		}
	} // L: 147

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-706031060"
	)
	public final void method774() {
		this.field303 = true; // L: 150
	} // L: 151

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2013759457"
	)
	@Export("tryDiscard")
	public final synchronized void tryDiscard() {
		this.field303 = true; // L: 154

		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field287 = Language.method6232() + 2000L; // L: 160
		}

	} // L: 162

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2126791300"
	)
	@Export("shutdown")
	public final synchronized void shutdown() {
		if (Decimator.soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166

			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == Decimator.soundSystem.players[var2]) {
					Decimator.soundSystem.players[var2] = null; // L: 168
				}

				if (Decimator.soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}

			if (var1) { // L: 171
				class342.soundSystemExecutor.shutdownNow(); // L: 172
				class342.soundSystemExecutor = null; // L: 173
				Decimator.soundSystem = null; // L: 174
			}
		}

		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1528008370"
	)
	@Export("skip")
	final void skip(int var1) {
		this.field304 -= var1; // L: 182
		if (this.field304 < 0) {
			this.field304 = 0; // L: 183
		}

		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}

	} // L: 185

	@ObfuscatedName("aq")
	@Export("fill")
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}

		class352.clearIntArray(var1, 0, var3); // L: 191
		this.field304 -= var2; // L: 192
		if (this.stream != null && this.field304 <= 0) { // L: 193
			this.field304 += field307 >> 4; // L: 194
			InvDefinition.PcmStream_disable(this.stream); // L: 195
			this.method762(this.stream, this.stream.vmethod1015()); // L: 196
			int var4 = 0; // L: 197
			int var5 = 255; // L: 198

			int var6;
			PcmStream var10;
			label107:
			for (var6 = 7; var5 != 0; --var6) { // L: 199
				int var7;
				int var8;
				if (var6 < 0) { // L: 202
					var7 = var6 & 3; // L: 203
					var8 = -(var6 >> 2); // L: 204
				} else {
					var7 = var6; // L: 207
					var8 = 0; // L: 208
				}

				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L: 210 212
					if ((var9 & 1) != 0) { // L: 215
						var5 &= ~(1 << var7); // L: 218
						var10 = null; // L: 219
						PcmStream var11 = this.field288[var7]; // L: 220

						label101:
						while (true) {
							while (true) {
								if (var11 == null) { // L: 221
									break label101;
								}

								AbstractSound var12 = var11.sound; // L: 222
								if (var12 != null && var12.position > var8) { // L: 223
									var5 |= 1 << var7; // L: 224
									var10 = var11; // L: 225
									var11 = var11.after; // L: 226
								} else {
									var11.active = true; // L: 229
									int var13 = var11.vmethod5612(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) {
										var12.position += var13; // L: 232
									}

									if (var4 >= this.field305) { // L: 233
										break label107;
									}

									PcmStream var14 = var11.firstSubStream(); // L: 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field360; var14 != null; var14 = var11.nextSubStream()) { // L: 236 237 239
											this.method762(var14, var15 * var14.vmethod1015() >> 8); // L: 238
										}
									}

									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field288[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}

									if (var18 == null) { // L: 246
										this.field306[var7] = var10;
									}

									var11 = var18; // L: 247
								}
							}
						}
					}

					var7 += 4; // L: 211
					++var8;
				}
			}

			for (var6 = 0; var6 < 8; ++var6) { // L: 251
				PcmStream var16 = this.field288[var6]; // L: 252
				PcmStream[] var17 = this.field288; // L: 253
				this.field306[var6] = null; // L: 255

				for (var17[var6] = null; var16 != null; var16 = var10) { // L: 256 257 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}

		if (this.field304 < 0) { // L: 264
			this.field304 = 0;
		}

		if (this.stream != null) { // L: 265
			this.stream.fill(var1, 0, var2);
		}

		this.timeMs = Language.method6232(); // L: 266
	} // L: 267

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lay;IS)V",
		garbageValue = "-12246"
	)
	final void method762(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field306[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field288[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}

		this.field306[var3] = var1; // L: 280
		var1.field360 = var2; // L: 281
	} // L: 282

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Ljm;",
		garbageValue = "-728628837"
	)
	public static PacketBufferNode method795() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}
}
