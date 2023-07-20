import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("aw")
	int field366;
	@ObfuscatedName("ay")
	int field370;
	@ObfuscatedName("ar")
	int field371;
	@ObfuscatedName("am")
	int field369;
	@ObfuscatedName("as")
	int field365;
	@ObfuscatedName("aj")
	int field363;
	@ObfuscatedName("ag")
	int field367;
	@ObfuscatedName("az")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("av")
	@Export("start")
	int start;
	@ObfuscatedName("ap")
	@Export("end")
	int end;
	@ObfuscatedName("aq")
	boolean field368;
	@ObfuscatedName("at")
	int field372;
	@ObfuscatedName("ah")
	int field373;
	@ObfuscatedName("ax")
	int field374;
	@ObfuscatedName("aa")
	int field375;

	@ObfuscatedSignature(
		descriptor = "(Lbi;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field368 = var1.field282;
		this.field370 = var2;
		this.field371 = var3;
		this.field369 = var4;
		this.field366 = 0;
		this.method888();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbi;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field368 = var1.field282;
		this.field370 = var2;
		this.field371 = var3;
		this.field369 = 8192;
		this.field366 = 0;
		this.method888();
	}

	@ObfuscatedName("as")
	void method888() {
		this.field365 = this.field371;
		this.field363 = method1042(this.field371, this.field369);
		this.field367 = method906(this.field371, this.field369);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "()Lby;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("az")
	protected int vmethod6028() {
		return this.field371 == 0 && this.field372 == 0 ? 0 : 1;
	}

	@ObfuscatedName("av")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field371 == 0 && this.field372 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field366 < 0) {
				if (this.field370 <= 0) {
					this.method897();
					this.remove();
					return;
				}

				this.field366 = 0;
			}

			if (this.field366 >= var7) {
				if (this.field370 >= 0) {
					this.method897();
					this.remove();
					return;
				}

				this.field366 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field368) {
					if (this.field370 < 0) {
						var9 = this.method996(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field366 >= var5) {
							return;
						}

						this.field366 = var5 + var5 - 1 - this.field366;
						this.field370 = -this.field370;
					}

					while (true) {
						var9 = this.method910(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field366 < var6) {
							return;
						}

						this.field366 = var6 + var6 - 1 - this.field366;
						this.field370 = -this.field370;
						var9 = this.method996(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field366 >= var5) {
							return;
						}

						this.field366 = var5 + var5 - 1 - this.field366;
						this.field370 = -this.field370;
					}
				} else if (this.field370 < 0) {
					while (true) {
						var9 = this.method996(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field366 >= var5) {
							return;
						}

						this.field366 = var6 - 1 - (var6 - 1 - this.field366) % var8;
					}
				} else {
					while (true) {
						var9 = this.method910(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field366 < var6) {
							return;
						}

						this.field366 = var5 + (this.field366 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field368) {
						label127: {
							if (this.field370 < 0) {
								var9 = this.method996(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field366 >= var5) {
									return;
								}

								this.field366 = var5 + var5 - 1 - this.field366;
								this.field370 = -this.field370;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method910(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field366 < var6) {
									return;
								}

								this.field366 = var6 + var6 - 1 - this.field366;
								this.field370 = -this.field370;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method996(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field366 >= var5) {
									return;
								}

								this.field366 = var5 + var5 - 1 - this.field366;
								this.field370 = -this.field370;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field370 < 0) {
							while (true) {
								var9 = this.method996(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field366 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field366) / var8;
								if (var10 >= this.numLoops) {
									this.field366 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field366 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method910(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field366 < var6) {
									return;
								}

								var10 = (this.field366 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field366 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field366 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field370 < 0) {
					this.method996(var1, var9, 0, var3, 0);
					if (this.field366 < 0) {
						this.field366 = -1;
						this.method897();
						this.remove();
					}
				} else {
					this.method910(var1, var9, var7, var3, 0);
					if (this.field366 >= var7) {
						this.field366 = var7;
						this.method897();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ap")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("aq")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field372 > 0) {
			if (var1 >= this.field372) {
				if (this.field371 == Integer.MIN_VALUE) {
					this.field371 = 0;
					this.field367 = 0;
					this.field363 = 0;
					this.field365 = 0;
					this.remove();
					var1 = this.field372;
				}

				this.field372 = 0;
				this.method888();
			} else {
				this.field365 += this.field373 * var1;
				this.field363 += this.field374 * var1;
				this.field367 += this.field375 * var1;
				this.field372 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field366 < 0) {
			if (this.field370 <= 0) {
				this.method897();
				this.remove();
				return;
			}

			this.field366 = 0;
		}

		if (this.field366 >= var5) {
			if (this.field370 >= 0) {
				this.method897();
				this.remove();
				return;
			}

			this.field366 = var5 - 1;
		}

		this.field366 += this.field370 * var1;
		if (this.numLoops < 0) {
			if (!this.field368) {
				if (this.field370 < 0) {
					if (this.field366 >= var3) {
						return;
					}

					this.field366 = var4 - 1 - (var4 - 1 - this.field366) % var6;
				} else {
					if (this.field366 < var4) {
						return;
					}

					this.field366 = var3 + (this.field366 - var3) % var6;
				}

			} else {
				if (this.field370 < 0) {
					if (this.field366 >= var3) {
						return;
					}

					this.field366 = var3 + var3 - 1 - this.field366;
					this.field370 = -this.field370;
				}

				while (this.field366 >= var4) {
					this.field366 = var4 + var4 - 1 - this.field366;
					this.field370 = -this.field370;
					if (this.field366 >= var3) {
						return;
					}

					this.field366 = var3 + var3 - 1 - this.field366;
					this.field370 = -this.field370;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field368) {
					label129: {
						if (this.field370 < 0) {
							if (this.field366 >= var3) {
								return;
							}

							this.field366 = var3 + var3 - 1 - this.field366;
							this.field370 = -this.field370;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field366 < var4) {
								return;
							}

							this.field366 = var4 + var4 - 1 - this.field366;
							this.field370 = -this.field370;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field366 >= var3) {
								return;
							}

							this.field366 = var3 + var3 - 1 - this.field366;
							this.field370 = -this.field370;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field370 < 0) {
							if (this.field366 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field366) / var6;
							if (var7 >= this.numLoops) {
								this.field366 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field366 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field366 < var4) {
								return;
							}

							var7 = (this.field366 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field366 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field366 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field370 < 0) {
				if (this.field366 < 0) {
					this.field366 = -1;
					this.method897();
					this.remove();
				}
			} else if (this.field366 >= var5) {
				this.field366 = var5;
				this.method897();
				this.remove();
			}

		}
	}

	@ObfuscatedName("at")
	public synchronized void method1044(int var1) {
		this.method987(var1 << 6, this.method918());
	}

	@ObfuscatedName("ah")
	synchronized void method891(int var1) {
		this.method987(var1, this.method918());
	}

	@ObfuscatedName("ax")
	synchronized void method987(int var1, int var2) {
		this.field371 = var1;
		this.field369 = var2;
		this.field372 = 0;
		this.method888();
	}

	@ObfuscatedName("aa")
	public synchronized int method1007() {
		return this.field371 == Integer.MIN_VALUE ? 0 : this.field371;
	}

	@ObfuscatedName("au")
	public synchronized int method918() {
		return this.field369 < 0 ? -1 : this.field369;
	}

	@ObfuscatedName("ae")
	public synchronized void method988(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field366 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method1012() {
		this.field370 = (this.field370 ^ this.field370 >> 31) + (this.field370 >>> 31);
		this.field370 = -this.field370;
	}

	@ObfuscatedName("ad")
	void method897() {
		if (this.field372 != 0) {
			if (this.field371 == Integer.MIN_VALUE) {
				this.field371 = 0;
			}

			this.field372 = 0;
			this.method888();
		}

	}

	@ObfuscatedName("ao")
	public synchronized void method898(int var1, int var2) {
		this.method899(var1, var2, this.method918());
	}

	@ObfuscatedName("ac")
	public synchronized void method899(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method987(var2, var3);
		} else {
			int var4 = method1042(var2, var3);
			int var5 = method906(var2, var3);
			if (var4 == this.field363 && var5 == this.field367) {
				this.field372 = 0;
			} else {
				int var6 = var2 - this.field365;
				if (this.field365 - var2 > var6) {
					var6 = this.field365 - var2;
				}

				if (var4 - this.field363 > var6) {
					var6 = var4 - this.field363;
				}

				if (this.field363 - var4 > var6) {
					var6 = this.field363 - var4;
				}

				if (var5 - this.field367 > var6) {
					var6 = var5 - this.field367;
				}

				if (this.field367 - var5 > var6) {
					var6 = this.field367 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field372 = var1;
				this.field371 = var2;
				this.field369 = var3;
				this.field373 = (var2 - this.field365) / var1;
				this.field374 = (var4 - this.field363) / var1;
				this.field375 = (var5 - this.field367) / var1;
			}
		}
	}

	@ObfuscatedName("ak")
	public synchronized void method900(int var1) {
		if (var1 == 0) {
			this.method891(0);
			this.remove();
		} else if (this.field363 == 0 && this.field367 == 0) {
			this.field372 = 0;
			this.field371 = 0;
			this.field365 = 0;
			this.remove();
		} else {
			int var2 = -this.field365;
			if (this.field365 > var2) {
				var2 = this.field365;
			}

			if (-this.field363 > var2) {
				var2 = -this.field363;
			}

			if (this.field363 > var2) {
				var2 = this.field363;
			}

			if (-this.field367 > var2) {
				var2 = -this.field367;
			}

			if (this.field367 > var2) {
				var2 = this.field367;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field372 = var1;
			this.field371 = Integer.MIN_VALUE;
			this.field373 = -this.field365 / var1;
			this.field374 = -this.field363 / var1;
			this.field375 = -this.field367 / var1;
		}
	}

	@ObfuscatedName("an")
	public synchronized void method901(int var1) {
		if (this.field370 < 0) {
			this.field370 = -var1;
		} else {
			this.field370 = var1;
		}

	}

	@ObfuscatedName("af")
	public synchronized int method902() {
		return this.field370 < 0 ? -this.field370 : this.field370;
	}

	@ObfuscatedName("ai")
	public boolean method903() {
		return this.field366 < 0 || this.field366 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("al")
	public boolean method1031() {
		return this.field372 != 0;
	}

	@ObfuscatedName("bd")
	int method910(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field372 > 0) {
				int var6 = var2 + this.field372;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field372 += var2;
				if (this.field370 == 256 && (this.field366 & 255) == 0) {
					if (class373.PcmPlayer_stereo) {
						var2 = method922(0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, this.field374, this.field375, 0, var6, var3, this);
					} else {
						var2 = method921(((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, this.field373, 0, var6, var3, this);
					}
				} else if (class373.PcmPlayer_stereo) {
					var2 = method945(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, this.field374, this.field375, 0, var6, var3, this, this.field370, var5);
				} else {
					var2 = method1041(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, this.field373, 0, var6, var3, this, this.field370, var5);
				}

				this.field372 -= var2;
				if (this.field372 != 0) {
					return var2;
				}

				if (!this.method912()) {
					continue;
				}

				return var4;
			}

			if (this.field370 == 256 && (this.field366 & 255) == 0) {
				if (class373.PcmPlayer_stereo) {
					return method904(0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, 0, var4, var3, this);
				}

				return method930(((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, 0, var4, var3, this);
			}

			if (class373.PcmPlayer_stereo) {
				return method960(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, 0, var4, var3, this, this.field370, var5);
			}

			return method973(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, 0, var4, var3, this, this.field370, var5);
		}
	}

	@ObfuscatedName("bb")
	int method996(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field372 > 0) {
				int var6 = var2 + this.field372;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field372 += var2;
				if (this.field370 == -256 && (this.field366 & 255) == 0) {
					if (class373.PcmPlayer_stereo) {
						var2 = method924(0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, this.field374, this.field375, 0, var6, var3, this);
					} else {
						var2 = method923(((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, this.field373, 0, var6, var3, this);
					}
				} else if (class373.PcmPlayer_stereo) {
					var2 = method928(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, this.field374, this.field375, 0, var6, var3, this, this.field370, var5);
				} else {
					var2 = method1020(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, this.field373, 0, var6, var3, this, this.field370, var5);
				}

				this.field372 -= var2;
				if (this.field372 != 0) {
					return var2;
				}

				if (!this.method912()) {
					continue;
				}

				return var4;
			}

			if (this.field370 == -256 && (this.field366 & 255) == 0) {
				if (class373.PcmPlayer_stereo) {
					return method980(0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, 0, var4, var3, this);
				}

				return method1048(((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, 0, var4, var3, this);
			}

			if (class373.PcmPlayer_stereo) {
				return method911(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field363, this.field367, 0, var4, var3, this, this.field370, var5);
			}

			return method966(0, 0, ((RawSound)super.sound).samples, var1, this.field366, var2, this.field365, 0, var4, var3, this, this.field370, var5);
		}
	}

	@ObfuscatedName("bc")
	boolean method912() {
		int var1 = this.field371;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method1042(var1, this.field369);
			var3 = method906(var1, this.field369);
		}

		if (var1 == this.field365 && var2 == this.field363 && var3 == this.field367) {
			if (this.field371 == Integer.MIN_VALUE) {
				this.field371 = 0;
				this.field367 = 0;
				this.field363 = 0;
				this.field365 = 0;
				this.remove();
				return true;
			} else {
				this.method888();
				return false;
			}
		} else {
			if (this.field365 < var1) {
				this.field373 = 1;
				this.field372 = var1 - this.field365;
			} else if (this.field365 > var1) {
				this.field373 = -1;
				this.field372 = this.field365 - var1;
			} else {
				this.field373 = 0;
			}

			if (this.field363 < var2) {
				this.field374 = 1;
				if (this.field372 == 0 || this.field372 > var2 - this.field363) {
					this.field372 = var2 - this.field363;
				}
			} else if (this.field363 > var2) {
				this.field374 = -1;
				if (this.field372 == 0 || this.field372 > this.field363 - var2) {
					this.field372 = this.field363 - var2;
				}
			} else {
				this.field374 = 0;
			}

			if (this.field367 < var3) {
				this.field375 = 1;
				if (this.field372 == 0 || this.field372 > var3 - this.field367) {
					this.field372 = var3 - this.field367;
				}
			} else if (this.field367 > var3) {
				this.field375 = -1;
				if (this.field372 == 0 || this.field372 > this.field367 - var3) {
					this.field372 = this.field367 - var3;
				}
			} else {
				this.field375 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("by")
	int vmethod1051() {
		int var1 = this.field365 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field366 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("aw")
	static int method1042(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ay")
	static int method906(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lbi;II)Lbt;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field314 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbi;III)Lbt;"
	)
	public static RawPcmStream method887(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbt;)I"
	)
	static int method930(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field366 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbt;)I"
	)
	static int method904(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field366 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbt;)I"
	)
	static int method1048(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field366 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbt;)I"
	)
	static int method980(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field366 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbt;II)I"
	)
	static int method973(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field366 = var4;
		return var5;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbt;II)I"
	)
	static int method960(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field366 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbt;II)I"
	)
	static int method966(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field366 = var4;
		return var5;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbt;II)I"
	)
	static int method911(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field366 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbt;)I"
	)
	static int method921(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field363 += var9.field374 * (var6 - var3);
		var9.field367 += var9.field375 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field365 = var4 >> 2;
		var9.field366 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbt;)I"
	)
	static int method922(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field365 += var12.field373 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field363 = var5 >> 2;
		var12.field367 = var6 >> 2;
		var12.field366 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbt;)I"
	)
	static int method923(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field363 += var9.field374 * (var6 - var3);
		var9.field367 += var9.field375 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field365 = var4 >> 2;
		var9.field366 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbt;)I"
	)
	static int method924(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field365 += var12.field373 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field363 = var5 >> 2;
		var12.field367 = var6 >> 2;
		var12.field366 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbt;II)I"
	)
	static int method1041(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field363 -= var11.field374 * var5;
		var11.field367 -= var11.field375 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field363 += var11.field374 * var5;
		var11.field367 += var11.field375 * var5;
		var11.field365 = var6;
		var11.field366 = var4;
		return var5;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbt;II)I"
	)
	static int method945(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field365 -= var5 * var13.field373;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field365 += var13.field373 * var5;
		var13.field363 = var6;
		var13.field367 = var7;
		var13.field366 = var4;
		return var5;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbt;II)I"
	)
	static int method1020(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field363 -= var11.field374 * var5;
		var11.field367 -= var11.field375 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field363 += var11.field374 * var5;
		var11.field367 += var11.field375 * var5;
		var11.field365 = var6;
		var11.field366 = var4;
		return var5;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbt;II)I"
	)
	static int method928(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field365 -= var5 * var13.field373;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field365 += var13.field373 * var5;
		var13.field363 = var6;
		var13.field367 = var7;
		var13.field366 = var4;
		return var5;
	}
}
