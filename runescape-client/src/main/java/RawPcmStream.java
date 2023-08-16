import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("au")
	int field365;
	@ObfuscatedName("ae")
	int field356;
	@ObfuscatedName("ao")
	int field357;
	@ObfuscatedName("at")
	int field358;
	@ObfuscatedName("ac")
	int field359;
	@ObfuscatedName("ai")
	int field367;
	@ObfuscatedName("az")
	int field361;
	@ObfuscatedName("ap")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("aa")
	@Export("start")
	int start;
	@ObfuscatedName("af")
	@Export("end")
	int end;
	@ObfuscatedName("ad")
	boolean field368;
	@ObfuscatedName("aq")
	int field366;
	@ObfuscatedName("al")
	int field355;
	@ObfuscatedName("an")
	int field360;
	@ObfuscatedName("ar")
	int field369;

	@ObfuscatedSignature(
		descriptor = "(Lbu;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field368 = var1.field283;
		this.field356 = var2;
		this.field357 = var3;
		this.field358 = var4;
		this.field365 = 0;
		this.method1007();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbu;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field368 = var1.field283;
		this.field356 = var2;
		this.field357 = var3;
		this.field358 = 8192;
		this.field365 = 0;
		this.method1007();
	}

	@ObfuscatedName("ac")
	void method1007() {
		this.field359 = this.field357;
		this.field367 = method945(this.field357, this.field358);
		this.field361 = method901(this.field357, this.field358);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "()Lbw;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ap")
	protected int vmethod5973() {
		return this.field357 == 0 && this.field366 == 0 ? 0 : 1;
	}

	@ObfuscatedName("aa")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field357 == 0 && this.field366 == 0) {
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
			if (this.field365 < 0) {
				if (this.field356 <= 0) {
					this.method946();
					this.remove();
					return;
				}

				this.field365 = 0;
			}

			if (this.field365 >= var7) {
				if (this.field356 >= 0) {
					this.method946();
					this.remove();
					return;
				}

				this.field365 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field368) {
					if (this.field356 < 0) {
						var9 = this.method928(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field365 >= var5) {
							return;
						}

						this.field365 = var5 + var5 - 1 - this.field365;
						this.field356 = -this.field356;
					}

					while (true) {
						var9 = this.method949(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field365 < var6) {
							return;
						}

						this.field365 = var6 + var6 - 1 - this.field365;
						this.field356 = -this.field356;
						var9 = this.method928(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field365 >= var5) {
							return;
						}

						this.field365 = var5 + var5 - 1 - this.field365;
						this.field356 = -this.field356;
					}
				} else if (this.field356 < 0) {
					while (true) {
						var9 = this.method928(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field365 >= var5) {
							return;
						}

						this.field365 = var6 - 1 - (var6 - 1 - this.field365) % var8;
					}
				} else {
					while (true) {
						var9 = this.method949(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field365 < var6) {
							return;
						}

						this.field365 = var5 + (this.field365 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field368) {
						label127: {
							if (this.field356 < 0) {
								var9 = this.method928(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field365 >= var5) {
									return;
								}

								this.field365 = var5 + var5 - 1 - this.field365;
								this.field356 = -this.field356;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method949(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field365 < var6) {
									return;
								}

								this.field365 = var6 + var6 - 1 - this.field365;
								this.field356 = -this.field356;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method928(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field365 >= var5) {
									return;
								}

								this.field365 = var5 + var5 - 1 - this.field365;
								this.field356 = -this.field356;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field356 < 0) {
							while (true) {
								var9 = this.method928(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field365 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field365) / var8;
								if (var10 >= this.numLoops) {
									this.field365 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field365 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method949(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field365 < var6) {
									return;
								}

								var10 = (this.field365 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field365 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field365 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field356 < 0) {
					this.method928(var1, var9, 0, var3, 0);
					if (this.field365 < 0) {
						this.field365 = -1;
						this.method946();
						this.remove();
					}
				} else {
					this.method949(var1, var9, var7, var3, 0);
					if (this.field365 >= var7) {
						this.field365 = var7;
						this.method946();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("af")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ad")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field366 > 0) {
			if (var1 >= this.field366) {
				if (this.field357 == Integer.MIN_VALUE) {
					this.field357 = 0;
					this.field361 = 0;
					this.field367 = 0;
					this.field359 = 0;
					this.remove();
					var1 = this.field366;
				}

				this.field366 = 0;
				this.method1007();
			} else {
				this.field359 += this.field355 * var1;
				this.field367 += this.field360 * var1;
				this.field361 += this.field369 * var1;
				this.field366 -= var1;
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

		if (this.field365 < 0) {
			if (this.field356 <= 0) {
				this.method946();
				this.remove();
				return;
			}

			this.field365 = 0;
		}

		if (this.field365 >= var5) {
			if (this.field356 >= 0) {
				this.method946();
				this.remove();
				return;
			}

			this.field365 = var5 - 1;
		}

		this.field365 += this.field356 * var1;
		if (this.numLoops < 0) {
			if (!this.field368) {
				if (this.field356 < 0) {
					if (this.field365 >= var3) {
						return;
					}

					this.field365 = var4 - 1 - (var4 - 1 - this.field365) % var6;
				} else {
					if (this.field365 < var4) {
						return;
					}

					this.field365 = var3 + (this.field365 - var3) % var6;
				}

			} else {
				if (this.field356 < 0) {
					if (this.field365 >= var3) {
						return;
					}

					this.field365 = var3 + var3 - 1 - this.field365;
					this.field356 = -this.field356;
				}

				while (this.field365 >= var4) {
					this.field365 = var4 + var4 - 1 - this.field365;
					this.field356 = -this.field356;
					if (this.field365 >= var3) {
						return;
					}

					this.field365 = var3 + var3 - 1 - this.field365;
					this.field356 = -this.field356;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field368) {
					label129: {
						if (this.field356 < 0) {
							if (this.field365 >= var3) {
								return;
							}

							this.field365 = var3 + var3 - 1 - this.field365;
							this.field356 = -this.field356;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field365 < var4) {
								return;
							}

							this.field365 = var4 + var4 - 1 - this.field365;
							this.field356 = -this.field356;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field365 >= var3) {
								return;
							}

							this.field365 = var3 + var3 - 1 - this.field365;
							this.field356 = -this.field356;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field356 < 0) {
							if (this.field365 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field365) / var6;
							if (var7 >= this.numLoops) {
								this.field365 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field365 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field365 < var4) {
								return;
							}

							var7 = (this.field365 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field365 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field365 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field356 < 0) {
				if (this.field365 < 0) {
					this.field365 = -1;
					this.method946();
					this.remove();
				}
			} else if (this.field365 >= var5) {
				this.field365 = var5;
				this.method946();
				this.remove();
			}

		}
	}

	@ObfuscatedName("aq")
	public synchronized void method907(int var1) {
		this.method909(var1 << 6, this.method911());
	}

	@ObfuscatedName("al")
	synchronized void method1039(int var1) {
		this.method909(var1, this.method911());
	}

	@ObfuscatedName("an")
	synchronized void method909(int var1, int var2) {
		this.field357 = var1;
		this.field358 = var2;
		this.field366 = 0;
		this.method1007();
	}

	@ObfuscatedName("ar")
	public synchronized int method910() {
		return this.field357 == Integer.MIN_VALUE ? 0 : this.field357;
	}

	@ObfuscatedName("ab")
	public synchronized int method911() {
		return this.field358 < 0 ? -1 : this.field358;
	}

	@ObfuscatedName("ag")
	public synchronized void method912(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field365 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method968() {
		this.field356 = (this.field356 ^ this.field356 >> 31) + (this.field356 >>> 31);
		this.field356 = -this.field356;
	}

	@ObfuscatedName("ax")
	void method946() {
		if (this.field366 != 0) {
			if (this.field357 == Integer.MIN_VALUE) {
				this.field357 = 0;
			}

			this.field366 = 0;
			this.method1007();
		}

	}

	@ObfuscatedName("ah")
	public synchronized void method952(int var1, int var2) {
		this.method925(var1, var2, this.method911());
	}

	@ObfuscatedName("as")
	public synchronized void method925(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method909(var2, var3);
		} else {
			int var4 = method945(var2, var3);
			int var5 = method901(var2, var3);
			if (var4 == this.field367 && var5 == this.field361) {
				this.field366 = 0;
			} else {
				int var6 = var2 - this.field359;
				if (this.field359 - var2 > var6) {
					var6 = this.field359 - var2;
				}

				if (var4 - this.field367 > var6) {
					var6 = var4 - this.field367;
				}

				if (this.field367 - var4 > var6) {
					var6 = this.field367 - var4;
				}

				if (var5 - this.field361 > var6) {
					var6 = var5 - this.field361;
				}

				if (this.field361 - var5 > var6) {
					var6 = this.field361 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field366 = var1;
				this.field357 = var2;
				this.field358 = var3;
				this.field355 = (var2 - this.field359) / var1;
				this.field360 = (var4 - this.field367) / var1;
				this.field369 = (var5 - this.field361) / var1;
			}
		}
	}

	@ObfuscatedName("ay")
	public synchronized void method917(int var1) {
		if (var1 == 0) {
			this.method1039(0);
			this.remove();
		} else if (this.field367 == 0 && this.field361 == 0) {
			this.field366 = 0;
			this.field357 = 0;
			this.field359 = 0;
			this.remove();
		} else {
			int var2 = -this.field359;
			if (this.field359 > var2) {
				var2 = this.field359;
			}

			if (-this.field367 > var2) {
				var2 = -this.field367;
			}

			if (this.field367 > var2) {
				var2 = this.field367;
			}

			if (-this.field361 > var2) {
				var2 = -this.field361;
			}

			if (this.field361 > var2) {
				var2 = this.field361;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field366 = var1;
			this.field357 = Integer.MIN_VALUE;
			this.field355 = -this.field359 / var1;
			this.field360 = -this.field367 / var1;
			this.field369 = -this.field361 / var1;
		}
	}

	@ObfuscatedName("aj")
	public synchronized void method918(int var1) {
		if (this.field356 < 0) {
			this.field356 = -var1;
		} else {
			this.field356 = var1;
		}

	}

	@ObfuscatedName("av")
	public synchronized int method919() {
		return this.field356 < 0 ? -this.field356 : this.field356;
	}

	@ObfuscatedName("aw")
	public boolean method920() {
		return this.field365 < 0 || this.field365 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ak")
	public boolean method921() {
		return this.field366 != 0;
	}

	@ObfuscatedName("bh")
	int method949(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field366 > 0) {
				int var6 = var2 + this.field366;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field366 += var2;
				if (this.field356 == 256 && (this.field365 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method939(0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, this.field360, this.field369, 0, var6, var3, this);
					} else {
						var2 = method938(((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, this.field355, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method943(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, this.field360, this.field369, 0, var6, var3, this, this.field356, var5);
				} else {
					var2 = method942(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, this.field355, 0, var6, var3, this, this.field356, var5);
				}

				this.field366 -= var2;
				if (this.field366 != 0) {
					return var2;
				}

				if (!this.method1000()) {
					continue;
				}

				return var4;
			}

			if (this.field356 == 256 && (this.field365 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method931(0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, 0, var4, var3, this);
				}

				return method903(((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method935(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, 0, var4, var3, this, this.field356, var5);
			}

			return method934(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, 0, var4, var3, this, this.field356, var5);
		}
	}

	@ObfuscatedName("bm")
	int method928(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field366 > 0) {
				int var6 = var2 + this.field366;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field366 += var2;
				if (this.field356 == -256 && (this.field365 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method941(0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, this.field360, this.field369, 0, var6, var3, this);
					} else {
						var2 = method940(((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, this.field355, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method992(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, this.field360, this.field369, 0, var6, var3, this, this.field356, var5);
				} else {
					var2 = method1008(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, this.field355, 0, var6, var3, this, this.field356, var5);
				}

				this.field366 -= var2;
				if (this.field366 != 0) {
					return var2;
				}

				if (!this.method1000()) {
					continue;
				}

				return var4;
			}

			if (this.field356 == -256 && (this.field365 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method1025(0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, 0, var4, var3, this);
				}

				return method932(((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method937(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field367, this.field361, 0, var4, var3, this, this.field356, var5);
			}

			return method915(0, 0, ((RawSound)super.sound).samples, var1, this.field365, var2, this.field359, 0, var4, var3, this, this.field356, var5);
		}
	}

	@ObfuscatedName("bf")
	boolean method1000() {
		int var1 = this.field357;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method945(var1, this.field358);
			var3 = method901(var1, this.field358);
		}

		if (var1 == this.field359 && var2 == this.field367 && var3 == this.field361) {
			if (this.field357 == Integer.MIN_VALUE) {
				this.field357 = 0;
				this.field361 = 0;
				this.field367 = 0;
				this.field359 = 0;
				this.remove();
				return true;
			} else {
				this.method1007();
				return false;
			}
		} else {
			if (this.field359 < var1) {
				this.field355 = 1;
				this.field366 = var1 - this.field359;
			} else if (this.field359 > var1) {
				this.field355 = -1;
				this.field366 = this.field359 - var1;
			} else {
				this.field355 = 0;
			}

			if (this.field367 < var2) {
				this.field360 = 1;
				if (this.field366 == 0 || this.field366 > var2 - this.field367) {
					this.field366 = var2 - this.field367;
				}
			} else if (this.field367 > var2) {
				this.field360 = -1;
				if (this.field366 == 0 || this.field366 > this.field367 - var2) {
					this.field366 = this.field367 - var2;
				}
			} else {
				this.field360 = 0;
			}

			if (this.field361 < var3) {
				this.field369 = 1;
				if (this.field366 == 0 || this.field366 > var3 - this.field361) {
					this.field366 = var3 - this.field361;
				}
			} else if (this.field361 > var3) {
				this.field369 = -1;
				if (this.field366 == 0 || this.field366 > this.field361 - var3) {
					this.field366 = this.field361 - var3;
				}
			} else {
				this.field369 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("br")
	int vmethod1041() {
		int var1 = this.field359 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field365 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("au")
	static int method945(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ae")
	static int method901(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lbu;II)Lbn;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field293 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbu;III)Lbn;"
	)
	public static RawPcmStream method904(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbn;)I"
	)
	static int method903(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbn;)I"
	)
	static int method931(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbn;)I"
	)
	static int method932(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbn;)I"
	)
	static int method1025(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbn;II)I"
	)
	static int method934(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field365 = var4;
		return var5;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbn;II)I"
	)
	static int method935(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field365 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbn;II)I"
	)
	static int method915(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field365 = var4;
		return var5;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbn;II)I"
	)
	static int method937(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field365 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbn;)I"
	)
	static int method938(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field367 += var9.field360 * (var6 - var3);
		var9.field361 += var9.field369 * (var6 - var3);

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

		var9.field359 = var4 >> 2;
		var9.field365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbn;)I"
	)
	static int method939(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field359 += var12.field355 * (var9 - var4);
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

		var12.field367 = var5 >> 2;
		var12.field361 = var6 >> 2;
		var12.field365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbn;)I"
	)
	static int method940(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field367 += var9.field360 * (var6 - var3);
		var9.field361 += var9.field369 * (var6 - var3);

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

		var9.field359 = var4 >> 2;
		var9.field365 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbn;)I"
	)
	static int method941(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field359 += var12.field355 * (var9 - var4);
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

		var12.field367 = var5 >> 2;
		var12.field361 = var6 >> 2;
		var12.field365 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbn;II)I"
	)
	static int method942(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field367 -= var11.field360 * var5;
		var11.field361 -= var11.field369 * var5;
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

		var11.field367 += var11.field360 * var5;
		var11.field361 += var11.field369 * var5;
		var11.field359 = var6;
		var11.field365 = var4;
		return var5;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbn;II)I"
	)
	static int method943(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field359 -= var5 * var13.field355;
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
		var13.field359 += var13.field355 * var5;
		var13.field367 = var6;
		var13.field361 = var7;
		var13.field365 = var4;
		return var5;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbn;II)I"
	)
	static int method1008(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field367 -= var11.field360 * var5;
		var11.field361 -= var11.field369 * var5;
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

		var11.field367 += var11.field360 * var5;
		var11.field361 += var11.field369 * var5;
		var11.field359 = var6;
		var11.field365 = var4;
		return var5;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbn;II)I"
	)
	static int method992(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field359 -= var5 * var13.field355;
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
		var13.field359 += var13.field355 * var5;
		var13.field367 = var6;
		var13.field361 = var7;
		var13.field365 = var4;
		return var5;
	}
}
