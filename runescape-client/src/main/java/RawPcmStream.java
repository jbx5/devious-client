import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bu")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
   @ObfuscatedName("at")
   int field345;
   @ObfuscatedName("an")
   int field338;
   @ObfuscatedName("av")
   int field339;
   @ObfuscatedName("as")
   int field340;
   @ObfuscatedName("ax")
   int field341;
   @ObfuscatedName("ap")
   int field342;
   @ObfuscatedName("ab")
   int field343;
   @ObfuscatedName("ak")
   @Export("numLoops")
   int numLoops;
   @ObfuscatedName("ae")
   @Export("start")
   int start;
   @ObfuscatedName("af")
   @Export("end")
   int end;
   @ObfuscatedName("ao")
   boolean field347;
   @ObfuscatedName("aa")
   int field350;
   @ObfuscatedName("aj")
   int field349;
   @ObfuscatedName("ad")
   int field348;
   @ObfuscatedName("ac")
   int field351;

   @ObfuscatedSignature(
      descriptor = "(Lbp;III)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3, int var4) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field347 = var1.field267;
      this.field338 = var2;
      this.field339 = var3;
      this.field340 = var4;
      this.field345 = 0;
      this.method851();
   }

   @ObfuscatedSignature(
      descriptor = "(Lbp;II)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field347 = var1.field267;
      this.field338 = var2;
      this.field339 = var3;
      this.field340 = 8192;
      this.field345 = 0;
      this.method851();
   }

   @ObfuscatedName("ax")
   void method851() {
      this.field341 = this.field339;
      this.field342 = method930(this.field339, this.field340);
      this.field343 = method847(this.field339, this.field340);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "()Lby;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "()Lby;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("ak")
   protected int vmethod5920() {
      return this.field339 == 0 && this.field350 == 0 ? 0 : 1;
   }

   @ObfuscatedName("ae")
   @Export("fill")
   public synchronized void fill(int[] var1, int var2, int var3) {
      if (this.field339 == 0 && this.field350 == 0) {
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
         if (this.field345 < 0) {
            if (this.field338 <= 0) {
               this.method903();
               this.remove();
               return;
            }

            this.field345 = 0;
         }

         if (this.field345 >= var7) {
            if (this.field338 >= 0) {
               this.method903();
               this.remove();
               return;
            }

            this.field345 = var7 - 1;
         }

         if (this.numLoops < 0) {
            if (this.field347) {
               if (this.field338 < 0) {
                  var9 = this.method874(var1, var2, var5, var3, var4.samples[this.start]);
                  if (this.field345 >= var5) {
                     return;
                  }

                  this.field345 = var5 + var5 - 1 - this.field345;
                  this.field338 = -this.field338;
               }

               while(true) {
                  var9 = this.method873(var1, var9, var6, var3, var4.samples[this.end - 1]);
                  if (this.field345 < var6) {
                     return;
                  }

                  this.field345 = var6 + var6 - 1 - this.field345;
                  this.field338 = -this.field338;
                  var9 = this.method874(var1, var9, var5, var3, var4.samples[this.start]);
                  if (this.field345 >= var5) {
                     return;
                  }

                  this.field345 = var5 + var5 - 1 - this.field345;
                  this.field338 = -this.field338;
               }
            } else if (this.field338 < 0) {
               while(true) {
                  var9 = this.method874(var1, var9, var5, var3, var4.samples[this.end - 1]);
                  if (this.field345 >= var5) {
                     return;
                  }

                  this.field345 = var6 - 1 - (var6 - 1 - this.field345) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method873(var1, var9, var6, var3, var4.samples[this.start]);
                  if (this.field345 < var6) {
                     return;
                  }

                  this.field345 = var5 + (this.field345 - var5) % var8;
               }
            }
         } else {
            if (this.numLoops > 0) {
               if (this.field347) {
                  label127: {
                     if (this.field338 < 0) {
                        var9 = this.method874(var1, var2, var5, var3, var4.samples[this.start]);
                        if (this.field345 >= var5) {
                           return;
                        }

                        this.field345 = var5 + var5 - 1 - this.field345;
                        this.field338 = -this.field338;
                        if (--this.numLoops == 0) {
                           break label127;
                        }
                     }

                     do {
                        var9 = this.method873(var1, var9, var6, var3, var4.samples[this.end - 1]);
                        if (this.field345 < var6) {
                           return;
                        }

                        this.field345 = var6 + var6 - 1 - this.field345;
                        this.field338 = -this.field338;
                        if (--this.numLoops == 0) {
                           break;
                        }

                        var9 = this.method874(var1, var9, var5, var3, var4.samples[this.start]);
                        if (this.field345 >= var5) {
                           return;
                        }

                        this.field345 = var5 + var5 - 1 - this.field345;
                        this.field338 = -this.field338;
                     } while(--this.numLoops != 0);
                  }
               } else {
                  int var10;
                  if (this.field338 < 0) {
                     while(true) {
                        var9 = this.method874(var1, var9, var5, var3, var4.samples[this.end - 1]);
                        if (this.field345 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field345) / var8;
                        if (var10 >= this.numLoops) {
                           this.field345 += var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field345 += var8 * var10;
                        this.numLoops -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method873(var1, var9, var6, var3, var4.samples[this.start]);
                        if (this.field345 < var6) {
                           return;
                        }

                        var10 = (this.field345 - var5) / var8;
                        if (var10 >= this.numLoops) {
                           this.field345 -= var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field345 -= var8 * var10;
                        this.numLoops -= var10;
                     }
                  }
               }
            }

            if (this.field338 < 0) {
               this.method874(var1, var9, 0, var3, 0);
               if (this.field345 < 0) {
                  this.field345 = -1;
                  this.method903();
                  this.remove();
               }
            } else {
               this.method873(var1, var9, var7, var3, 0);
               if (this.field345 >= var7) {
                  this.field345 = var7;
                  this.method903();
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

   @ObfuscatedName("ao")
   @Export("skip")
   public synchronized void skip(int var1) {
      if (this.field350 > 0) {
         if (var1 >= this.field350) {
            if (this.field339 == Integer.MIN_VALUE) {
               this.field339 = 0;
               this.field343 = 0;
               this.field342 = 0;
               this.field341 = 0;
               this.remove();
               var1 = this.field350;
            }

            this.field350 = 0;
            this.method851();
         } else {
            this.field341 += this.field349 * var1;
            this.field342 += this.field348 * var1;
            this.field343 += this.field351 * var1;
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

      if (this.field345 < 0) {
         if (this.field338 <= 0) {
            this.method903();
            this.remove();
            return;
         }

         this.field345 = 0;
      }

      if (this.field345 >= var5) {
         if (this.field338 >= 0) {
            this.method903();
            this.remove();
            return;
         }

         this.field345 = var5 - 1;
      }

      this.field345 += this.field338 * var1;
      if (this.numLoops < 0) {
         if (!this.field347) {
            if (this.field338 < 0) {
               if (this.field345 >= var3) {
                  return;
               }

               this.field345 = var4 - 1 - (var4 - 1 - this.field345) % var6;
            } else {
               if (this.field345 < var4) {
                  return;
               }

               this.field345 = var3 + (this.field345 - var3) % var6;
            }

         } else {
            if (this.field338 < 0) {
               if (this.field345 >= var3) {
                  return;
               }

               this.field345 = var3 + var3 - 1 - this.field345;
               this.field338 = -this.field338;
            }

            while(this.field345 >= var4) {
               this.field345 = var4 + var4 - 1 - this.field345;
               this.field338 = -this.field338;
               if (this.field345 >= var3) {
                  return;
               }

               this.field345 = var3 + var3 - 1 - this.field345;
               this.field338 = -this.field338;
            }

         }
      } else {
         if (this.numLoops > 0) {
            if (this.field347) {
               label129: {
                  if (this.field338 < 0) {
                     if (this.field345 >= var3) {
                        return;
                     }

                     this.field345 = var3 + var3 - 1 - this.field345;
                     this.field338 = -this.field338;
                     if (--this.numLoops == 0) {
                        break label129;
                     }
                  }

                  do {
                     if (this.field345 < var4) {
                        return;
                     }

                     this.field345 = var4 + var4 - 1 - this.field345;
                     this.field338 = -this.field338;
                     if (--this.numLoops == 0) {
                        break;
                     }

                     if (this.field345 >= var3) {
                        return;
                     }

                     this.field345 = var3 + var3 - 1 - this.field345;
                     this.field338 = -this.field338;
                  } while(--this.numLoops != 0);
               }
            } else {
               label161: {
                  int var7;
                  if (this.field338 < 0) {
                     if (this.field345 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field345) / var6;
                     if (var7 >= this.numLoops) {
                        this.field345 += var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field345 += var6 * var7;
                     this.numLoops -= var7;
                  } else {
                     if (this.field345 < var4) {
                        return;
                     }

                     var7 = (this.field345 - var3) / var6;
                     if (var7 >= this.numLoops) {
                        this.field345 -= var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field345 -= var6 * var7;
                     this.numLoops -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field338 < 0) {
            if (this.field345 < 0) {
               this.field345 = -1;
               this.method903();
               this.remove();
            }
         } else if (this.field345 >= var5) {
            this.field345 = var5;
            this.method903();
            this.remove();
         }

      }
   }

   @ObfuscatedName("aa")
   public synchronized void method853(int var1) {
      this.method875(var1 << 6, this.method857());
   }

   @ObfuscatedName("aj")
   synchronized void method942(int var1) {
      this.method875(var1, this.method857());
   }

   @ObfuscatedName("ad")
   synchronized void method875(int var1, int var2) {
      this.field339 = var1;
      this.field340 = var2;
      this.field350 = 0;
      this.method851();
   }

   @ObfuscatedName("ac")
   public synchronized int method856() {
      return this.field339 == Integer.MIN_VALUE ? 0 : this.field339;
   }

   @ObfuscatedName("ag")
   public synchronized int method857() {
      return this.field340 < 0 ? -1 : this.field340;
   }

   @ObfuscatedName("ar")
   public synchronized void method858(int var1) {
      int var2 = ((RawSound)super.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field345 = var1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method859() {
      this.field338 = (this.field338 ^ this.field338 >> 31) + (this.field338 >>> 31);
      this.field338 = -this.field338;
   }

   @ObfuscatedName("az")
   void method903() {
      if (this.field350 != 0) {
         if (this.field339 == Integer.MIN_VALUE) {
            this.field339 = 0;
         }

         this.field350 = 0;
         this.method851();
      }

   }

   @ObfuscatedName("au")
   public synchronized void method910(int var1, int var2) {
      this.method862(var1, var2, this.method857());
   }

   @ObfuscatedName("ai")
   public synchronized void method862(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method875(var2, var3);
      } else {
         int var4 = method930(var2, var3);
         int var5 = method847(var2, var3);
         if (var4 == this.field342 && var5 == this.field343) {
            this.field350 = 0;
         } else {
            int var6 = var2 - this.field341;
            if (this.field341 - var2 > var6) {
               var6 = this.field341 - var2;
            }

            if (var4 - this.field342 > var6) {
               var6 = var4 - this.field342;
            }

            if (this.field342 - var4 > var6) {
               var6 = this.field342 - var4;
            }

            if (var5 - this.field343 > var6) {
               var6 = var5 - this.field343;
            }

            if (this.field343 - var5 > var6) {
               var6 = this.field343 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field350 = var1;
            this.field339 = var2;
            this.field340 = var3;
            this.field349 = (var2 - this.field341) / var1;
            this.field348 = (var4 - this.field342) / var1;
            this.field351 = (var5 - this.field343) / var1;
         }
      }
   }

   @ObfuscatedName("aq")
   public synchronized void method863(int var1) {
      if (var1 == 0) {
         this.method942(0);
         this.remove();
      } else if (this.field342 == 0 && this.field343 == 0) {
         this.field350 = 0;
         this.field339 = 0;
         this.field341 = 0;
         this.remove();
      } else {
         int var2 = -this.field341;
         if (this.field341 > var2) {
            var2 = this.field341;
         }

         if (-this.field342 > var2) {
            var2 = -this.field342;
         }

         if (this.field342 > var2) {
            var2 = this.field342;
         }

         if (-this.field343 > var2) {
            var2 = -this.field343;
         }

         if (this.field343 > var2) {
            var2 = this.field343;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field350 = var1;
         this.field339 = Integer.MIN_VALUE;
         this.field349 = -this.field341 / var1;
         this.field348 = -this.field342 / var1;
         this.field351 = -this.field343 / var1;
      }
   }

   @ObfuscatedName("aw")
   public synchronized void method864(int var1) {
      if (this.field338 < 0) {
         this.field338 = -var1;
      } else {
         this.field338 = var1;
      }

   }

   @ObfuscatedName("ay")
   public synchronized int method865() {
      return this.field338 < 0 ? -this.field338 : this.field338;
   }

   @ObfuscatedName("al")
   public boolean method951() {
      return this.field345 < 0 || this.field345 >= ((RawSound)super.sound).samples.length << 8;
   }

   @ObfuscatedName("am")
   public boolean method944() {
      return this.field350 != 0;
   }

   @ObfuscatedName("bp")
   int method873(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field350 > 0) {
            int var6 = var2 + this.field350;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field350 += var2;
            if (this.field338 == 256 && (this.field345 & 255) == 0) {
               if (class347.PcmPlayer_stereo) {
                  var2 = method922(0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, this.field348, this.field351, 0, var6, var3, this);
               } else {
                  var2 = method884(((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, this.field349, 0, var6, var3, this);
               }
            } else if (class347.PcmPlayer_stereo) {
               var2 = method871(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, this.field348, this.field351, 0, var6, var3, this, this.field338, var5);
            } else {
               var2 = method888(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, this.field349, 0, var6, var3, this, this.field338, var5);
            }

            this.field350 -= var2;
            if (this.field350 != 0) {
               return var2;
            }

            if (!this.method977()) {
               continue;
            }

            return var4;
         }

         if (this.field338 == 256 && (this.field345 & 255) == 0) {
            if (class347.PcmPlayer_stereo) {
               return method877(0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, 0, var4, var3, this);
            }

            return method913(((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, 0, var4, var3, this);
         }

         if (class347.PcmPlayer_stereo) {
            return method881(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, 0, var4, var3, this, this.field338, var5);
         }

         return method880(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, 0, var4, var3, this, this.field338, var5);
      }
   }

   @ObfuscatedName("bw")
   int method874(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field350 > 0) {
            int var6 = var2 + this.field350;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field350 += var2;
            if (this.field338 == -256 && (this.field345 & 255) == 0) {
               if (class347.PcmPlayer_stereo) {
                  var2 = method887(0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, this.field348, this.field351, 0, var6, var3, this);
               } else {
                  var2 = method956(((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, this.field349, 0, var6, var3, this);
               }
            } else if (class347.PcmPlayer_stereo) {
               var2 = method891(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, this.field348, this.field351, 0, var6, var3, this, this.field338, var5);
            } else {
               var2 = method890(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, this.field349, 0, var6, var3, this, this.field338, var5);
            }

            this.field350 -= var2;
            if (this.field350 != 0) {
               return var2;
            }

            if (!this.method977()) {
               continue;
            }

            return var4;
         }

         if (this.field338 == -256 && (this.field345 & 255) == 0) {
            if (class347.PcmPlayer_stereo) {
               return method879(0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, 0, var4, var3, this);
            }

            return method878(((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, 0, var4, var3, this);
         }

         if (class347.PcmPlayer_stereo) {
            return method883(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field342, this.field343, 0, var4, var3, this, this.field338, var5);
         }

         return method882(0, 0, ((RawSound)super.sound).samples, var1, this.field345, var2, this.field341, 0, var4, var3, this, this.field338, var5);
      }
   }

   @ObfuscatedName("bk")
   boolean method977() {
      int var1 = this.field339;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method930(var1, this.field340);
         var3 = method847(var1, this.field340);
      }

      if (var1 == this.field341 && var2 == this.field342 && var3 == this.field343) {
         if (this.field339 == Integer.MIN_VALUE) {
            this.field339 = 0;
            this.field343 = 0;
            this.field342 = 0;
            this.field341 = 0;
            this.remove();
            return true;
         } else {
            this.method851();
            return false;
         }
      } else {
         if (this.field341 < var1) {
            this.field349 = 1;
            this.field350 = var1 - this.field341;
         } else if (this.field341 > var1) {
            this.field349 = -1;
            this.field350 = this.field341 - var1;
         } else {
            this.field349 = 0;
         }

         if (this.field342 < var2) {
            this.field348 = 1;
            if (this.field350 == 0 || this.field350 > var2 - this.field342) {
               this.field350 = var2 - this.field342;
            }
         } else if (this.field342 > var2) {
            this.field348 = -1;
            if (this.field350 == 0 || this.field350 > this.field342 - var2) {
               this.field350 = this.field342 - var2;
            }
         } else {
            this.field348 = 0;
         }

         if (this.field343 < var3) {
            this.field351 = 1;
            if (this.field350 == 0 || this.field350 > var3 - this.field343) {
               this.field350 = var3 - this.field343;
            }
         } else if (this.field343 > var3) {
            this.field351 = -1;
            if (this.field350 == 0 || this.field350 > this.field343 - var3) {
               this.field350 = this.field343 - var3;
            }
         } else {
            this.field351 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("bz")
   int vmethod1017() {
      int var1 = this.field341 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.numLoops == 0) {
         var1 -= var1 * this.field345 / (((RawSound)super.sound).samples.length << 8);
      } else if (this.numLoops >= 0) {
         var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedName("at")
   static int method930(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("an")
   static int method847(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lbp;II)Lbu;"
   )
   @Export("createRawPcmStream")
   public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field291 * 100)), var2 << 6) : null;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lbp;III)Lbu;"
   )
   public static RawPcmStream method949(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILbu;)I"
   )
   static int method913(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field345 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILbu;)I"
   )
   static int method877(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
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

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field345 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILbu;)I"
   )
   static int method878(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field345 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILbu;)I"
   )
   static int method879(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
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

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field345 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILbu;II)I"
   )
   static int method880(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field345 = var4;
      return var5;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbu;II)I"
   )
   static int method881(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
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

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field345 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILbu;II)I"
   )
   static int method882(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
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

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field345 = var4;
      return var5;
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbu;II)I"
   )
   static int method883(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
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

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field345 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILbu;)I"
   )
   static int method884(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field342 += var9.field348 * (var6 - var3);
      var9.field343 += var9.field351 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
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

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field341 = var4 >> 2;
      var9.field345 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILbu;)I"
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

      var12.field341 += var12.field349 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
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

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field342 = var5 >> 2;
      var12.field343 = var6 >> 2;
      var12.field345 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILbu;)I"
   )
   static int method956(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field342 += var9.field348 * (var6 - var3);
      var9.field343 += var9.field351 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
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

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field341 = var4 >> 2;
      var9.field345 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILbu;)I"
   )
   static int method887(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field341 += var12.field349 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
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

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field342 = var5 >> 2;
      var12.field343 = var6 >> 2;
      var12.field345 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbu;II)I"
   )
   static int method888(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field342 -= var11.field348 * var5;
      var11.field343 -= var11.field351 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
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

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field342 += var11.field348 * var5;
      var11.field343 += var11.field351 * var5;
      var11.field341 = var6;
      var11.field345 = var4;
      return var5;
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILbu;II)I"
   )
   static int method871(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field341 -= var5 * var13.field349;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
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

      for(var1 = var15; var5 < var10; var4 += var14) {
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
      var13.field341 += var13.field349 * var5;
      var13.field342 = var6;
      var13.field343 = var7;
      var13.field345 = var4;
      return var5;
   }

   @ObfuscatedName("cy")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbu;II)I"
   )
   static int method890(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field342 -= var11.field348 * var5;
      var11.field343 -= var11.field351 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
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

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field342 += var11.field348 * var5;
      var11.field343 += var11.field351 * var5;
      var11.field341 = var6;
      var11.field345 = var4;
      return var5;
   }

   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILbu;II)I"
   )
   static int method891(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field341 -= var5 * var13.field349;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
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

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field341 += var13.field349 * var5;
      var13.field342 = var6;
      var13.field343 = var7;
      var13.field345 = var4;
      return var5;
   }
}
