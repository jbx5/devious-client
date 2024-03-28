import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("az")
	int field341;
	@ObfuscatedName("ah")
	int field328;
	@ObfuscatedName("af")
	int field329;
	@ObfuscatedName("at")
	int field330;
	@ObfuscatedName("an")
	int field331;
	@ObfuscatedName("ao")
	int field340;
	@ObfuscatedName("ab")
	int field336;
	@ObfuscatedName("aw")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ad")
	@Export("start")
	int start;
	@ObfuscatedName("al")
	@Export("end")
	int end;
	@ObfuscatedName("as")
	boolean field337;
	@ObfuscatedName("ag")
	int field338;
	@ObfuscatedName("ai")
	int field339;
	@ObfuscatedName("ax")
	int field335;
	@ObfuscatedName("ar")
	int field333;

	@ObfuscatedSignature(
		descriptor = "(Lbr;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field337 = var1.field254;
		this.field328 = var2;
		this.field329 = var3;
		this.field330 = var4;
		this.field341 = 0;
		this.method857();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbr;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field337 = var1.field254;
		this.field328 = var2;
		this.field329 = var3;
		this.field330 = 8192;
		this.field341 = 0;
		this.method857();
	}

	@ObfuscatedName("an")
	void method857() {
		this.field331 = this.field329;
		this.field340 = method955(this.field329, this.field330);
		this.field336 = method851(this.field329, this.field330);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("aw")
	protected int vmethod6214() {
		return this.field329 == 0 && this.field338 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ad")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field329 == 0 && this.field338 == 0) {
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
			if (this.field341 < 0) {
				if (this.field328 <= 0) {
					this.method972();
					this.remove();
					return;
				}

				this.field341 = 0;
			}

			if (this.field341 >= var7) {
				if (this.field328 >= 0) {
					this.method972();
					this.remove();
					return;
				}

				this.field341 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field337) {
					if (this.field328 < 0) {
						var9 = this.method879(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field341 >= var5) {
							return;
						}

						this.field341 = var5 + var5 - 1 - this.field341;
						this.field328 = -this.field328;
					}

					while (true) {
						var9 = this.method878(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field341 < var6) {
							return;
						}

						this.field341 = var6 + var6 - 1 - this.field341;
						this.field328 = -this.field328;
						var9 = this.method879(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field341 >= var5) {
							return;
						}

						this.field341 = var5 + var5 - 1 - this.field341;
						this.field328 = -this.field328;
					}
				} else if (this.field328 < 0) {
					while (true) {
						var9 = this.method879(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field341 >= var5) {
							return;
						}

						this.field341 = var6 - 1 - (var6 - 1 - this.field341) % var8;
					}
				} else {
					while (true) {
						var9 = this.method878(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field341 < var6) {
							return;
						}

						this.field341 = var5 + (this.field341 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field337) {
						label127: {
							if (this.field328 < 0) {
								var9 = this.method879(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field341 >= var5) {
									return;
								}

								this.field341 = var5 + var5 - 1 - this.field341;
								this.field328 = -this.field328;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method878(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field341 < var6) {
									return;
								}

								this.field341 = var6 + var6 - 1 - this.field341;
								this.field328 = -this.field328;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method879(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field341 >= var5) {
									return;
								}

								this.field341 = var5 + var5 - 1 - this.field341;
								this.field328 = -this.field328;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field328 < 0) {
							while (true) {
								var9 = this.method879(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field341 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field341) / var8;
								if (var10 >= this.numLoops) {
									this.field341 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field341 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method878(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field341 < var6) {
									return;
								}

								var10 = (this.field341 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field341 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field341 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field328 < 0) {
					this.method879(var1, var9, 0, var3, 0);
					if (this.field341 < 0) {
						this.field341 = -1;
						this.method972();
						this.remove();
					}
				} else {
					this.method878(var1, var9, var7, var3, 0);
					if (this.field341 >= var7) {
						this.field341 = var7;
						this.method972();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("al")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("as")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field338 > 0) {
			if (var1 >= this.field338) {
				if (this.field329 == Integer.MIN_VALUE) {
					this.field329 = 0;
					this.field336 = 0;
					this.field340 = 0;
					this.field331 = 0;
					this.remove();
					var1 = this.field338;
				}

				this.field338 = 0;
				this.method857();
			} else {
				this.field331 += this.field339 * var1;
				this.field340 += this.field335 * var1;
				this.field336 += this.field333 * var1;
				this.field338 -= var1;
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

		if (this.field341 < 0) {
			if (this.field328 <= 0) {
				this.method972();
				this.remove();
				return;
			}

			this.field341 = 0;
		}

		if (this.field341 >= var5) {
			if (this.field328 >= 0) {
				this.method972();
				this.remove();
				return;
			}

			this.field341 = var5 - 1;
		}

		this.field341 += this.field328 * var1;
		if (this.numLoops < 0) {
			if (!this.field337) {
				if (this.field328 < 0) {
					if (this.field341 >= var3) {
						return;
					}

					this.field341 = var4 - 1 - (var4 - 1 - this.field341) % var6;
				} else {
					if (this.field341 < var4) {
						return;
					}

					this.field341 = var3 + (this.field341 - var3) % var6;
				}

			} else {
				if (this.field328 < 0) {
					if (this.field341 >= var3) {
						return;
					}

					this.field341 = var3 + var3 - 1 - this.field341;
					this.field328 = -this.field328;
				}

				while (this.field341 >= var4) {
					this.field341 = var4 + var4 - 1 - this.field341;
					this.field328 = -this.field328;
					if (this.field341 >= var3) {
						return;
					}

					this.field341 = var3 + var3 - 1 - this.field341;
					this.field328 = -this.field328;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field337) {
					label129: {
						if (this.field328 < 0) {
							if (this.field341 >= var3) {
								return;
							}

							this.field341 = var3 + var3 - 1 - this.field341;
							this.field328 = -this.field328;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field341 < var4) {
								return;
							}

							this.field341 = var4 + var4 - 1 - this.field341;
							this.field328 = -this.field328;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field341 >= var3) {
								return;
							}

							this.field341 = var3 + var3 - 1 - this.field341;
							this.field328 = -this.field328;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field328 < 0) {
							if (this.field341 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field341) / var6;
							if (var7 >= this.numLoops) {
								this.field341 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field341 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field341 < var4) {
								return;
							}

							var7 = (this.field341 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field341 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field341 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field328 < 0) {
				if (this.field341 < 0) {
					this.field341 = -1;
					this.method972();
					this.remove();
				}
			} else if (this.field341 >= var5) {
				this.field341 = var5;
				this.method972();
				this.remove();
			}

		}
	}

	@ObfuscatedName("ag")
	public synchronized void method859(int var1) {
		this.method908(var1 << 6, this.method863());
	}

	@ObfuscatedName("ai")
	synchronized void method898(int var1) {
		this.method908(var1, this.method863());
	}

	@ObfuscatedName("ax")
	synchronized void method908(int var1, int var2) {
		this.field329 = var1;
		this.field330 = var2;
		this.field338 = 0;
		this.method857();
	}

	@ObfuscatedName("ar")
	public synchronized int method934() {
		return this.field329 == Integer.MIN_VALUE ? 0 : this.field329;
	}

	@ObfuscatedName("aj")
	public synchronized int method863() {
		return this.field330 < 0 ? -1 : this.field330;
	}

	@ObfuscatedName("au")
	public synchronized void method899(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field341 = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method865() {
		this.field328 = (this.field328 ^ this.field328 >> 31) + (this.field328 >>> 31);
		this.field328 = -this.field328;
	}

	@ObfuscatedName("ap")
	void method972() {
		if (this.field338 != 0) {
			if (this.field329 == Integer.MIN_VALUE) {
				this.field329 = 0;
			}

			this.field338 = 0;
			this.method857();
		}

	}

	@ObfuscatedName("av")
	public synchronized void method867(int var1, int var2) {
		this.method868(var1, var2, this.method863());
	}

	@ObfuscatedName("aa")
	public synchronized void method868(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method908(var2, var3);
		} else {
			int var4 = method955(var2, var3);
			int var5 = method851(var2, var3);
			if (var4 == this.field340 && var5 == this.field336) {
				this.field338 = 0;
			} else {
				int var6 = var2 - this.field331;
				if (this.field331 - var2 > var6) {
					var6 = this.field331 - var2;
				}

				if (var4 - this.field340 > var6) {
					var6 = var4 - this.field340;
				}

				if (this.field340 - var4 > var6) {
					var6 = this.field340 - var4;
				}

				if (var5 - this.field336 > var6) {
					var6 = var5 - this.field336;
				}

				if (this.field336 - var5 > var6) {
					var6 = this.field336 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field338 = var1;
				this.field329 = var2;
				this.field330 = var3;
				this.field339 = (var2 - this.field331) / var1;
				this.field335 = (var4 - this.field340) / var1;
				this.field333 = (var5 - this.field336) / var1;
			}
		}
	}

	@ObfuscatedName("aq")
	public synchronized void method862(int var1) {
		if (var1 == 0) {
			this.method898(0);
			this.remove();
		} else if (this.field340 == 0 && this.field336 == 0) {
			this.field338 = 0;
			this.field329 = 0;
			this.field331 = 0;
			this.remove();
		} else {
			int var2 = -this.field331;
			if (this.field331 > var2) {
				var2 = this.field331;
			}

			if (-this.field340 > var2) {
				var2 = -this.field340;
			}

			if (this.field340 > var2) {
				var2 = this.field340;
			}

			if (-this.field336 > var2) {
				var2 = -this.field336;
			}

			if (this.field336 > var2) {
				var2 = this.field336;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field338 = var1;
			this.field329 = Integer.MIN_VALUE;
			this.field339 = -this.field331 / var1;
			this.field335 = -this.field340 / var1;
			this.field333 = -this.field336 / var1;
		}
	}

	@ObfuscatedName("am")
	public synchronized void method896(int var1) {
		if (this.field328 < 0) {
			this.field328 = -var1;
		} else {
			this.field328 = var1;
		}

	}

	@ObfuscatedName("ac")
	public synchronized int method871() {
		return this.field328 < 0 ? -this.field328 : this.field328;
	}

	@ObfuscatedName("ae")
	public boolean method853() {
		return this.field341 < 0 || this.field341 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bx")
	public boolean method873() {
		return this.field338 != 0;
	}

	@ObfuscatedName("bl")
	int method878(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field338 > 0) {
				int var6 = var2 + this.field338;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field338 += var2;
				if (this.field328 == 256 && (this.field341 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method984(0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, this.field335, this.field333, 0, var6, var3, this);
					} else {
						var2 = method918(((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, this.field339, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method894(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, this.field335, this.field333, 0, var6, var3, this, this.field328, var5);
				} else {
					var2 = method916(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, this.field339, 0, var6, var3, this, this.field328, var5);
				}

				this.field338 -= var2;
				if (this.field338 != 0) {
					return var2;
				}

				if (!this.method880()) {
					continue;
				}

				return var4;
			}

			if (this.field328 == 256 && (this.field341 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method943(0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, 0, var4, var3, this);
				}

				return method881(((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method968(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, 0, var4, var3, this, this.field328, var5);
			}

			return method932(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, 0, var4, var3, this, this.field328, var5);
		}
	}

	@ObfuscatedName("bh")
	int method879(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field338 > 0) {
				int var6 = var2 + this.field338;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field338 += var2;
				if (this.field328 == -256 && (this.field341 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method892(0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, this.field335, this.field333, 0, var6, var3, this);
					} else {
						var2 = method891(((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, this.field339, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method919(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, this.field335, this.field333, 0, var6, var3, this, this.field328, var5);
				} else {
					var2 = method895(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, this.field339, 0, var6, var3, this, this.field328, var5);
				}

				this.field338 -= var2;
				if (this.field338 != 0) {
					return var2;
				}

				if (!this.method880()) {
					continue;
				}

				return var4;
			}

			if (this.field328 == -256 && (this.field341 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method884(0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, 0, var4, var3, this);
				}

				return method883(((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method956(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field340, this.field336, 0, var4, var3, this, this.field328, var5);
			}

			return method887(0, 0, ((RawSound)super.sound).samples, var1, this.field341, var2, this.field331, 0, var4, var3, this, this.field328, var5);
		}
	}

	@ObfuscatedName("br")
	boolean method880() {
		int var1 = this.field329;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method955(var1, this.field330);
			var3 = method851(var1, this.field330);
		}

		if (var1 == this.field331 && var2 == this.field340 && var3 == this.field336) {
			if (this.field329 == Integer.MIN_VALUE) {
				this.field329 = 0;
				this.field336 = 0;
				this.field340 = 0;
				this.field331 = 0;
				this.remove();
				return true;
			} else {
				this.method857();
				return false;
			}
		} else {
			if (this.field331 < var1) {
				this.field339 = 1;
				this.field338 = var1 - this.field331;
			} else if (this.field331 > var1) {
				this.field339 = -1;
				this.field338 = this.field331 - var1;
			} else {
				this.field339 = 0;
			}

			if (this.field340 < var2) {
				this.field335 = 1;
				if (this.field338 == 0 || this.field338 > var2 - this.field340) {
					this.field338 = var2 - this.field340;
				}
			} else if (this.field340 > var2) {
				this.field335 = -1;
				if (this.field338 == 0 || this.field338 > this.field340 - var2) {
					this.field338 = this.field340 - var2;
				}
			} else {
				this.field335 = 0;
			}

			if (this.field336 < var3) {
				this.field333 = 1;
				if (this.field338 == 0 || this.field338 > var3 - this.field336) {
					this.field338 = var3 - this.field336;
				}
			} else if (this.field336 > var3) {
				this.field333 = -1;
				if (this.field338 == 0 || this.field338 > this.field336 - var3) {
					this.field338 = this.field336 - var3;
				}
			} else {
				this.field333 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("bk")
	int vmethod1015() {
		int var1 = this.field331 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field341 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("az")
	static int method955(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ah")
	static int method851(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lbr;II)Lbm;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class472.field4892 * -767557632)), var2 << 6) : null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lbr;III)Lbm;"
	)
	public static RawPcmStream method856(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbm;)I"
	)
	static int method881(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field341 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbm;)I"
	)
	static int method943(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field341 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbm;)I"
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

		var8.field341 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbm;)I"
	)
	static int method884(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field341 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbm;II)I"
	)
	static int method932(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field341 = var4;
		return var5;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbm;II)I"
	)
	static int method968(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field341 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbm;II)I"
	)
	static int method887(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field341 = var4;
		return var5;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbm;II)I"
	)
	static int method956(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field341 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbm;)I"
	)
	static int method918(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field340 += var9.field335 * (var6 - var3);
		var9.field336 += var9.field333 * (var6 - var3);

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

		var9.field331 = var4 >> 2;
		var9.field341 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbm;)I"
	)
	static int method984(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field331 += var12.field339 * (var9 - var4);
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

		var12.field340 = var5 >> 2;
		var12.field336 = var6 >> 2;
		var12.field341 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbm;)I"
	)
	static int method891(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field340 += var9.field335 * (var6 - var3);
		var9.field336 += var9.field333 * (var6 - var3);

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

		var9.field331 = var4 >> 2;
		var9.field341 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbm;)I"
	)
	static int method892(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field331 += var12.field339 * (var9 - var4);
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

		var12.field340 = var5 >> 2;
		var12.field336 = var6 >> 2;
		var12.field341 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbm;II)I"
	)
	static int method916(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field340 -= var11.field335 * var5;
		var11.field336 -= var11.field333 * var5;
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

		var11.field340 += var11.field335 * var5;
		var11.field336 += var11.field333 * var5;
		var11.field331 = var6;
		var11.field341 = var4;
		return var5;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbm;II)I"
	)
	static int method894(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field331 -= var5 * var13.field339;
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
		var13.field331 += var13.field339 * var5;
		var13.field340 = var6;
		var13.field336 = var7;
		var13.field341 = var4;
		return var5;
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbm;II)I"
	)
	static int method895(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field340 -= var11.field335 * var5;
		var11.field336 -= var11.field333 * var5;
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

		var11.field340 += var11.field335 * var5;
		var11.field336 += var11.field333 * var5;
		var11.field331 = var6;
		var11.field341 = var4;
		return var5;
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbm;II)I"
	)
	static int method919(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field331 -= var5 * var13.field339;
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
		var13.field331 += var13.field339 * var5;
		var13.field340 = var6;
		var13.field336 = var7;
		var13.field341 = var4;
		return var5;
	}
}
