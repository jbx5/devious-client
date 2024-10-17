import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bf")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("ap")
	int field314;
	@ObfuscatedName("aw")
	int field311;
	@ObfuscatedName("ak")
	int field312;
	@ObfuscatedName("aj")
	int field323;
	@ObfuscatedName("ai")
	int field322;
	@ObfuscatedName("ay")
	int field315;
	@ObfuscatedName("as")
	int field316;
	@ObfuscatedName("ae")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("am")
	@Export("start")
	int start;
	@ObfuscatedName("at")
	@Export("end")
	int end;
	@ObfuscatedName("au")
	boolean field319;
	@ObfuscatedName("an")
	int field310;
	@ObfuscatedName("ao")
	int field317;
	@ObfuscatedName("af")
	int field321;
	@ObfuscatedName("ar")
	int field324;

	@ObfuscatedSignature(
		descriptor = "(Lbt;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field319 = var1.field240;
		this.field311 = var2;
		this.field312 = var3;
		this.field323 = var4;
		this.field314 = 0;
		this.method902();
	}

	@ObfuscatedSignature(
		descriptor = "(Lbt;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field319 = var1.field240;
		this.field311 = var2;
		this.field312 = var3;
		this.field323 = 8192;
		this.field314 = 0;
		this.method902();
	}

	@ObfuscatedName("ai")
	void method902() {
		this.field322 = this.field312;
		this.field315 = method1026(this.field312, this.field323);
		this.field316 = method898(this.field312, this.field323);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "()Lbg;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("ae")
	protected int vmethod6791() {
		return this.field312 == 0 && this.field310 == 0 ? 0 : 1;
	}

	@ObfuscatedName("am")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field312 == 0 && this.field310 == 0) {
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
			if (this.field314 < 0) {
				if (this.field311 <= 0) {
					this.method911();
					this.remove();
					return;
				}

				this.field314 = 0;
			}

			if (this.field314 >= var7) {
				if (this.field311 >= 0) {
					this.method911();
					this.remove();
					return;
				}

				this.field314 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field319) {
					if (this.field311 < 0) {
						var9 = this.method1030(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field314 >= var5) {
							return;
						}

						this.field314 = var5 + var5 - 1 - this.field314;
						this.field311 = -this.field311;
					}

					while (true) {
						var9 = this.method929(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field314 < var6) {
							return;
						}

						this.field314 = var6 + var6 - 1 - this.field314;
						this.field311 = -this.field311;
						var9 = this.method1030(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field314 >= var5) {
							return;
						}

						this.field314 = var5 + var5 - 1 - this.field314;
						this.field311 = -this.field311;
					}
				} else if (this.field311 < 0) {
					while (true) {
						var9 = this.method1030(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field314 >= var5) {
							return;
						}

						this.field314 = var6 - 1 - (var6 - 1 - this.field314) % var8;
					}
				} else {
					while (true) {
						var9 = this.method929(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field314 < var6) {
							return;
						}

						this.field314 = var5 + (this.field314 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field319) {
						label127: {
							if (this.field311 < 0) {
								var9 = this.method1030(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field314 >= var5) {
									return;
								}

								this.field314 = var5 + var5 - 1 - this.field314;
								this.field311 = -this.field311;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method929(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field314 < var6) {
									return;
								}

								this.field314 = var6 + var6 - 1 - this.field314;
								this.field311 = -this.field311;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method1030(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field314 >= var5) {
									return;
								}

								this.field314 = var5 + var5 - 1 - this.field314;
								this.field311 = -this.field311;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field311 < 0) {
							while (true) {
								var9 = this.method1030(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field314 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field314) / var8;
								if (var10 >= this.numLoops) {
									this.field314 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field314 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method929(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field314 < var6) {
									return;
								}

								var10 = (this.field314 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field314 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field314 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field311 < 0) {
					this.method1030(var1, var9, 0, var3, 0);
					if (this.field314 < 0) {
						this.field314 = -1;
						this.method911();
						this.remove();
					}
				} else {
					this.method929(var1, var9, var7, var3, 0);
					if (this.field314 >= var7) {
						this.field314 = var7;
						this.method911();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("at")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("au")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field310 > 0) {
			if (var1 >= this.field310) {
				if (this.field312 == Integer.MIN_VALUE) {
					this.field312 = 0;
					this.field316 = 0;
					this.field315 = 0;
					this.field322 = 0;
					this.remove();
					var1 = this.field310;
				}

				this.field310 = 0;
				this.method902();
			} else {
				this.field322 += this.field317 * var1;
				this.field315 += this.field321 * var1;
				this.field316 += this.field324 * var1;
				this.field310 -= var1;
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

		if (this.field314 < 0) {
			if (this.field311 <= 0) {
				this.method911();
				this.remove();
				return;
			}

			this.field314 = 0;
		}

		if (this.field314 >= var5) {
			if (this.field311 >= 0) {
				this.method911();
				this.remove();
				return;
			}

			this.field314 = var5 - 1;
		}

		this.field314 += this.field311 * var1;
		if (this.numLoops < 0) {
			if (!this.field319) {
				if (this.field311 < 0) {
					if (this.field314 >= var3) {
						return;
					}

					this.field314 = var4 - 1 - (var4 - 1 - this.field314) % var6;
				} else {
					if (this.field314 < var4) {
						return;
					}

					this.field314 = var3 + (this.field314 - var3) % var6;
				}

			} else {
				if (this.field311 < 0) {
					if (this.field314 >= var3) {
						return;
					}

					this.field314 = var3 + var3 - 1 - this.field314;
					this.field311 = -this.field311;
				}

				while (this.field314 >= var4) {
					this.field314 = var4 + var4 - 1 - this.field314;
					this.field311 = -this.field311;
					if (this.field314 >= var3) {
						return;
					}

					this.field314 = var3 + var3 - 1 - this.field314;
					this.field311 = -this.field311;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field319) {
					label129: {
						if (this.field311 < 0) {
							if (this.field314 >= var3) {
								return;
							}

							this.field314 = var3 + var3 - 1 - this.field314;
							this.field311 = -this.field311;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field314 < var4) {
								return;
							}

							this.field314 = var4 + var4 - 1 - this.field314;
							this.field311 = -this.field311;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field314 >= var3) {
								return;
							}

							this.field314 = var3 + var3 - 1 - this.field314;
							this.field311 = -this.field311;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field311 < 0) {
							if (this.field314 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field314) / var6;
							if (var7 >= this.numLoops) {
								this.field314 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field314 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field314 < var4) {
								return;
							}

							var7 = (this.field314 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field314 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field314 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field311 < 0) {
				if (this.field314 < 0) {
					this.field314 = -1;
					this.method911();
					this.remove();
				}
			} else if (this.field314 >= var5) {
				this.field314 = var5;
				this.method911();
				this.remove();
			}

		}
	}

	@ObfuscatedName("an")
	public synchronized void method904(int var1) {
		this.method906(var1 << 6, this.method908());
	}

	@ObfuscatedName("ao")
	synchronized void method905(int var1) {
		this.method906(var1, this.method908());
	}

	@ObfuscatedName("af")
	synchronized void method906(int var1, int var2) {
		this.field312 = var1;
		this.field323 = var2;
		this.field310 = 0;
		this.method902();
	}

	@ObfuscatedName("ar")
	public synchronized int method1028() {
		return this.field312 == Integer.MIN_VALUE ? 0 : this.field312;
	}

	@ObfuscatedName("ab")
	public synchronized int method908() {
		return this.field323 < 0 ? -1 : this.field323;
	}

	@ObfuscatedName("az")
	public synchronized void method915(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field314 = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method1049() {
		this.field311 = (this.field311 ^ this.field311 >> 31) + (this.field311 >>> 31);
		this.field311 = -this.field311;
	}

	@ObfuscatedName("ad")
	void method911() {
		if (this.field310 != 0) {
			if (this.field312 == Integer.MIN_VALUE) {
				this.field312 = 0;
			}

			this.field310 = 0;
			this.method902();
		}

	}

	@ObfuscatedName("ac")
	public synchronized void method912(int var1, int var2) {
		this.method913(var1, var2, this.method908());
	}

	@ObfuscatedName("av")
	public synchronized void method913(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method906(var2, var3);
		} else {
			int var4 = method1026(var2, var3);
			int var5 = method898(var2, var3);
			if (var4 == this.field315 && var5 == this.field316) {
				this.field310 = 0;
			} else {
				int var6 = var2 - this.field322;
				if (this.field322 - var2 > var6) {
					var6 = this.field322 - var2;
				}

				if (var4 - this.field315 > var6) {
					var6 = var4 - this.field315;
				}

				if (this.field315 - var4 > var6) {
					var6 = this.field315 - var4;
				}

				if (var5 - this.field316 > var6) {
					var6 = var5 - this.field316;
				}

				if (this.field316 - var5 > var6) {
					var6 = this.field316 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field310 = var1;
				this.field312 = var2;
				this.field323 = var3;
				this.field317 = (var2 - this.field322) / var1;
				this.field321 = (var4 - this.field315) / var1;
				this.field324 = (var5 - this.field316) / var1;
			}
		}
	}

	@ObfuscatedName("ax")
	public synchronized void method1040(int var1) {
		if (var1 == 0) {
			this.method905(0);
			this.remove();
		} else if (this.field315 == 0 && this.field316 == 0) {
			this.field310 = 0;
			this.field312 = 0;
			this.field322 = 0;
			this.remove();
		} else {
			int var2 = -this.field322;
			if (this.field322 > var2) {
				var2 = this.field322;
			}

			if (-this.field315 > var2) {
				var2 = -this.field315;
			}

			if (this.field315 > var2) {
				var2 = this.field315;
			}

			if (-this.field316 > var2) {
				var2 = -this.field316;
			}

			if (this.field316 > var2) {
				var2 = this.field316;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field310 = var1;
			this.field312 = Integer.MIN_VALUE;
			this.field317 = -this.field322 / var1;
			this.field321 = -this.field315 / var1;
			this.field324 = -this.field316 / var1;
		}
	}

	@ObfuscatedName("aq")
	public synchronized void method1022(int var1) {
		if (this.field311 < 0) {
			this.field311 = -var1;
		} else {
			this.field311 = var1;
		}

	}

	@ObfuscatedName("al")
	public synchronized int method1000() {
		return this.field311 < 0 ? -this.field311 : this.field311;
	}

	@ObfuscatedName("bb")
	public boolean method917() {
		return this.field314 < 0 || this.field314 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("bq")
	public boolean method918() {
		return this.field310 != 0;
	}

	@ObfuscatedName("bp")
	int method929(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field310 > 0) {
				int var6 = var2 + this.field310;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field310 += var2;
				if (this.field311 == 256 && (this.field314 & 255) == 0) {
					if (class550.PcmPlayer_stereo) {
						var2 = method999(0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, this.field321, this.field324, 0, var6, var3, this);
					} else {
						var2 = method935(((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, this.field317, 0, var6, var3, this);
					}
				} else if (class550.PcmPlayer_stereo) {
					var2 = method1029(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, this.field321, this.field324, 0, var6, var3, this, this.field311, var5);
				} else {
					var2 = method939(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, this.field317, 0, var6, var3, this, this.field311, var5);
				}

				this.field310 -= var2;
				if (this.field310 != 0) {
					return var2;
				}

				if (!this.method926()) {
					continue;
				}

				return var4;
			}

			if (this.field311 == 256 && (this.field314 & 255) == 0) {
				if (class550.PcmPlayer_stereo) {
					return method924(0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, 0, var4, var3, this);
				}

				return method927(((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, 0, var4, var3, this);
			}

			if (class550.PcmPlayer_stereo) {
				return method932(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, 0, var4, var3, this, this.field311, var5);
			}

			return method969(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, 0, var4, var3, this, this.field311, var5);
		}
	}

	@ObfuscatedName("by")
	int method1030(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field310 > 0) {
				int var6 = var2 + this.field310;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field310 += var2;
				if (this.field311 == -256 && (this.field314 & 255) == 0) {
					if (class550.PcmPlayer_stereo) {
						var2 = method938(0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, this.field321, this.field324, 0, var6, var3, this);
					} else {
						var2 = method937(((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, this.field317, 0, var6, var3, this);
					}
				} else if (class550.PcmPlayer_stereo) {
					var2 = method942(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, this.field321, this.field324, 0, var6, var3, this, this.field311, var5);
				} else {
					var2 = method941(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, this.field317, 0, var6, var3, this, this.field311, var5);
				}

				this.field310 -= var2;
				if (this.field310 != 0) {
					return var2;
				}

				if (!this.method926()) {
					continue;
				}

				return var4;
			}

			if (this.field311 == -256 && (this.field314 & 255) == 0) {
				if (class550.PcmPlayer_stereo) {
					return method930(0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, 0, var4, var3, this);
				}

				return method1042(((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, 0, var4, var3, this);
			}

			if (class550.PcmPlayer_stereo) {
				return method949(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field315, this.field316, 0, var4, var3, this, this.field311, var5);
			}

			return method933(0, 0, ((RawSound)super.sound).samples, var1, this.field314, var2, this.field322, 0, var4, var3, this, this.field311, var5);
		}
	}

	@ObfuscatedName("br")
	boolean method926() {
		int var1 = this.field312;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method1026(var1, this.field323);
			var3 = method898(var1, this.field323);
		}

		if (var1 == this.field322 && var2 == this.field315 && var3 == this.field316) {
			if (this.field312 == Integer.MIN_VALUE) {
				this.field312 = 0;
				this.field316 = 0;
				this.field315 = 0;
				this.field322 = 0;
				this.remove();
				return true;
			} else {
				this.method902();
				return false;
			}
		} else {
			if (this.field322 < var1) {
				this.field317 = 1;
				this.field310 = var1 - this.field322;
			} else if (this.field322 > var1) {
				this.field317 = -1;
				this.field310 = this.field322 - var1;
			} else {
				this.field317 = 0;
			}

			if (this.field315 < var2) {
				this.field321 = 1;
				if (this.field310 == 0 || this.field310 > var2 - this.field315) {
					this.field310 = var2 - this.field315;
				}
			} else if (this.field315 > var2) {
				this.field321 = -1;
				if (this.field310 == 0 || this.field310 > this.field315 - var2) {
					this.field310 = this.field315 - var2;
				}
			} else {
				this.field321 = 0;
			}

			if (this.field316 < var3) {
				this.field324 = 1;
				if (this.field310 == 0 || this.field310 > var3 - this.field316) {
					this.field310 = var3 - this.field316;
				}
			} else if (this.field316 > var3) {
				this.field324 = -1;
				if (this.field310 == 0 || this.field310 > this.field316 - var3) {
					this.field310 = this.field316 - var3;
				}
			} else {
				this.field324 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("bt")
	int vmethod1061() {
		int var1 = this.field322 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field314 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("ap")
	static int method1026(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("aw")
	static int method898(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lbt;II)Lbf;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(ArchiveLoader.field1059 * 664191268)), var2 << 6) : null;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lbt;III)Lbf;"
	)
	public static RawPcmStream method901(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbf;)I"
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

		var8.field314 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbf;)I"
	)
	static int method924(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

		var10.field314 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbf;)I"
	)
	static int method1042(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

		var8.field314 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbf;)I"
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

		var10.field314 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbf;II)I"
	)
	static int method969(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field314 = var4;
		return var5;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbf;II)I"
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

		var11.field314 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbf;II)I"
	)
	static int method933(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

		var10.field314 = var4;
		return var5;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbf;II)I"
	)
	static int method949(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

		var11.field314 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbf;)I"
	)
	static int method935(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field315 += var9.field321 * (var6 - var3);
		var9.field316 += var9.field324 * (var6 - var3);

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

		var9.field322 = var4 >> 2;
		var9.field314 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbf;)I"
	)
	static int method999(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field322 += var12.field317 * (var9 - var4);
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

		var12.field315 = var5 >> 2;
		var12.field316 = var6 >> 2;
		var12.field314 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbf;)I"
	)
	static int method937(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field315 += var9.field321 * (var6 - var3);
		var9.field316 += var9.field324 * (var6 - var3);

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

		var9.field322 = var4 >> 2;
		var9.field314 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbf;)I"
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

		var12.field322 += var12.field317 * (var9 - var4);
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

		var12.field315 = var5 >> 2;
		var12.field316 = var6 >> 2;
		var12.field314 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbf;II)I"
	)
	static int method939(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field315 -= var11.field321 * var5;
		var11.field316 -= var11.field324 * var5;
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

		var11.field315 += var11.field321 * var5;
		var11.field316 += var11.field324 * var5;
		var11.field322 = var6;
		var11.field314 = var4;
		return var5;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbf;II)I"
	)
	static int method1029(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field322 -= var5 * var13.field317;
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
		var13.field322 += var13.field317 * var5;
		var13.field315 = var6;
		var13.field316 = var7;
		var13.field314 = var4;
		return var5;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbf;II)I"
	)
	static int method941(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field315 -= var11.field321 * var5;
		var11.field316 -= var11.field324 * var5;
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

		var11.field315 += var11.field321 * var5;
		var11.field316 += var11.field324 * var5;
		var11.field322 = var6;
		var11.field314 = var4;
		return var5;
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbf;II)I"
	)
	static int method942(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field322 -= var5 * var13.field317;
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
		var13.field322 += var13.field317 * var5;
		var13.field315 = var6;
		var13.field316 = var7;
		var13.field314 = var4;
		return var5;
	}
}
