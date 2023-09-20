import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ac")
	int field350;
	@ObfuscatedName("al")
	int field351;
	@ObfuscatedName("ak")
	int field361;
	@ObfuscatedName("ax")
	int field353;
	@ObfuscatedName("ao")
	int field354;
	@ObfuscatedName("ah")
	int field355;
	@ObfuscatedName("ar")
	int field356;
	@ObfuscatedName("ab")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("am")
	@Export("start")
	int start;
	@ObfuscatedName("av")
	@Export("end")
	int end;
	@ObfuscatedName("ag")
	boolean field360;
	@ObfuscatedName("aa")
	int field359;
	@ObfuscatedName("ap")
	int field362;
	@ObfuscatedName("ay")
	int field363;
	@ObfuscatedName("as")
	int field364;

	@ObfuscatedSignature(
		descriptor = "(Lbs;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field360 = var1.field279;
		this.field351 = var2;
		this.field361 = var3;
		this.field353 = var4;
		this.field350 = 0;
		this.method878();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbs;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field360 = var1.field279;
		this.field351 = var2;
		this.field361 = var3;
		this.field353 = 8192;
		this.field350 = 0;
		this.method878();
	}

	@ObfuscatedName("ao")
	void method878() {
		this.field354 = this.field361;
		this.field355 = method1011(this.field361, this.field353);
		this.field356 = method1017(this.field361, this.field353);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "()Lbi;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ab")
	protected int vmethod6188() {
		return this.field361 == 0 && this.field359 == 0 ? 0 : 1;
	}

	@ObfuscatedName("am")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field361 == 0 && this.field359 == 0) {
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
			if (this.field350 < 0) {
				if (this.field351 <= 0) {
					this.method902();
					this.remove();
					return;
				}

				this.field350 = 0;
			}

			if (this.field350 >= var7) {
				if (this.field351 >= 0) {
					this.method902();
					this.remove();
					return;
				}

				this.field350 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field360) {
					if (this.field351 < 0) {
						var9 = this.method1023(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field350 >= var5) {
							return;
						}

						this.field350 = var5 + var5 - 1 - this.field350;
						this.field351 = -this.field351;
					}

					while (true) {
						var9 = this.method980(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field350 < var6) {
							return;
						}

						this.field350 = var6 + var6 - 1 - this.field350;
						this.field351 = -this.field351;
						var9 = this.method1023(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field350 >= var5) {
							return;
						}

						this.field350 = var5 + var5 - 1 - this.field350;
						this.field351 = -this.field351;
					}
				} else if (this.field351 < 0) {
					while (true) {
						var9 = this.method1023(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field350 >= var5) {
							return;
						}

						this.field350 = var6 - 1 - (var6 - 1 - this.field350) % var8;
					}
				} else {
					while (true) {
						var9 = this.method980(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field350 < var6) {
							return;
						}

						this.field350 = var5 + (this.field350 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field360) {
						label127: {
							if (this.field351 < 0) {
								var9 = this.method1023(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field350 >= var5) {
									return;
								}

								this.field350 = var5 + var5 - 1 - this.field350;
								this.field351 = -this.field351;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method980(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field350 < var6) {
									return;
								}

								this.field350 = var6 + var6 - 1 - this.field350;
								this.field351 = -this.field351;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method1023(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field350 >= var5) {
									return;
								}

								this.field350 = var5 + var5 - 1 - this.field350;
								this.field351 = -this.field351;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field351 < 0) {
							while (true) {
								var9 = this.method1023(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field350 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field350) / var8;
								if (var10 >= this.numLoops) {
									this.field350 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field350 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method980(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field350 < var6) {
									return;
								}

								var10 = (this.field350 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field350 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field350 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field351 < 0) {
					this.method1023(var1, var9, 0, var3, 0);
					if (this.field350 < 0) {
						this.field350 = -1;
						this.method902();
						this.remove();
					}
				} else {
					this.method980(var1, var9, var7, var3, 0);
					if (this.field350 >= var7) {
						this.field350 = var7;
						this.method902();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("av")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ag")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field359 > 0) {
			if (var1 >= this.field359) {
				if (this.field361 == Integer.MIN_VALUE) {
					this.field361 = 0;
					this.field356 = 0;
					this.field355 = 0;
					this.field354 = 0;
					this.remove();
					var1 = this.field359;
				}

				this.field359 = 0;
				this.method878();
			} else {
				this.field354 += this.field362 * var1;
				this.field355 += this.field363 * var1;
				this.field356 += this.field364 * var1;
				this.field359 -= var1;
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

		if (this.field350 < 0) {
			if (this.field351 <= 0) {
				this.method902();
				this.remove();
				return;
			}

			this.field350 = 0;
		}

		if (this.field350 >= var5) {
			if (this.field351 >= 0) {
				this.method902();
				this.remove();
				return;
			}

			this.field350 = var5 - 1;
		}

		this.field350 += this.field351 * var1;
		if (this.numLoops < 0) {
			if (!this.field360) {
				if (this.field351 < 0) {
					if (this.field350 >= var3) {
						return;
					}

					this.field350 = var4 - 1 - (var4 - 1 - this.field350) % var6;
				} else {
					if (this.field350 < var4) {
						return;
					}

					this.field350 = var3 + (this.field350 - var3) % var6;
				}

			} else {
				if (this.field351 < 0) {
					if (this.field350 >= var3) {
						return;
					}

					this.field350 = var3 + var3 - 1 - this.field350;
					this.field351 = -this.field351;
				}

				while (this.field350 >= var4) {
					this.field350 = var4 + var4 - 1 - this.field350;
					this.field351 = -this.field351;
					if (this.field350 >= var3) {
						return;
					}

					this.field350 = var3 + var3 - 1 - this.field350;
					this.field351 = -this.field351;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field360) {
					label129: {
						if (this.field351 < 0) {
							if (this.field350 >= var3) {
								return;
							}

							this.field350 = var3 + var3 - 1 - this.field350;
							this.field351 = -this.field351;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field350 < var4) {
								return;
							}

							this.field350 = var4 + var4 - 1 - this.field350;
							this.field351 = -this.field351;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field350 >= var3) {
								return;
							}

							this.field350 = var3 + var3 - 1 - this.field350;
							this.field351 = -this.field351;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field351 < 0) {
							if (this.field350 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field350) / var6;
							if (var7 >= this.numLoops) {
								this.field350 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field350 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field350 < var4) {
								return;
							}

							var7 = (this.field350 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field350 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field350 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field351 < 0) {
				if (this.field350 < 0) {
					this.field350 = -1;
					this.method902();
					this.remove();
				}
			} else if (this.field350 >= var5) {
				this.field350 = var5;
				this.method902();
				this.remove();
			}

		}
	}

	@ObfuscatedName("aa")
	public synchronized void method880(int var1) {
		this.method1012(var1 << 6, this.method923());
	}

	@ObfuscatedName("ap")
	synchronized void method881(int var1) {
		this.method1012(var1, this.method923());
	}

	@ObfuscatedName("ay")
	synchronized void method1012(int var1, int var2) {
		this.field361 = var1;
		this.field353 = var2;
		this.field359 = 0;
		this.method878();
	}

	@ObfuscatedName("as")
	public synchronized int method883() {
		return this.field361 == Integer.MIN_VALUE ? 0 : this.field361;
	}

	@ObfuscatedName("aj")
	public synchronized int method923() {
		return this.field353 < 0 ? -1 : this.field353;
	}

	@ObfuscatedName("an")
	public synchronized void method885(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field350 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method886() {
		this.field351 = (this.field351 ^ this.field351 >> 31) + (this.field351 >>> 31);
		this.field351 = -this.field351;
	}

	@ObfuscatedName("ai")
	void method902() {
		if (this.field359 != 0) {
			if (this.field361 == Integer.MIN_VALUE) {
				this.field361 = 0;
			}

			this.field359 = 0;
			this.method878();
		}

	}

	@ObfuscatedName("ae")
	public synchronized void method888(int var1, int var2) {
		this.method889(var1, var2, this.method923());
	}

	@ObfuscatedName("aw")
	public synchronized void method889(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method1012(var2, var3);
		} else {
			int var4 = method1011(var2, var3);
			int var5 = method1017(var2, var3);
			if (var4 == this.field355 && var5 == this.field356) {
				this.field359 = 0;
			} else {
				int var6 = var2 - this.field354;
				if (this.field354 - var2 > var6) {
					var6 = this.field354 - var2;
				}

				if (var4 - this.field355 > var6) {
					var6 = var4 - this.field355;
				}

				if (this.field355 - var4 > var6) {
					var6 = this.field355 - var4;
				}

				if (var5 - this.field356 > var6) {
					var6 = var5 - this.field356;
				}

				if (this.field356 - var5 > var6) {
					var6 = this.field356 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field359 = var1;
				this.field361 = var2;
				this.field353 = var3;
				this.field362 = (var2 - this.field354) / var1;
				this.field363 = (var4 - this.field355) / var1;
				this.field364 = (var5 - this.field356) / var1;
			}
		}
	}

	@ObfuscatedName("aq")
	public synchronized void method890(int var1) {
		if (var1 == 0) {
			this.method881(0);
			this.remove();
		} else if (this.field355 == 0 && this.field356 == 0) {
			this.field359 = 0;
			this.field361 = 0;
			this.field354 = 0;
			this.remove();
		} else {
			int var2 = -this.field354;
			if (this.field354 > var2) {
				var2 = this.field354;
			}

			if (-this.field355 > var2) {
				var2 = -this.field355;
			}

			if (this.field355 > var2) {
				var2 = this.field355;
			}

			if (-this.field356 > var2) {
				var2 = -this.field356;
			}

			if (this.field356 > var2) {
				var2 = this.field356;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field359 = var1;
			this.field361 = Integer.MIN_VALUE;
			this.field362 = -this.field354 / var1;
			this.field363 = -this.field355 / var1;
			this.field364 = -this.field356 / var1;
		}
	}

	@ObfuscatedName("bb")
	public synchronized void method891(int var1) {
		if (this.field351 < 0) {
			this.field351 = -var1;
		} else {
			this.field351 = var1;
		}

	}

	@ObfuscatedName("bo")
	public synchronized int method892() {
		return this.field351 < 0 ? -this.field351 : this.field351;
	}

	@ObfuscatedName("bp")
	public boolean method893() {
		return this.field350 < 0 || this.field350 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bm")
	public boolean method904() {
		return this.field359 != 0;
	}

	@ObfuscatedName("br")
	int method980(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field359 > 0) {
				int var6 = var2 + this.field359;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field359 += var2;
				if (this.field351 == 256 && (this.field350 & 255) == 0) {
					if (class306.PcmPlayer_stereo) {
						var2 = method912(0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, this.field363, this.field364, 0, var6, var3, this);
					} else {
						var2 = method941(((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, this.field362, 0, var6, var3, this);
					}
				} else if (class306.PcmPlayer_stereo) {
					var2 = method993(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, this.field363, this.field364, 0, var6, var3, this, this.field351, var5);
				} else {
					var2 = method931(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, this.field362, 0, var6, var3, this, this.field351, var5);
				}

				this.field359 -= var2;
				if (this.field359 != 0) {
					return var2;
				}

				if (!this.method882()) {
					continue;
				}

				return var4;
			}

			if (this.field351 == 256 && (this.field350 & 255) == 0) {
				if (class306.PcmPlayer_stereo) {
					return method1034(0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, 0, var4, var3, this);
				}

				return method903(((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, 0, var4, var3, this);
			}

			if (class306.PcmPlayer_stereo) {
				return method951(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, 0, var4, var3, this, this.field351, var5);
			}

			return method907(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, 0, var4, var3, this, this.field351, var5);
		}
	}

	@ObfuscatedName("bs")
	int vmethod1038() {
		int var1 = this.field354 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field350 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bc")
	int method1023(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field359 > 0) {
				int var6 = var2 + this.field359;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field359 += var2;
				if (this.field351 == -256 && (this.field350 & 255) == 0) {
					if (class306.PcmPlayer_stereo) {
						var2 = method914(0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, this.field363, this.field364, 0, var6, var3, this);
					} else {
						var2 = method924(((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, this.field362, 0, var6, var3, this);
					}
				} else if (class306.PcmPlayer_stereo) {
					var2 = method873(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, this.field363, this.field364, 0, var6, var3, this, this.field351, var5);
				} else {
					var2 = method981(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, this.field362, 0, var6, var3, this, this.field351, var5);
				}

				this.field359 -= var2;
				if (this.field359 != 0) {
					return var2;
				}

				if (!this.method882()) {
					continue;
				}

				return var4;
			}

			if (this.field351 == -256 && (this.field350 & 255) == 0) {
				if (class306.PcmPlayer_stereo) {
					return method956(0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, 0, var4, var3, this);
				}

				return method905(((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, 0, var4, var3, this);
			}

			if (class306.PcmPlayer_stereo) {
				return method910(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field355, this.field356, 0, var4, var3, this, this.field351, var5);
			}

			return method909(0, 0, ((RawSound)super.sound).samples, var1, this.field350, var2, this.field354, 0, var4, var3, this, this.field351, var5);
		}
	}

	@ObfuscatedName("bu")
	boolean method882() {
		int var1 = this.field361;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method1011(var1, this.field353);
			var3 = method1017(var1, this.field353);
		}

		if (var1 == this.field354 && var2 == this.field355 && var3 == this.field356) {
			if (this.field361 == Integer.MIN_VALUE) {
				this.field361 = 0;
				this.field356 = 0;
				this.field355 = 0;
				this.field354 = 0;
				this.remove();
				return true;
			} else {
				this.method878();
				return false;
			}
		} else {
			if (this.field354 < var1) {
				this.field362 = 1;
				this.field359 = var1 - this.field354;
			} else if (this.field354 > var1) {
				this.field362 = -1;
				this.field359 = this.field354 - var1;
			} else {
				this.field362 = 0;
			}

			if (this.field355 < var2) {
				this.field363 = 1;
				if (this.field359 == 0 || this.field359 > var2 - this.field355) {
					this.field359 = var2 - this.field355;
				}
			} else if (this.field355 > var2) {
				this.field363 = -1;
				if (this.field359 == 0 || this.field359 > this.field355 - var2) {
					this.field359 = this.field355 - var2;
				}
			} else {
				this.field363 = 0;
			}

			if (this.field356 < var3) {
				this.field364 = 1;
				if (this.field359 == 0 || this.field359 > var3 - this.field356) {
					this.field359 = var3 - this.field356;
				}
			} else if (this.field356 > var3) {
				this.field364 = -1;
				if (this.field359 == 0 || this.field359 > this.field356 - var3) {
					this.field359 = this.field356 - var3;
				}
			} else {
				this.field364 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ac")
	static int method1011(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("al")
	static int method1017(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lbs;II)Lbx;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field306 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lbs;III)Lbx;"
	)
	public static RawPcmStream method942(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbx;)I"
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

		var8.field350 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbx;)I"
	)
	static int method1034(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field350 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbx;)I"
	)
	static int method905(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field350 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbx;)I"
	)
	static int method956(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field350 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbx;II)I"
	)
	static int method907(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field350 = var4;
		return var5;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbx;II)I"
	)
	static int method951(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field350 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbx;II)I"
	)
	static int method909(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field350 = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbx;II)I"
	)
	static int method910(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field350 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbx;)I"
	)
	static int method941(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field355 += var9.field363 * (var6 - var3);
		var9.field356 += var9.field364 * (var6 - var3);

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

		var9.field354 = var4 >> 2;
		var9.field350 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbx;)I"
	)
	static int method912(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field354 += var12.field362 * (var9 - var4);
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

		var12.field355 = var5 >> 2;
		var12.field356 = var6 >> 2;
		var12.field350 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbx;)I"
	)
	static int method924(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field355 += var9.field363 * (var6 - var3);
		var9.field356 += var9.field364 * (var6 - var3);

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

		var9.field354 = var4 >> 2;
		var9.field350 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbx;)I"
	)
	static int method914(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field354 += var12.field362 * (var9 - var4);
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

		var12.field355 = var5 >> 2;
		var12.field356 = var6 >> 2;
		var12.field350 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbx;II)I"
	)
	static int method931(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field355 -= var11.field363 * var5;
		var11.field356 -= var11.field364 * var5;
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

		var11.field355 += var11.field363 * var5;
		var11.field356 += var11.field364 * var5;
		var11.field354 = var6;
		var11.field350 = var4;
		return var5;
	}

	@ObfuscatedName("cc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbx;II)I"
	)
	static int method993(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field354 -= var5 * var13.field362;
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
		var13.field354 += var13.field362 * var5;
		var13.field355 = var6;
		var13.field356 = var7;
		var13.field350 = var4;
		return var5;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbx;II)I"
	)
	static int method981(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field355 -= var11.field363 * var5;
		var11.field356 -= var11.field364 * var5;
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

		var11.field355 += var11.field363 * var5;
		var11.field356 += var11.field364 * var5;
		var11.field354 = var6;
		var11.field350 = var4;
		return var5;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbx;II)I"
	)
	static int method873(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field354 -= var5 * var13.field362;
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
		var13.field354 += var13.field362 * var5;
		var13.field355 = var6;
		var13.field356 = var7;
		var13.field350 = var4;
		return var5;
	}
}
