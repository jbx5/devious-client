import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("aq")
	int field321;
	@ObfuscatedName("ad")
	int field316;
	@ObfuscatedName("ag")
	int field317;
	@ObfuscatedName("ak")
	int field318;
	@ObfuscatedName("ap")
	int field319;
	@ObfuscatedName("an")
	int field320;
	@ObfuscatedName("aj")
	int field325;
	@ObfuscatedName("av")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ab")
	@Export("start")
	int start;
	@ObfuscatedName("ai")
	@Export("end")
	int end;
	@ObfuscatedName("ae")
	boolean field315;
	@ObfuscatedName("au")
	int field326;
	@ObfuscatedName("ah")
	int field327;
	@ObfuscatedName("az")
	int field324;
	@ObfuscatedName("ax")
	int field328;

	@ObfuscatedSignature(
		descriptor = "(Lbl;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field315 = var1.field251;
		this.field316 = var2;
		this.field317 = var3;
		this.field318 = var4;
		this.field321 = 0;
		this.method909();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbl;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field315 = var1.field251;
		this.field316 = var2;
		this.field317 = var3;
		this.field318 = 8192;
		this.field321 = 0;
		this.method909();
	}

	@ObfuscatedName("ap")
	void method909() {
		this.field319 = this.field317;
		this.field320 = method925(this.field317, this.field318);
		this.field325 = method1016(this.field317, this.field318);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("av")
	protected int vmethod6390() {
		return this.field317 == 0 && this.field326 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ab")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field317 == 0 && this.field326 == 0) {
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
			if (this.field321 < 0) {
				if (this.field316 <= 0) {
					this.method918();
					this.remove();
					return;
				}

				this.field321 = 0;
			}

			if (this.field321 >= var7) {
				if (this.field316 >= 0) {
					this.method918();
					this.remove();
					return;
				}

				this.field321 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field315) {
					if (this.field316 < 0) {
						var9 = this.method944(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field321 >= var5) {
							return;
						}

						this.field321 = var5 + var5 - 1 - this.field321;
						this.field316 = -this.field316;
					}

					while (true) {
						var9 = this.method960(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field321 < var6) {
							return;
						}

						this.field321 = var6 + var6 - 1 - this.field321;
						this.field316 = -this.field316;
						var9 = this.method944(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field321 >= var5) {
							return;
						}

						this.field321 = var5 + var5 - 1 - this.field321;
						this.field316 = -this.field316;
					}
				} else if (this.field316 < 0) {
					while (true) {
						var9 = this.method944(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field321 >= var5) {
							return;
						}

						this.field321 = var6 - 1 - (var6 - 1 - this.field321) % var8;
					}
				} else {
					while (true) {
						var9 = this.method960(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field321 < var6) {
							return;
						}

						this.field321 = var5 + (this.field321 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field315) {
						label127: {
							if (this.field316 < 0) {
								var9 = this.method944(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field321 >= var5) {
									return;
								}

								this.field321 = var5 + var5 - 1 - this.field321;
								this.field316 = -this.field316;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method960(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field321 < var6) {
									return;
								}

								this.field321 = var6 + var6 - 1 - this.field321;
								this.field316 = -this.field316;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method944(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field321 >= var5) {
									return;
								}

								this.field321 = var5 + var5 - 1 - this.field321;
								this.field316 = -this.field316;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field316 < 0) {
							while (true) {
								var9 = this.method944(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field321 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field321) / var8;
								if (var10 >= this.numLoops) {
									this.field321 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field321 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method960(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field321 < var6) {
									return;
								}

								var10 = (this.field321 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field321 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field321 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field316 < 0) {
					this.method944(var1, var9, 0, var3, 0);
					if (this.field321 < 0) {
						this.field321 = -1;
						this.method918();
						this.remove();
					}
				} else {
					this.method960(var1, var9, var7, var3, 0);
					if (this.field321 >= var7) {
						this.field321 = var7;
						this.method918();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ai")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ae")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field326 > 0) {
			if (var1 >= this.field326) {
				if (this.field317 == Integer.MIN_VALUE) {
					this.field317 = 0;
					this.field325 = 0;
					this.field320 = 0;
					this.field319 = 0;
					this.remove();
					var1 = this.field326;
				}

				this.field326 = 0;
				this.method909();
			} else {
				this.field319 += this.field327 * var1;
				this.field320 += this.field324 * var1;
				this.field325 += this.field328 * var1;
				this.field326 -= var1;
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

		if (this.field321 < 0) {
			if (this.field316 <= 0) {
				this.method918();
				this.remove();
				return;
			}

			this.field321 = 0;
		}

		if (this.field321 >= var5) {
			if (this.field316 >= 0) {
				this.method918();
				this.remove();
				return;
			}

			this.field321 = var5 - 1;
		}

		this.field321 += this.field316 * var1;
		if (this.numLoops < 0) {
			if (!this.field315) {
				if (this.field316 < 0) {
					if (this.field321 >= var3) {
						return;
					}

					this.field321 = var4 - 1 - (var4 - 1 - this.field321) % var6;
				} else {
					if (this.field321 < var4) {
						return;
					}

					this.field321 = var3 + (this.field321 - var3) % var6;
				}

			} else {
				if (this.field316 < 0) {
					if (this.field321 >= var3) {
						return;
					}

					this.field321 = var3 + var3 - 1 - this.field321;
					this.field316 = -this.field316;
				}

				while (this.field321 >= var4) {
					this.field321 = var4 + var4 - 1 - this.field321;
					this.field316 = -this.field316;
					if (this.field321 >= var3) {
						return;
					}

					this.field321 = var3 + var3 - 1 - this.field321;
					this.field316 = -this.field316;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field315) {
					label129: {
						if (this.field316 < 0) {
							if (this.field321 >= var3) {
								return;
							}

							this.field321 = var3 + var3 - 1 - this.field321;
							this.field316 = -this.field316;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field321 < var4) {
								return;
							}

							this.field321 = var4 + var4 - 1 - this.field321;
							this.field316 = -this.field316;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field321 >= var3) {
								return;
							}

							this.field321 = var3 + var3 - 1 - this.field321;
							this.field316 = -this.field316;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field316 < 0) {
							if (this.field321 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field321) / var6;
							if (var7 >= this.numLoops) {
								this.field321 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field321 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field321 < var4) {
								return;
							}

							var7 = (this.field321 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field321 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field321 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field316 < 0) {
				if (this.field321 < 0) {
					this.field321 = -1;
					this.method918();
					this.remove();
				}
			} else if (this.field321 >= var5) {
				this.field321 = var5;
				this.method918();
				this.remove();
			}

		}
	}

	@ObfuscatedName("au")
	public synchronized void method911(int var1) {
		this.method1008(var1 << 6, this.method1010());
	}

	@ObfuscatedName("ah")
	synchronized void method912(int var1) {
		this.method1008(var1, this.method1010());
	}

	@ObfuscatedName("az")
	synchronized void method1008(int var1, int var2) {
		this.field317 = var1;
		this.field318 = var2;
		this.field326 = 0;
		this.method909();
	}

	@ObfuscatedName("ax")
	public synchronized int method914() {
		return this.field317 == Integer.MIN_VALUE ? 0 : this.field317;
	}

	@ObfuscatedName("ac")
	public synchronized int method1010() {
		return this.field318 < 0 ? -1 : this.field318;
	}

	@ObfuscatedName("al")
	public synchronized void method1007(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field321 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method983() {
		this.field316 = (this.field316 ^ this.field316 >> 31) + (this.field316 >>> 31);
		this.field316 = -this.field316;
	}

	@ObfuscatedName("ao")
	void method918() {
		if (this.field326 != 0) {
			if (this.field317 == Integer.MIN_VALUE) {
				this.field317 = 0;
			}

			this.field326 = 0;
			this.method909();
		}

	}

	@ObfuscatedName("aa")
	public synchronized void method919(int var1, int var2) {
		this.method920(var1, var2, this.method1010());
	}

	@ObfuscatedName("as")
	public synchronized void method920(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method1008(var2, var3);
		} else {
			int var4 = method925(var2, var3);
			int var5 = method1016(var2, var3);
			if (var4 == this.field320 && var5 == this.field325) {
				this.field326 = 0;
			} else {
				int var6 = var2 - this.field319;
				if (this.field319 - var2 > var6) {
					var6 = this.field319 - var2;
				}

				if (var4 - this.field320 > var6) {
					var6 = var4 - this.field320;
				}

				if (this.field320 - var4 > var6) {
					var6 = this.field320 - var4;
				}

				if (var5 - this.field325 > var6) {
					var6 = var5 - this.field325;
				}

				if (this.field325 - var5 > var6) {
					var6 = this.field325 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field326 = var1;
				this.field317 = var2;
				this.field318 = var3;
				this.field327 = (var2 - this.field319) / var1;
				this.field324 = (var4 - this.field320) / var1;
				this.field328 = (var5 - this.field325) / var1;
			}
		}
	}

	@ObfuscatedName("aw")
	public synchronized void method921(int var1) {
		if (var1 == 0) {
			this.method912(0);
			this.remove();
		} else if (this.field320 == 0 && this.field325 == 0) {
			this.field326 = 0;
			this.field317 = 0;
			this.field319 = 0;
			this.remove();
		} else {
			int var2 = -this.field319;
			if (this.field319 > var2) {
				var2 = this.field319;
			}

			if (-this.field320 > var2) {
				var2 = -this.field320;
			}

			if (this.field320 > var2) {
				var2 = this.field320;
			}

			if (-this.field325 > var2) {
				var2 = -this.field325;
			}

			if (this.field325 > var2) {
				var2 = this.field325;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field326 = var1;
			this.field317 = Integer.MIN_VALUE;
			this.field327 = -this.field319 / var1;
			this.field324 = -this.field320 / var1;
			this.field328 = -this.field325 / var1;
		}
	}

	@ObfuscatedName("at")
	public synchronized void method922(int var1) {
		if (this.field316 < 0) {
			this.field316 = -var1;
		} else {
			this.field316 = var1;
		}

	}

	@ObfuscatedName("af")
	public synchronized int method923() {
		return this.field316 < 0 ? -this.field316 : this.field316;
	}

	@ObfuscatedName("bx")
	public boolean method924() {
		return this.field321 < 0 || this.field321 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bu")
	public boolean method916() {
		return this.field326 != 0;
	}

	@ObfuscatedName("by")
	int method960(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field326 > 0) {
				int var6 = var2 + this.field326;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field326 += var2;
				if (this.field316 == 256 && (this.field321 & 255) == 0) {
					if (SecureRandomFuture.PcmPlayer_stereo) {
						var2 = method943(0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, this.field324, this.field328, 0, var6, var3, this);
					} else {
						var2 = method942(((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, this.field327, 0, var6, var3, this);
					}
				} else if (SecureRandomFuture.PcmPlayer_stereo) {
					var2 = method947(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, this.field324, this.field328, 0, var6, var3, this, this.field316, var5);
				} else {
					var2 = method946(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, this.field327, 0, var6, var3, this, this.field316, var5);
				}

				this.field326 -= var2;
				if (this.field326 != 0) {
					return var2;
				}

				if (!this.method933()) {
					continue;
				}

				return var4;
			}

			if (this.field316 == 256 && (this.field321 & 255) == 0) {
				if (SecureRandomFuture.PcmPlayer_stereo) {
					return method935(0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, 0, var4, var3, this);
				}

				return method982(((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, 0, var4, var3, this);
			}

			if (SecureRandomFuture.PcmPlayer_stereo) {
				return method974(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, 0, var4, var3, this, this.field316, var5);
			}

			return method938(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, 0, var4, var3, this, this.field316, var5);
		}
	}

	@ObfuscatedName("bc")
	int method944(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field326 > 0) {
				int var6 = var2 + this.field326;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field326 += var2;
				if (this.field316 == -256 && (this.field321 & 255) == 0) {
					if (SecureRandomFuture.PcmPlayer_stereo) {
						var2 = method945(0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, this.field324, this.field328, 0, var6, var3, this);
					} else {
						var2 = method981(((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, this.field327, 0, var6, var3, this);
					}
				} else if (SecureRandomFuture.PcmPlayer_stereo) {
					var2 = method949(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, this.field324, this.field328, 0, var6, var3, this, this.field316, var5);
				} else {
					var2 = method948(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, this.field327, 0, var6, var3, this, this.field316, var5);
				}

				this.field326 -= var2;
				if (this.field326 != 0) {
					return var2;
				}

				if (!this.method933()) {
					continue;
				}

				return var4;
			}

			if (this.field316 == -256 && (this.field321 & 255) == 0) {
				if (SecureRandomFuture.PcmPlayer_stereo) {
					return method950(0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, 0, var4, var3, this);
				}

				return method936(((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, 0, var4, var3, this);
			}

			if (SecureRandomFuture.PcmPlayer_stereo) {
				return method955(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field320, this.field325, 0, var4, var3, this, this.field316, var5);
			}

			return method940(0, 0, ((RawSound)super.sound).samples, var1, this.field321, var2, this.field319, 0, var4, var3, this, this.field316, var5);
		}
	}

	@ObfuscatedName("bv")
	int vmethod1052() {
		int var1 = this.field319 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field321 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bb")
	boolean method933() {
		int var1 = this.field317;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method925(var1, this.field318);
			var3 = method1016(var1, this.field318);
		}

		if (var1 == this.field319 && var2 == this.field320 && var3 == this.field325) {
			if (this.field317 == Integer.MIN_VALUE) {
				this.field317 = 0;
				this.field325 = 0;
				this.field320 = 0;
				this.field319 = 0;
				this.remove();
				return true;
			} else {
				this.method909();
				return false;
			}
		} else {
			if (this.field319 < var1) {
				this.field327 = 1;
				this.field326 = var1 - this.field319;
			} else if (this.field319 > var1) {
				this.field327 = -1;
				this.field326 = this.field319 - var1;
			} else {
				this.field327 = 0;
			}

			if (this.field320 < var2) {
				this.field324 = 1;
				if (this.field326 == 0 || this.field326 > var2 - this.field320) {
					this.field326 = var2 - this.field320;
				}
			} else if (this.field320 > var2) {
				this.field324 = -1;
				if (this.field326 == 0 || this.field326 > this.field320 - var2) {
					this.field326 = this.field320 - var2;
				}
			} else {
				this.field324 = 0;
			}

			if (this.field325 < var3) {
				this.field328 = 1;
				if (this.field326 == 0 || this.field326 > var3 - this.field325) {
					this.field326 = var3 - this.field325;
				}
			} else if (this.field325 > var3) {
				this.field328 = -1;
				if (this.field326 == 0 || this.field326 > this.field325 - var3) {
					this.field326 = this.field325 - var3;
				}
			} else {
				this.field328 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("aq")
	static int method925(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ad")
	static int method1016(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbl;II)Lbz;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field263 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lbl;III)Lbz;"
	)
	public static RawPcmStream method908(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbz;)I"
	)
	static int method982(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field321 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbz;)I"
	)
	static int method935(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field321 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbz;)I"
	)
	static int method936(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field321 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbz;)I"
	)
	static int method950(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field321 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbz;II)I"
	)
	static int method938(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field321 = var4;
		return var5;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method974(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field321 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbz;II)I"
	)
	static int method940(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field321 = var4;
		return var5;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method955(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field321 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbz;)I"
	)
	static int method942(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field320 += var9.field324 * (var6 - var3);
		var9.field325 += var9.field328 * (var6 - var3);

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

		var9.field319 = var4 >> 2;
		var9.field321 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbz;)I"
	)
	static int method943(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field319 += var12.field327 * (var9 - var4);
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

		var12.field320 = var5 >> 2;
		var12.field325 = var6 >> 2;
		var12.field321 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbz;)I"
	)
	static int method981(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field320 += var9.field324 * (var6 - var3);
		var9.field325 += var9.field328 * (var6 - var3);

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

		var9.field319 = var4 >> 2;
		var9.field321 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbz;)I"
	)
	static int method945(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field319 += var12.field327 * (var9 - var4);
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

		var12.field320 = var5 >> 2;
		var12.field325 = var6 >> 2;
		var12.field321 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method946(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field320 -= var11.field324 * var5;
		var11.field325 -= var11.field328 * var5;
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

		var11.field320 += var11.field324 * var5;
		var11.field325 += var11.field328 * var5;
		var11.field319 = var6;
		var11.field321 = var4;
		return var5;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbz;II)I"
	)
	static int method947(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field319 -= var5 * var13.field327;
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
		var13.field319 += var13.field327 * var5;
		var13.field320 = var6;
		var13.field325 = var7;
		var13.field321 = var4;
		return var5;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method948(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field320 -= var11.field324 * var5;
		var11.field325 -= var11.field328 * var5;
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

		var11.field320 += var11.field324 * var5;
		var11.field325 += var11.field328 * var5;
		var11.field319 = var6;
		var11.field321 = var4;
		return var5;
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbz;II)I"
	)
	static int method949(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field319 -= var5 * var13.field327;
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
		var13.field319 += var13.field327 * var5;
		var13.field320 = var6;
		var13.field325 = var7;
		var13.field321 = var4;
		return var5;
	}
}
