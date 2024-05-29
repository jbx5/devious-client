import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ak")
	int field344;
	@ObfuscatedName("al")
	int field340;
	@ObfuscatedName("aj")
	int field345;
	@ObfuscatedName("az")
	int field353;
	@ObfuscatedName("af")
	int field343;
	@ObfuscatedName("aa")
	int field339;
	@ObfuscatedName("at")
	int field342;
	@ObfuscatedName("ab")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("ac")
	@Export("start")
	int start;
	@ObfuscatedName("ao")
	@Export("end")
	int end;
	@ObfuscatedName("ah")
	boolean field349;
	@ObfuscatedName("av")
	int field350;
	@ObfuscatedName("aq")
	int field351;
	@ObfuscatedName("ap")
	int field341;
	@ObfuscatedName("ae")
	int field352;

	@ObfuscatedSignature(
		descriptor = "(Lbr;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field349 = var1.field269;
		this.field340 = var2;
		this.field345 = var3;
		this.field353 = var4;
		this.field344 = 0;
		this.method896();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbr;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field349 = var1.field269;
		this.field340 = var2;
		this.field345 = var3;
		this.field353 = 8192;
		this.field344 = 0;
		this.method896();
	}

	@ObfuscatedName("af")
	void method896() {
		this.field343 = this.field345;
		this.field339 = method916(this.field345, this.field353);
		this.field342 = method889(this.field345, this.field353);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "()Lba;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ab")
	protected int vmethod6454() {
		return this.field345 == 0 && this.field350 == 0 ? 0 : 1;
	}

	@ObfuscatedName("ac")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field345 == 0 && this.field350 == 0) {
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
			if (this.field344 < 0) {
				if (this.field340 <= 0) {
					this.method905();
					this.remove();
					return;
				}

				this.field344 = 0;
			}

			if (this.field344 >= var7) {
				if (this.field340 >= 0) {
					this.method905();
					this.remove();
					return;
				}

				this.field344 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field349) {
					if (this.field340 < 0) {
						var9 = this.method974(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field344 >= var5) {
							return;
						}

						this.field344 = var5 + var5 - 1 - this.field344;
						this.field340 = -this.field340;
					}

					while (true) {
						var9 = this.method918(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field344 < var6) {
							return;
						}

						this.field344 = var6 + var6 - 1 - this.field344;
						this.field340 = -this.field340;
						var9 = this.method974(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field344 >= var5) {
							return;
						}

						this.field344 = var5 + var5 - 1 - this.field344;
						this.field340 = -this.field340;
					}
				} else if (this.field340 < 0) {
					while (true) {
						var9 = this.method974(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field344 >= var5) {
							return;
						}

						this.field344 = var6 - 1 - (var6 - 1 - this.field344) % var8;
					}
				} else {
					while (true) {
						var9 = this.method918(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field344 < var6) {
							return;
						}

						this.field344 = var5 + (this.field344 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field349) {
						label127: {
							if (this.field340 < 0) {
								var9 = this.method974(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field344 >= var5) {
									return;
								}

								this.field344 = var5 + var5 - 1 - this.field344;
								this.field340 = -this.field340;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method918(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field344 < var6) {
									return;
								}

								this.field344 = var6 + var6 - 1 - this.field344;
								this.field340 = -this.field340;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method974(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field344 >= var5) {
									return;
								}

								this.field344 = var5 + var5 - 1 - this.field344;
								this.field340 = -this.field340;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field340 < 0) {
							while (true) {
								var9 = this.method974(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field344 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field344) / var8;
								if (var10 >= this.numLoops) {
									this.field344 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field344 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method918(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field344 < var6) {
									return;
								}

								var10 = (this.field344 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field344 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field344 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field340 < 0) {
					this.method974(var1, var9, 0, var3, 0);
					if (this.field344 < 0) {
						this.field344 = -1;
						this.method905();
						this.remove();
					}
				} else {
					this.method918(var1, var9, var7, var3, 0);
					if (this.field344 >= var7) {
						this.field344 = var7;
						this.method905();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ao")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("ah")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field350 > 0) {
			if (var1 >= this.field350) {
				if (this.field345 == Integer.MIN_VALUE) {
					this.field345 = 0;
					this.field342 = 0;
					this.field339 = 0;
					this.field343 = 0;
					this.remove();
					var1 = this.field350;
				}

				this.field350 = 0;
				this.method896();
			} else {
				this.field343 += this.field351 * var1;
				this.field339 += this.field341 * var1;
				this.field342 += this.field352 * var1;
				this.field350 -= var1;
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

		if (this.field344 < 0) {
			if (this.field340 <= 0) {
				this.method905();
				this.remove();
				return;
			}

			this.field344 = 0;
		}

		if (this.field344 >= var5) {
			if (this.field340 >= 0) {
				this.method905();
				this.remove();
				return;
			}

			this.field344 = var5 - 1;
		}

		this.field344 += this.field340 * var1;
		if (this.numLoops < 0) {
			if (!this.field349) {
				if (this.field340 < 0) {
					if (this.field344 >= var3) {
						return;
					}

					this.field344 = var4 - 1 - (var4 - 1 - this.field344) % var6;
				} else {
					if (this.field344 < var4) {
						return;
					}

					this.field344 = var3 + (this.field344 - var3) % var6;
				}

			} else {
				if (this.field340 < 0) {
					if (this.field344 >= var3) {
						return;
					}

					this.field344 = var3 + var3 - 1 - this.field344;
					this.field340 = -this.field340;
				}

				while (this.field344 >= var4) {
					this.field344 = var4 + var4 - 1 - this.field344;
					this.field340 = -this.field340;
					if (this.field344 >= var3) {
						return;
					}

					this.field344 = var3 + var3 - 1 - this.field344;
					this.field340 = -this.field340;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field349) {
					label129: {
						if (this.field340 < 0) {
							if (this.field344 >= var3) {
								return;
							}

							this.field344 = var3 + var3 - 1 - this.field344;
							this.field340 = -this.field340;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field344 < var4) {
								return;
							}

							this.field344 = var4 + var4 - 1 - this.field344;
							this.field340 = -this.field340;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field344 >= var3) {
								return;
							}

							this.field344 = var3 + var3 - 1 - this.field344;
							this.field340 = -this.field340;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field340 < 0) {
							if (this.field344 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field344) / var6;
							if (var7 >= this.numLoops) {
								this.field344 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field344 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field344 < var4) {
								return;
							}

							var7 = (this.field344 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field344 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field344 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field340 < 0) {
				if (this.field344 < 0) {
					this.field344 = -1;
					this.method905();
					this.remove();
				}
			} else if (this.field344 >= var5) {
				this.field344 = var5;
				this.method905();
				this.remove();
			}

		}
	}

	@ObfuscatedName("av")
	public synchronized void method898(int var1) {
		this.method1024(var1 << 6, this.method892());
	}

	@ObfuscatedName("aq")
	synchronized void method899(int var1) {
		this.method1024(var1, this.method892());
	}

	@ObfuscatedName("ap")
	synchronized void method1024(int var1, int var2) {
		this.field345 = var1;
		this.field353 = var2;
		this.field350 = 0;
		this.method896();
	}

	@ObfuscatedName("ae")
	public synchronized int method971() {
		return this.field345 == Integer.MIN_VALUE ? 0 : this.field345;
	}

	@ObfuscatedName("ax")
	public synchronized int method892() {
		return this.field353 < 0 ? -1 : this.field353;
	}

	@ObfuscatedName("ay")
	public synchronized void method903(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field344 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method904() {
		this.field340 = (this.field340 ^ this.field340 >> 31) + (this.field340 >>> 31);
		this.field340 = -this.field340;
	}

	@ObfuscatedName("as")
	void method905() {
		if (this.field350 != 0) {
			if (this.field345 == Integer.MIN_VALUE) {
				this.field345 = 0;
			}

			this.field350 = 0;
			this.method896();
		}

	}

	@ObfuscatedName("aw")
	public synchronized void method906(int var1, int var2) {
		this.method907(var1, var2, this.method892());
	}

	@ObfuscatedName("ad")
	public synchronized void method907(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method1024(var2, var3);
		} else {
			int var4 = method916(var2, var3);
			int var5 = method889(var2, var3);
			if (var4 == this.field339 && var5 == this.field342) {
				this.field350 = 0;
			} else {
				int var6 = var2 - this.field343;
				if (this.field343 - var2 > var6) {
					var6 = this.field343 - var2;
				}

				if (var4 - this.field339 > var6) {
					var6 = var4 - this.field339;
				}

				if (this.field339 - var4 > var6) {
					var6 = this.field339 - var4;
				}

				if (var5 - this.field342 > var6) {
					var6 = var5 - this.field342;
				}

				if (this.field342 - var5 > var6) {
					var6 = this.field342 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field350 = var1;
				this.field345 = var2;
				this.field353 = var3;
				this.field351 = (var2 - this.field343) / var1;
				this.field341 = (var4 - this.field339) / var1;
				this.field352 = (var5 - this.field342) / var1;
			}
		}
	}

	@ObfuscatedName("bn")
	public synchronized void method908(int var1) {
		if (var1 == 0) {
			this.method899(0);
			this.remove();
		} else if (this.field339 == 0 && this.field342 == 0) {
			this.field350 = 0;
			this.field345 = 0;
			this.field343 = 0;
			this.remove();
		} else {
			int var2 = -this.field343;
			if (this.field343 > var2) {
				var2 = this.field343;
			}

			if (-this.field339 > var2) {
				var2 = -this.field339;
			}

			if (this.field339 > var2) {
				var2 = this.field339;
			}

			if (-this.field342 > var2) {
				var2 = -this.field342;
			}

			if (this.field342 > var2) {
				var2 = this.field342;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field350 = var1;
			this.field345 = Integer.MIN_VALUE;
			this.field351 = -this.field343 / var1;
			this.field341 = -this.field339 / var1;
			this.field352 = -this.field342 / var1;
		}
	}

	@ObfuscatedName("bw")
	public synchronized void method909(int var1) {
		if (this.field340 < 0) {
			this.field340 = -var1;
		} else {
			this.field340 = var1;
		}

	}

	@ObfuscatedName("bu")
	public synchronized int method910() {
		return this.field340 < 0 ? -this.field340 : this.field340;
	}

	@ObfuscatedName("bh")
	public boolean method919() {
		return this.field344 < 0 || this.field344 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bk")
	public boolean method912() {
		return this.field350 != 0;
	}

	@ObfuscatedName("bp")
	int vmethod1030() {
		int var1 = this.field343 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field344 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("br")
	int method918(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field350 > 0) {
				int var6 = var2 + this.field350;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field350 += var2;
				if (this.field340 == 256 && (this.field344 & 255) == 0) {
					if (JagexCache.PcmPlayer_stereo) {
						var2 = method994(0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, this.field341, this.field352, 0, var6, var3, this);
					} else {
						var2 = method929(((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, this.field351, 0, var6, var3, this);
					}
				} else if (JagexCache.PcmPlayer_stereo) {
					var2 = method933(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, this.field341, this.field352, 0, var6, var3, this, this.field340, var5);
				} else {
					var2 = method932(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, this.field351, 0, var6, var3, this, this.field340, var5);
				}

				this.field350 -= var2;
				if (this.field350 != 0) {
					return var2;
				}

				if (!this.method920()) {
					continue;
				}

				return var4;
			}

			if (this.field340 == 256 && (this.field344 & 255) == 0) {
				if (JagexCache.PcmPlayer_stereo) {
					return method922(0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, 0, var4, var3, this);
				}

				return method945(((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, 0, var4, var3, this);
			}

			if (JagexCache.PcmPlayer_stereo) {
				return method958(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, 0, var4, var3, this, this.field340, var5);
			}

			return method925(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, 0, var4, var3, this, this.field340, var5);
		}
	}

	@ObfuscatedName("bx")
	int method974(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field350 > 0) {
				int var6 = var2 + this.field350;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field350 += var2;
				if (this.field340 == -256 && (this.field344 & 255) == 0) {
					if (JagexCache.PcmPlayer_stereo) {
						var2 = method931(0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, this.field341, this.field352, 0, var6, var3, this);
					} else {
						var2 = method930(((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, this.field351, 0, var6, var3, this);
					}
				} else if (JagexCache.PcmPlayer_stereo) {
					var2 = method935(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, this.field341, this.field352, 0, var6, var3, this, this.field340, var5);
				} else {
					var2 = method934(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, this.field351, 0, var6, var3, this, this.field340, var5);
				}

				this.field350 -= var2;
				if (this.field350 != 0) {
					return var2;
				}

				if (!this.method920()) {
					continue;
				}

				return var4;
			}

			if (this.field340 == -256 && (this.field344 & 255) == 0) {
				if (JagexCache.PcmPlayer_stereo) {
					return method924(0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, 0, var4, var3, this);
				}

				return method923(((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, 0, var4, var3, this);
			}

			if (JagexCache.PcmPlayer_stereo) {
				return method928(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field339, this.field342, 0, var4, var3, this, this.field340, var5);
			}

			return method993(0, 0, ((RawSound)super.sound).samples, var1, this.field344, var2, this.field343, 0, var4, var3, this, this.field340, var5);
		}
	}

	@ObfuscatedName("bd")
	boolean method920() {
		int var1 = this.field345;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method916(var1, this.field353);
			var3 = method889(var1, this.field353);
		}

		if (var1 == this.field343 && var2 == this.field339 && var3 == this.field342) {
			if (this.field345 == Integer.MIN_VALUE) {
				this.field345 = 0;
				this.field342 = 0;
				this.field339 = 0;
				this.field343 = 0;
				this.remove();
				return true;
			} else {
				this.method896();
				return false;
			}
		} else {
			if (this.field343 < var1) {
				this.field351 = 1;
				this.field350 = var1 - this.field343;
			} else if (this.field343 > var1) {
				this.field351 = -1;
				this.field350 = this.field343 - var1;
			} else {
				this.field351 = 0;
			}

			if (this.field339 < var2) {
				this.field341 = 1;
				if (this.field350 == 0 || this.field350 > var2 - this.field339) {
					this.field350 = var2 - this.field339;
				}
			} else if (this.field339 > var2) {
				this.field341 = -1;
				if (this.field350 == 0 || this.field350 > this.field339 - var2) {
					this.field350 = this.field339 - var2;
				}
			} else {
				this.field341 = 0;
			}

			if (this.field342 < var3) {
				this.field352 = 1;
				if (this.field350 == 0 || this.field350 > var3 - this.field342) {
					this.field350 = var3 - this.field342;
				}
			} else if (this.field342 > var3) {
				this.field352 = -1;
				if (this.field350 == 0 || this.field350 > this.field342 - var3) {
					this.field350 = this.field342 - var3;
				}
			} else {
				this.field352 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ak")
	static int method916(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("al")
	static int method889(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbr;II)Lbz;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(UserComparator5.field1508 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lbr;III)Lbz;"
	)
	public static RawPcmStream method895(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbz;)I"
	)
	static int method945(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field344 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbz;)I"
	)
	static int method922(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field344 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbz;)I"
	)
	static int method923(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field344 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbz;)I"
	)
	static int method924(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field344 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbz;II)I"
	)
	static int method925(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field344 = var4;
		return var5;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method958(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field344 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbz;II)I"
	)
	static int method993(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field344 = var4;
		return var5;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method928(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field344 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbz;)I"
	)
	static int method929(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field339 += var9.field341 * (var6 - var3);
		var9.field342 += var9.field352 * (var6 - var3);

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

		var9.field343 = var4 >> 2;
		var9.field344 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbz;)I"
	)
	static int method994(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field343 += var12.field351 * (var9 - var4);
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

		var12.field339 = var5 >> 2;
		var12.field342 = var6 >> 2;
		var12.field344 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ck")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbz;)I"
	)
	static int method930(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field339 += var9.field341 * (var6 - var3);
		var9.field342 += var9.field352 * (var6 - var3);

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

		var9.field343 = var4 >> 2;
		var9.field344 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbz;)I"
	)
	static int method931(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field343 += var12.field351 * (var9 - var4);
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

		var12.field339 = var5 >> 2;
		var12.field342 = var6 >> 2;
		var12.field344 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method932(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field339 -= var11.field341 * var5;
		var11.field342 -= var11.field352 * var5;
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

		var11.field339 += var11.field341 * var5;
		var11.field342 += var11.field352 * var5;
		var11.field343 = var6;
		var11.field344 = var4;
		return var5;
	}

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbz;II)I"
	)
	static int method933(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field343 -= var5 * var13.field351;
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
		var13.field343 += var13.field351 * var5;
		var13.field339 = var6;
		var13.field342 = var7;
		var13.field344 = var4;
		return var5;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbz;II)I"
	)
	static int method934(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field339 -= var11.field341 * var5;
		var11.field342 -= var11.field352 * var5;
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

		var11.field339 += var11.field341 * var5;
		var11.field342 += var11.field352 * var5;
		var11.field343 = var6;
		var11.field344 = var4;
		return var5;
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbz;II)I"
	)
	static int method935(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field343 -= var5 * var13.field351;
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
		var13.field343 += var13.field351 * var5;
		var13.field339 = var6;
		var13.field342 = var7;
		var13.field344 = var4;
		return var5;
	}
}
