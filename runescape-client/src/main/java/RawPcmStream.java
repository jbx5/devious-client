import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ab")
	int field324;
	@ObfuscatedName("ay")
	int field318;
	@ObfuscatedName("an")
	int field327;
	@ObfuscatedName("au")
	int field316;
	@ObfuscatedName("ax")
	int field317;
	@ObfuscatedName("ao")
	int field313;
	@ObfuscatedName("am")
	int field319;
	@ObfuscatedName("ac")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ae")
	@Export("start")
	int start;
	@ObfuscatedName("ad")
	@Export("end")
	int end;
	@ObfuscatedName("aq")
	boolean field323;
	@ObfuscatedName("al")
	int field322;
	@ObfuscatedName("aj")
	int field314;
	@ObfuscatedName("as")
	int field326;
	@ObfuscatedName("aw")
	int field315;

	@ObfuscatedSignature(
		descriptor = "(Lbq;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field323 = var1.field241;
		this.field318 = var2;
		this.field327 = var3;
		this.field316 = var4;
		this.field324 = 0;
		this.method902();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbq;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field323 = var1.field241;
		this.field318 = var2;
		this.field327 = var3;
		this.field316 = 8192;
		this.field324 = 0;
		this.method902();
	}

	@ObfuscatedName("ax")
	void method902() {
		this.field317 = this.field327;
		this.field313 = method851(this.field327, this.field316);
		this.field319 = method880(this.field327, this.field316);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "()Lbb;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ac")
	protected int vmethod6461() {
		return this.field327 == 0 && this.field322 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ae")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field327 == 0 && this.field322 == 0) {
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
			if (this.field324 < 0) {
				if (this.field318 <= 0) {
					this.method926();
					this.remove();
					return;
				}

				this.field324 = 0;
			}

			if (this.field324 >= var7) {
				if (this.field318 >= 0) {
					this.method926();
					this.remove();
					return;
				}

				this.field324 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field323) {
					if (this.field318 < 0) {
						var9 = this.method879(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field324 >= var5) {
							return;
						}

						this.field324 = var5 + var5 - 1 - this.field324;
						this.field318 = -this.field318;
					}

					while (true) {
						var9 = this.method878(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field324 < var6) {
							return;
						}

						this.field324 = var6 + var6 - 1 - this.field324;
						this.field318 = -this.field318;
						var9 = this.method879(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field324 >= var5) {
							return;
						}

						this.field324 = var5 + var5 - 1 - this.field324;
						this.field318 = -this.field318;
					}
				} else if (this.field318 < 0) {
					while (true) {
						var9 = this.method879(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field324 >= var5) {
							return;
						}

						this.field324 = var6 - 1 - (var6 - 1 - this.field324) % var8;
					}
				} else {
					while (true) {
						var9 = this.method878(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field324 < var6) {
							return;
						}

						this.field324 = var5 + (this.field324 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field323) {
						label127: {
							if (this.field318 < 0) {
								var9 = this.method879(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field324 >= var5) {
									return;
								}

								this.field324 = var5 + var5 - 1 - this.field324;
								this.field318 = -this.field318;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method878(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field324 < var6) {
									return;
								}

								this.field324 = var6 + var6 - 1 - this.field324;
								this.field318 = -this.field318;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method879(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field324 >= var5) {
									return;
								}

								this.field324 = var5 + var5 - 1 - this.field324;
								this.field318 = -this.field318;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field318 < 0) {
							while (true) {
								var9 = this.method879(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field324 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field324) / var8;
								if (var10 >= this.numLoops) {
									this.field324 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field324 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method878(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field324 < var6) {
									return;
								}

								var10 = (this.field324 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field324 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field324 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field318 < 0) {
					this.method879(var1, var9, 0, var3, 0);
					if (this.field324 < 0) {
						this.field324 = -1;
						this.method926();
						this.remove();
					}
				} else {
					this.method878(var1, var9, var7, var3, 0);
					if (this.field324 >= var7) {
						this.field324 = var7;
						this.method926();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ad")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("aq")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field322 > 0) {
			if (var1 >= this.field322) {
				if (this.field327 == Integer.MIN_VALUE) {
					this.field327 = 0;
					this.field319 = 0;
					this.field313 = 0;
					this.field317 = 0;
					this.remove();
					var1 = this.field322;
				}

				this.field322 = 0;
				this.method902();
			} else {
				this.field317 += this.field314 * var1;
				this.field313 += this.field326 * var1;
				this.field319 += this.field315 * var1;
				this.field322 -= var1;
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

		if (this.field324 < 0) {
			if (this.field318 <= 0) {
				this.method926();
				this.remove();
				return;
			}

			this.field324 = 0;
		}

		if (this.field324 >= var5) {
			if (this.field318 >= 0) {
				this.method926();
				this.remove();
				return;
			}

			this.field324 = var5 - 1;
		}

		this.field324 += this.field318 * var1;
		if (this.numLoops < 0) {
			if (!this.field323) {
				if (this.field318 < 0) {
					if (this.field324 >= var3) {
						return;
					}

					this.field324 = var4 - 1 - (var4 - 1 - this.field324) % var6;
				} else {
					if (this.field324 < var4) {
						return;
					}

					this.field324 = var3 + (this.field324 - var3) % var6;
				}

			} else {
				if (this.field318 < 0) {
					if (this.field324 >= var3) {
						return;
					}

					this.field324 = var3 + var3 - 1 - this.field324;
					this.field318 = -this.field318;
				}

				while (this.field324 >= var4) {
					this.field324 = var4 + var4 - 1 - this.field324;
					this.field318 = -this.field318;
					if (this.field324 >= var3) {
						return;
					}

					this.field324 = var3 + var3 - 1 - this.field324;
					this.field318 = -this.field318;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field323) {
					label129: {
						if (this.field318 < 0) {
							if (this.field324 >= var3) {
								return;
							}

							this.field324 = var3 + var3 - 1 - this.field324;
							this.field318 = -this.field318;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field324 < var4) {
								return;
							}

							this.field324 = var4 + var4 - 1 - this.field324;
							this.field318 = -this.field318;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field324 >= var3) {
								return;
							}

							this.field324 = var3 + var3 - 1 - this.field324;
							this.field318 = -this.field318;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field318 < 0) {
							if (this.field324 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field324) / var6;
							if (var7 >= this.numLoops) {
								this.field324 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field324 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field324 < var4) {
								return;
							}

							var7 = (this.field324 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field324 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field324 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field318 < 0) {
				if (this.field324 < 0) {
					this.field324 = -1;
					this.method926();
					this.remove();
				}
			} else if (this.field324 >= var5) {
				this.field324 = var5;
				this.method926();
				this.remove();
			}

		}
	}

	@ObfuscatedName("al")
	public synchronized void method858(int var1) {
		this.method860(var1 << 6, this.method862());
	}

	@ObfuscatedName("aj")
	synchronized void method859(int var1) {
		this.method860(var1, this.method862());
	}

	@ObfuscatedName("as")
	synchronized void method860(int var1, int var2) {
		this.field327 = var1;
		this.field316 = var2;
		this.field322 = 0;
		this.method902();
	}

	@ObfuscatedName("aw")
	public synchronized int method856() {
		return this.field327 == Integer.MIN_VALUE ? 0 : this.field327;
	}

	@ObfuscatedName("af")
	public synchronized int method862() {
		return this.field316 < 0 ? -1 : this.field316;
	}

	@ObfuscatedName("aa")
	public synchronized void method968(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field324 = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method958() {
		this.field318 = (this.field318 ^ this.field318 >> 31) + (this.field318 >>> 31);
		this.field318 = -this.field318;
	}

	@ObfuscatedName("ag")
	void method926() {
		if (this.field322 != 0) {
			if (this.field327 == Integer.MIN_VALUE) {
				this.field327 = 0;
			}

			this.field322 = 0;
			this.method902();
		}

	}

	@ObfuscatedName("av")
	public synchronized void method912(int var1, int var2) {
		this.method867(var1, var2, this.method862());
	}

	@ObfuscatedName("ar")
	public synchronized void method867(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method860(var2, var3);
		} else {
			int var4 = method851(var2, var3);
			int var5 = method880(var2, var3);
			if (var4 == this.field313 && var5 == this.field319) {
				this.field322 = 0;
			} else {
				int var6 = var2 - this.field317;
				if (this.field317 - var2 > var6) {
					var6 = this.field317 - var2;
				}

				if (var4 - this.field313 > var6) {
					var6 = var4 - this.field313;
				}

				if (this.field313 - var4 > var6) {
					var6 = this.field313 - var4;
				}

				if (var5 - this.field319 > var6) {
					var6 = var5 - this.field319;
				}

				if (this.field319 - var5 > var6) {
					var6 = this.field319 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field322 = var1;
				this.field327 = var2;
				this.field316 = var3;
				this.field314 = (var2 - this.field317) / var1;
				this.field326 = (var4 - this.field313) / var1;
				this.field315 = (var5 - this.field319) / var1;
			}
		}
	}

	@ObfuscatedName("ap")
	public synchronized void method999(int var1) {
		if (var1 == 0) {
			this.method859(0);
			this.remove();
		} else if (this.field313 == 0 && this.field319 == 0) {
			this.field322 = 0;
			this.field327 = 0;
			this.field317 = 0;
			this.remove();
		} else {
			int var2 = -this.field317;
			if (this.field317 > var2) {
				var2 = this.field317;
			}

			if (-this.field313 > var2) {
				var2 = -this.field313;
			}

			if (this.field313 > var2) {
				var2 = this.field313;
			}

			if (-this.field319 > var2) {
				var2 = -this.field319;
			}

			if (this.field319 > var2) {
				var2 = this.field319;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field322 = var1;
			this.field327 = Integer.MIN_VALUE;
			this.field314 = -this.field317 / var1;
			this.field326 = -this.field313 / var1;
			this.field315 = -this.field319 / var1;
		}
	}

	@ObfuscatedName("ak")
	public synchronized void method869(int var1) {
		if (this.field318 < 0) {
			this.field318 = -var1;
		} else {
			this.field318 = var1;
		}

	}

	@ObfuscatedName("ai")
	public synchronized int method865() {
		return this.field318 < 0 ? -this.field318 : this.field318;
	}

	@ObfuscatedName("bz")
	public boolean method871() {
		return this.field324 < 0 || this.field324 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bj")
	public boolean method872() {
		return this.field322 != 0;
	}

	@ObfuscatedName("bc")
	int method878(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field322 > 0) {
				int var6 = var2 + this.field322;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field322 += var2;
				if (this.field318 == 256 && (this.field324 & 255) == 0) {
					if (HttpContentType.PcmPlayer_stereo) {
						var2 = method868(0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, this.field326, this.field315, 0, var6, var3, this);
					} else {
						var2 = method889(((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, this.field314, 0, var6, var3, this);
					}
				} else if (HttpContentType.PcmPlayer_stereo) {
					var2 = method917(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, this.field326, this.field315, 0, var6, var3, this, this.field318, var5);
				} else {
					var2 = method977(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, this.field314, 0, var6, var3, this, this.field318, var5);
				}

				this.field322 -= var2;
				if (this.field322 != 0) {
					return var2;
				}

				if (!this.method955()) {
					continue;
				}

				return var4;
			}

			if (this.field318 == 256 && (this.field324 & 255) == 0) {
				if (HttpContentType.PcmPlayer_stereo) {
					return method882(0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, 0, var4, var3, this);
				}

				return method895(((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, 0, var4, var3, this);
			}

			if (HttpContentType.PcmPlayer_stereo) {
				return method861(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, 0, var4, var3, this, this.field318, var5);
			}

			return method885(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, 0, var4, var3, this, this.field318, var5);
		}
	}

	@ObfuscatedName("bm")
	int method879(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field322 > 0) {
				int var6 = var2 + this.field322;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field322 += var2;
				if (this.field318 == -256 && (this.field324 & 255) == 0) {
					if (HttpContentType.PcmPlayer_stereo) {
						var2 = method987(0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, this.field326, this.field315, 0, var6, var3, this);
					} else {
						var2 = method903(((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, this.field314, 0, var6, var3, this);
					}
				} else if (HttpContentType.PcmPlayer_stereo) {
					var2 = method956(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, this.field326, this.field315, 0, var6, var3, this, this.field318, var5);
				} else {
					var2 = method866(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, this.field314, 0, var6, var3, this, this.field318, var5);
				}

				this.field322 -= var2;
				if (this.field322 != 0) {
					return var2;
				}

				if (!this.method955()) {
					continue;
				}

				return var4;
			}

			if (this.field318 == -256 && (this.field324 & 255) == 0) {
				if (HttpContentType.PcmPlayer_stereo) {
					return method919(0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, 0, var4, var3, this);
				}

				return method883(((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, 0, var4, var3, this);
			}

			if (HttpContentType.PcmPlayer_stereo) {
				return method888(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field313, this.field319, 0, var4, var3, this, this.field318, var5);
			}

			return method853(0, 0, ((RawSound)super.sound).samples, var1, this.field324, var2, this.field317, 0, var4, var3, this, this.field318, var5);
		}
	}

	@ObfuscatedName("bv")
	int vmethod1015() {
		int var1 = this.field317 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field324 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("bu")
	boolean method955() {
		int var1 = this.field327;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method851(var1, this.field316);
			var3 = method880(var1, this.field316);
		}

		if (var1 == this.field317 && var2 == this.field313 && var3 == this.field319) {
			if (this.field327 == Integer.MIN_VALUE) {
				this.field327 = 0;
				this.field319 = 0;
				this.field313 = 0;
				this.field317 = 0;
				this.remove();
				return true;
			} else {
				this.method902();
				return false;
			}
		} else {
			if (this.field317 < var1) {
				this.field314 = 1;
				this.field322 = var1 - this.field317;
			} else if (this.field317 > var1) {
				this.field314 = -1;
				this.field322 = this.field317 - var1;
			} else {
				this.field314 = 0;
			}

			if (this.field313 < var2) {
				this.field326 = 1;
				if (this.field322 == 0 || this.field322 > var2 - this.field313) {
					this.field322 = var2 - this.field313;
				}
			} else if (this.field313 > var2) {
				this.field326 = -1;
				if (this.field322 == 0 || this.field322 > this.field313 - var2) {
					this.field322 = this.field313 - var2;
				}
			} else {
				this.field326 = 0;
			}

			if (this.field319 < var3) {
				this.field315 = 1;
				if (this.field322 == 0 || this.field322 > var3 - this.field319) {
					this.field322 = var3 - this.field319;
				}
			} else if (this.field319 > var3) {
				this.field315 = -1;
				if (this.field322 == 0 || this.field322 > this.field319 - var3) {
					this.field322 = this.field319 - var3;
				}
			} else {
				this.field315 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ab")
	static int method851(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ay")
	static int method880(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lbq;II)Lbs;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class511.field5136 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lbq;III)Lbs;"
	)
	public static RawPcmStream method855(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method895(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field324 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method882(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field324 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbs;)I"
	)
	static int method883(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field324 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbs;)I"
	)
	static int method919(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field324 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method885(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field324 = var4;
		return var5;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method861(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field324 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbs;II)I"
	)
	static int method853(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field324 = var4;
		return var5;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method888(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field324 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method889(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field313 += var9.field326 * (var6 - var3);
		var9.field319 += var9.field315 * (var6 - var3);

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

		var9.field317 = var4 >> 2;
		var9.field324 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method868(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field317 += var12.field314 * (var9 - var4);
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

		var12.field313 = var5 >> 2;
		var12.field319 = var6 >> 2;
		var12.field324 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbs;)I"
	)
	static int method903(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field313 += var9.field326 * (var6 - var3);
		var9.field319 += var9.field315 * (var6 - var3);

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

		var9.field317 = var4 >> 2;
		var9.field324 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbs;)I"
	)
	static int method987(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field317 += var12.field314 * (var9 - var4);
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

		var12.field313 = var5 >> 2;
		var12.field319 = var6 >> 2;
		var12.field324 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method977(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field313 -= var11.field326 * var5;
		var11.field319 -= var11.field315 * var5;
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

		var11.field313 += var11.field326 * var5;
		var11.field319 += var11.field315 * var5;
		var11.field317 = var6;
		var11.field324 = var4;
		return var5;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method917(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field317 -= var5 * var13.field314;
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
		var13.field317 += var13.field314 * var5;
		var13.field313 = var6;
		var13.field319 = var7;
		var13.field324 = var4;
		return var5;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbs;II)I"
	)
	static int method866(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field313 -= var11.field326 * var5;
		var11.field319 -= var11.field315 * var5;
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

		var11.field313 += var11.field326 * var5;
		var11.field319 += var11.field315 * var5;
		var11.field317 = var6;
		var11.field324 = var4;
		return var5;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbs;II)I"
	)
	static int method956(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field317 -= var5 * var13.field314;
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
		var13.field317 += var13.field314 * var5;
		var13.field313 = var6;
		var13.field319 = var7;
		var13.field324 = var4;
		return var5;
	}
}
