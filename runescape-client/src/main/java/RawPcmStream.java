import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bq")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ac")
	int field327;
	@ObfuscatedName("ae")
	int field321;
	@ObfuscatedName("ag")
	int field326;
	@ObfuscatedName("am")
	int field322;
	@ObfuscatedName("ax")
	int field320;
	@ObfuscatedName("aq")
	int field324;
	@ObfuscatedName("af")
	int field325;
	@ObfuscatedName("at")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("au")
	@Export("start")
	int start;
	@ObfuscatedName("ar")
	@Export("end")
	int end;
	@ObfuscatedName("al")
	boolean field329;
	@ObfuscatedName("ad")
	int field330;
	@ObfuscatedName("ah")
	int field319;
	@ObfuscatedName("ap")
	int field332;
	@ObfuscatedName("ab")
	int field333;

	@ObfuscatedSignature(
		descriptor = "(Lbg;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field329 = var1.field250;
		this.field321 = var2;
		this.field326 = var3;
		this.field322 = var4;
		this.field327 = 0;
		this.method903();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbg;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field329 = var1.field250;
		this.field321 = var2;
		this.field326 = var3;
		this.field322 = 8192;
		this.field327 = 0;
		this.method903();
	}

	@ObfuscatedName("ax")
	void method903() {
		this.field320 = this.field326;
		this.field324 = method904(this.field326, this.field322);
		this.field325 = method898(this.field326, this.field322);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "()Lbk;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("at")
	protected int vmethod6731() {
		return this.field326 == 0 && this.field330 == 0 ? 0 : 1;
	}

	@ObfuscatedName("au")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field326 == 0 && this.field330 == 0) {
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
			if (this.field327 < 0) {
				if (this.field321 <= 0) {
					this.method912();
					this.remove();
					return;
				}

				this.field327 = 0;
			}

			if (this.field327 >= var7) {
				if (this.field321 >= 0) {
					this.method912();
					this.remove();
					return;
				}

				this.field327 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field329) {
					if (this.field321 < 0) {
						var9 = this.method925(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field327 >= var5) {
							return;
						}

						this.field327 = var5 + var5 - 1 - this.field327;
						this.field321 = -this.field321;
					}

					while (true) {
						var9 = this.method928(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field327 < var6) {
							return;
						}

						this.field327 = var6 + var6 - 1 - this.field327;
						this.field321 = -this.field321;
						var9 = this.method925(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field327 >= var5) {
							return;
						}

						this.field327 = var5 + var5 - 1 - this.field327;
						this.field321 = -this.field321;
					}
				} else if (this.field321 < 0) {
					while (true) {
						var9 = this.method925(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field327 >= var5) {
							return;
						}

						this.field327 = var6 - 1 - (var6 - 1 - this.field327) % var8;
					}
				} else {
					while (true) {
						var9 = this.method928(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field327 < var6) {
							return;
						}

						this.field327 = var5 + (this.field327 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field329) {
						label127: {
							if (this.field321 < 0) {
								var9 = this.method925(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field327 >= var5) {
									return;
								}

								this.field327 = var5 + var5 - 1 - this.field327;
								this.field321 = -this.field321;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method928(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field327 < var6) {
									return;
								}

								this.field327 = var6 + var6 - 1 - this.field327;
								this.field321 = -this.field321;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method925(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field327 >= var5) {
									return;
								}

								this.field327 = var5 + var5 - 1 - this.field327;
								this.field321 = -this.field321;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field321 < 0) {
							while (true) {
								var9 = this.method925(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field327 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field327) / var8;
								if (var10 >= this.numLoops) {
									this.field327 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field327 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method928(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field327 < var6) {
									return;
								}

								var10 = (this.field327 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field327 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field327 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field321 < 0) {
					this.method925(var1, var9, 0, var3, 0);
					if (this.field327 < 0) {
						this.field327 = -1;
						this.method912();
						this.remove();
					}
				} else {
					this.method928(var1, var9, var7, var3, 0);
					if (this.field327 >= var7) {
						this.field327 = var7;
						this.method912();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("ar")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("al")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field330 > 0) {
			if (var1 >= this.field330) {
				if (this.field326 == Integer.MIN_VALUE) {
					this.field326 = 0;
					this.field325 = 0;
					this.field324 = 0;
					this.field320 = 0;
					this.remove();
					var1 = this.field330;
				}

				this.field330 = 0;
				this.method903();
			} else {
				this.field320 += this.field319 * var1;
				this.field324 += this.field332 * var1;
				this.field325 += this.field333 * var1;
				this.field330 -= var1;
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

		if (this.field327 < 0) {
			if (this.field321 <= 0) {
				this.method912();
				this.remove();
				return;
			}

			this.field327 = 0;
		}

		if (this.field327 >= var5) {
			if (this.field321 >= 0) {
				this.method912();
				this.remove();
				return;
			}

			this.field327 = var5 - 1;
		}

		this.field327 += this.field321 * var1;
		if (this.numLoops < 0) {
			if (!this.field329) {
				if (this.field321 < 0) {
					if (this.field327 >= var3) {
						return;
					}

					this.field327 = var4 - 1 - (var4 - 1 - this.field327) % var6;
				} else {
					if (this.field327 < var4) {
						return;
					}

					this.field327 = var3 + (this.field327 - var3) % var6;
				}

			} else {
				if (this.field321 < 0) {
					if (this.field327 >= var3) {
						return;
					}

					this.field327 = var3 + var3 - 1 - this.field327;
					this.field321 = -this.field321;
				}

				while (this.field327 >= var4) {
					this.field327 = var4 + var4 - 1 - this.field327;
					this.field321 = -this.field321;
					if (this.field327 >= var3) {
						return;
					}

					this.field327 = var3 + var3 - 1 - this.field327;
					this.field321 = -this.field321;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field329) {
					label129: {
						if (this.field321 < 0) {
							if (this.field327 >= var3) {
								return;
							}

							this.field327 = var3 + var3 - 1 - this.field327;
							this.field321 = -this.field321;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field327 < var4) {
								return;
							}

							this.field327 = var4 + var4 - 1 - this.field327;
							this.field321 = -this.field321;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field327 >= var3) {
								return;
							}

							this.field327 = var3 + var3 - 1 - this.field327;
							this.field321 = -this.field321;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field321 < 0) {
							if (this.field327 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field327) / var6;
							if (var7 >= this.numLoops) {
								this.field327 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field327 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field327 < var4) {
								return;
							}

							var7 = (this.field327 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field327 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field327 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field321 < 0) {
				if (this.field327 < 0) {
					this.field327 = -1;
					this.method912();
					this.remove();
				}
			} else if (this.field327 >= var5) {
				this.field327 = var5;
				this.method912();
				this.remove();
			}

		}
	}

	@ObfuscatedName("ad")
	public synchronized void method905(int var1) {
		this.method996(var1 << 6, this.method1044());
	}

	@ObfuscatedName("ah")
	synchronized void method906(int var1) {
		this.method996(var1, this.method1044());
	}

	@ObfuscatedName("ap")
	synchronized void method996(int var1, int var2) {
		this.field326 = var1;
		this.field322 = var2;
		this.field330 = 0;
		this.method903();
	}

	@ObfuscatedName("ab")
	public synchronized int method908() {
		return this.field326 == Integer.MIN_VALUE ? 0 : this.field326;
	}

	@ObfuscatedName("az")
	public synchronized int method1044() {
		return this.field322 < 0 ? -1 : this.field322;
	}

	@ObfuscatedName("aa")
	public synchronized void method910(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field327 = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method911() {
		this.field321 = (this.field321 ^ this.field321 >> 31) + (this.field321 >>> 31);
		this.field321 = -this.field321;
	}

	@ObfuscatedName("ao")
	void method912() {
		if (this.field330 != 0) {
			if (this.field326 == Integer.MIN_VALUE) {
				this.field326 = 0;
			}

			this.field330 = 0;
			this.method903();
		}

	}

	@ObfuscatedName("as")
	public synchronized void method993(int var1, int var2) {
		this.method991(var1, var2, this.method1044());
	}

	@ObfuscatedName("ay")
	public synchronized void method991(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method996(var2, var3);
		} else {
			int var4 = method904(var2, var3);
			int var5 = method898(var2, var3);
			if (var4 == this.field324 && var5 == this.field325) {
				this.field330 = 0;
			} else {
				int var6 = var2 - this.field320;
				if (this.field320 - var2 > var6) {
					var6 = this.field320 - var2;
				}

				if (var4 - this.field324 > var6) {
					var6 = var4 - this.field324;
				}

				if (this.field324 - var4 > var6) {
					var6 = this.field324 - var4;
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

				this.field330 = var1;
				this.field326 = var2;
				this.field322 = var3;
				this.field319 = (var2 - this.field320) / var1;
				this.field332 = (var4 - this.field324) / var1;
				this.field333 = (var5 - this.field325) / var1;
			}
		}
	}

	@ObfuscatedName("aj")
	public synchronized void method1045(int var1) {
		if (var1 == 0) {
			this.method906(0);
			this.remove();
		} else if (this.field324 == 0 && this.field325 == 0) {
			this.field330 = 0;
			this.field326 = 0;
			this.field320 = 0;
			this.remove();
		} else {
			int var2 = -this.field320;
			if (this.field320 > var2) {
				var2 = this.field320;
			}

			if (-this.field324 > var2) {
				var2 = -this.field324;
			}

			if (this.field324 > var2) {
				var2 = this.field324;
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

			this.field330 = var1;
			this.field326 = Integer.MIN_VALUE;
			this.field319 = -this.field320 / var1;
			this.field332 = -this.field324 / var1;
			this.field333 = -this.field325 / var1;
		}
	}

	@ObfuscatedName("av")
	public synchronized void method1037(int var1) {
		if (this.field321 < 0) {
			this.field321 = -var1;
		} else {
			this.field321 = var1;
		}

	}

	@ObfuscatedName("aw")
	public synchronized int method917() {
		return this.field321 < 0 ? -this.field321 : this.field321;
	}

	@ObfuscatedName("by")
	public boolean method918() {
		return this.field327 < 0 || this.field327 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bb")
	public boolean method919() {
		return this.field330 != 0;
	}

	@ObfuscatedName("bi")
	int method928(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field330 > 0) {
				int var6 = var2 + this.field330;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field330 += var2;
				if (this.field321 == 256 && (this.field327 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method936(0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, this.field332, this.field333, 0, var6, var3, this);
					} else {
						var2 = method1051(((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, this.field319, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method916(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, this.field332, this.field333, 0, var6, var3, this, this.field321, var5);
				} else {
					var2 = method939(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, this.field319, 0, var6, var3, this, this.field321, var5);
				}

				this.field330 -= var2;
				if (this.field330 != 0) {
					return var2;
				}

				if (!this.method926()) {
					continue;
				}

				return var4;
			}

			if (this.field321 == 256 && (this.field327 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method953(0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, 0, var4, var3, this);
				}

				return method927(((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method932(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, 0, var4, var3, this, this.field321, var5);
			}

			return method931(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, 0, var4, var3, this, this.field321, var5);
		}
	}

	@ObfuscatedName("bg")
	int method925(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field330 > 0) {
				int var6 = var2 + this.field330;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field330 += var2;
				if (this.field321 == -256 && (this.field327 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method938(0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, this.field332, this.field333, 0, var6, var3, this);
					} else {
						var2 = method902(((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, this.field319, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method942(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, this.field332, this.field333, 0, var6, var3, this, this.field321, var5);
				} else {
					var2 = method941(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, this.field319, 0, var6, var3, this, this.field321, var5);
				}

				this.field330 -= var2;
				if (this.field330 != 0) {
					return var2;
				}

				if (!this.method926()) {
					continue;
				}

				return var4;
			}

			if (this.field321 == -256 && (this.field327 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method930(0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, 0, var4, var3, this);
				}

				return method1006(((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method934(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field324, this.field325, 0, var4, var3, this, this.field321, var5);
			}

			return method1004(0, 0, ((RawSound)super.sound).samples, var1, this.field327, var2, this.field320, 0, var4, var3, this, this.field321, var5);
		}
	}

	@ObfuscatedName("br")
	boolean method926() {
		int var1 = this.field326;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method904(var1, this.field322);
			var3 = method898(var1, this.field322);
		}

		if (var1 == this.field320 && var2 == this.field324 && var3 == this.field325) {
			if (this.field326 == Integer.MIN_VALUE) {
				this.field326 = 0;
				this.field325 = 0;
				this.field324 = 0;
				this.field320 = 0;
				this.remove();
				return true;
			} else {
				this.method903();
				return false;
			}
		} else {
			if (this.field320 < var1) {
				this.field319 = 1;
				this.field330 = var1 - this.field320;
			} else if (this.field320 > var1) {
				this.field319 = -1;
				this.field330 = this.field320 - var1;
			} else {
				this.field319 = 0;
			}

			if (this.field324 < var2) {
				this.field332 = 1;
				if (this.field330 == 0 || this.field330 > var2 - this.field324) {
					this.field330 = var2 - this.field324;
				}
			} else if (this.field324 > var2) {
				this.field332 = -1;
				if (this.field330 == 0 || this.field330 > this.field324 - var2) {
					this.field330 = this.field324 - var2;
				}
			} else {
				this.field332 = 0;
			}

			if (this.field325 < var3) {
				this.field333 = 1;
				if (this.field330 == 0 || this.field330 > var3 - this.field325) {
					this.field330 = var3 - this.field325;
				}
			} else if (this.field325 > var3) {
				this.field333 = -1;
				if (this.field330 == 0 || this.field330 > this.field325 - var3) {
					this.field330 = this.field325 - var3;
				}
			} else {
				this.field333 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("bt")
	int vmethod1054() {
		int var1 = this.field320 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field327 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("ac")
	static int method904(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ae")
	static int method898(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lbg;II)Lbq;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field270 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lbg;III)Lbq;"
	)
	public static RawPcmStream method1007(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbq;)I"
	)
	static int method927(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field327 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbq;)I"
	)
	static int method953(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field327 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbq;)I"
	)
	static int method1006(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field327 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbq;)I"
	)
	static int method930(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field327 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbq;II)I"
	)
	static int method931(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field327 = var4;
		return var5;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbq;II)I"
	)
	static int method932(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field327 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbq;II)I"
	)
	static int method1004(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field327 = var4;
		return var5;
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbq;II)I"
	)
	static int method934(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field327 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbq;)I"
	)
	static int method1051(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field324 += var9.field332 * (var6 - var3);
		var9.field325 += var9.field333 * (var6 - var3);

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

		var9.field320 = var4 >> 2;
		var9.field327 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbq;)I"
	)
	static int method936(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field320 += var12.field319 * (var9 - var4);
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

		var12.field324 = var5 >> 2;
		var12.field325 = var6 >> 2;
		var12.field327 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbq;)I"
	)
	static int method902(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field324 += var9.field332 * (var6 - var3);
		var9.field325 += var9.field333 * (var6 - var3);

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

		var9.field320 = var4 >> 2;
		var9.field327 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbq;)I"
	)
	static int method938(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field320 += var12.field319 * (var9 - var4);
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

		var12.field324 = var5 >> 2;
		var12.field325 = var6 >> 2;
		var12.field327 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbq;II)I"
	)
	static int method939(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field324 -= var11.field332 * var5;
		var11.field325 -= var11.field333 * var5;
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

		var11.field324 += var11.field332 * var5;
		var11.field325 += var11.field333 * var5;
		var11.field320 = var6;
		var11.field327 = var4;
		return var5;
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbq;II)I"
	)
	static int method916(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field320 -= var5 * var13.field319;
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
		var13.field320 += var13.field319 * var5;
		var13.field324 = var6;
		var13.field325 = var7;
		var13.field327 = var4;
		return var5;
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbq;II)I"
	)
	static int method941(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field324 -= var11.field332 * var5;
		var11.field325 -= var11.field333 * var5;
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

		var11.field324 += var11.field332 * var5;
		var11.field325 += var11.field333 * var5;
		var11.field320 = var6;
		var11.field327 = var4;
		return var5;
	}

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbq;II)I"
	)
	static int method942(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field320 -= var5 * var13.field319;
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
		var13.field320 += var13.field319 * var5;
		var13.field324 = var6;
		var13.field325 = var7;
		var13.field327 = var4;
		return var5;
	}
}
