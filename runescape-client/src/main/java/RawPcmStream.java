import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
   @ObfuscatedName("aj")
   int field336;
   @ObfuscatedName("al")
   int field344;
   @ObfuscatedName("ac")
   int field335;
   @ObfuscatedName("ab")
   int field333;
   @ObfuscatedName("an")
   int field334;
   @ObfuscatedName("ao")
   int field338;
   @ObfuscatedName("av")
   int field339;
   @ObfuscatedName("aq")
   @Export("numLoops")
   int numLoops;
   @ObfuscatedName("ap")
   @Export("start")
   int start;
   @ObfuscatedName("ar")
   @Export("end")
   int end;
   @ObfuscatedName("ak")
   boolean field337;
   @ObfuscatedName("ax")
   int field347;
   @ObfuscatedName("as")
   int field345;
   @ObfuscatedName("ay")
   int field346;
   @ObfuscatedName("am")
   int field340;

   @ObfuscatedSignature(
      descriptor = "(Lbe;III)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3, int var4) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field337 = var1.field269;
      this.field344 = var2;
      this.field335 = var3;
      this.field333 = var4;
      this.field336 = 0;
      this.method867();
   }

   @ObfuscatedSignature(
      descriptor = "(Lbe;II)V"
   )
   RawPcmStream(RawSound var1, int var2, int var3) {
      super.sound = var1;
      this.start = var1.start;
      this.end = var1.end;
      this.field337 = var1.field269;
      this.field344 = var2;
      this.field335 = var3;
      this.field333 = 8192;
      this.field336 = 0;
      this.method867();
   }

   @ObfuscatedName("an")
   void method867() {
      this.field334 = this.field335;
      this.field338 = method963(this.field335, this.field333);
      this.field339 = method862(this.field335, this.field333);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("firstSubStream")
   protected PcmStream firstSubStream() {
      return null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "()Lbj;"
   )
   @Export("nextSubStream")
   protected PcmStream nextSubStream() {
      return null;
   }

   @ObfuscatedName("aq")
   protected int vmethod5700() {
      return this.field335 == 0 && this.field347 == 0 ? 0 : 1;
   }

   @ObfuscatedName("ap")
   @Export("fill")
   public synchronized void fill(int[] var1, int var2, int var3) {
      if (this.field335 == 0 && this.field347 == 0) {
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
         if (this.field336 < 0) {
            if (this.field344 <= 0) {
               this.method980();
               this.remove();
               return;
            }

            this.field336 = 0;
         }

         if (this.field336 >= var7) {
            if (this.field344 >= 0) {
               this.method980();
               this.remove();
               return;
            }

            this.field336 = var7 - 1;
         }

         if (this.numLoops < 0) {
            if (this.field337) {
               if (this.field344 < 0) {
                  var9 = this.method890(var1, var2, var5, var3, var4.samples[this.start]);
                  if (this.field336 >= var5) {
                     return;
                  }

                  this.field336 = var5 + var5 - 1 - this.field336;
                  this.field344 = -this.field344;
               }

               while(true) {
                  var9 = this.method896(var1, var9, var6, var3, var4.samples[this.end - 1]);
                  if (this.field336 < var6) {
                     return;
                  }

                  this.field336 = var6 + var6 - 1 - this.field336;
                  this.field344 = -this.field344;
                  var9 = this.method890(var1, var9, var5, var3, var4.samples[this.start]);
                  if (this.field336 >= var5) {
                     return;
                  }

                  this.field336 = var5 + var5 - 1 - this.field336;
                  this.field344 = -this.field344;
               }
            } else if (this.field344 < 0) {
               while(true) {
                  var9 = this.method890(var1, var9, var5, var3, var4.samples[this.end - 1]);
                  if (this.field336 >= var5) {
                     return;
                  }

                  this.field336 = var6 - 1 - (var6 - 1 - this.field336) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method896(var1, var9, var6, var3, var4.samples[this.start]);
                  if (this.field336 < var6) {
                     return;
                  }

                  this.field336 = var5 + (this.field336 - var5) % var8;
               }
            }
         } else {
            if (this.numLoops > 0) {
               if (this.field337) {
                  label127: {
                     if (this.field344 < 0) {
                        var9 = this.method890(var1, var2, var5, var3, var4.samples[this.start]);
                        if (this.field336 >= var5) {
                           return;
                        }

                        this.field336 = var5 + var5 - 1 - this.field336;
                        this.field344 = -this.field344;
                        if (--this.numLoops == 0) {
                           break label127;
                        }
                     }

                     do {
                        var9 = this.method896(var1, var9, var6, var3, var4.samples[this.end - 1]);
                        if (this.field336 < var6) {
                           return;
                        }

                        this.field336 = var6 + var6 - 1 - this.field336;
                        this.field344 = -this.field344;
                        if (--this.numLoops == 0) {
                           break;
                        }

                        var9 = this.method890(var1, var9, var5, var3, var4.samples[this.start]);
                        if (this.field336 >= var5) {
                           return;
                        }

                        this.field336 = var5 + var5 - 1 - this.field336;
                        this.field344 = -this.field344;
                     } while(--this.numLoops != 0);
                  }
               } else {
                  int var10;
                  if (this.field344 < 0) {
                     while(true) {
                        var9 = this.method890(var1, var9, var5, var3, var4.samples[this.end - 1]);
                        if (this.field336 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field336) / var8;
                        if (var10 >= this.numLoops) {
                           this.field336 += var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field336 += var8 * var10;
                        this.numLoops -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method896(var1, var9, var6, var3, var4.samples[this.start]);
                        if (this.field336 < var6) {
                           return;
                        }

                        var10 = (this.field336 - var5) / var8;
                        if (var10 >= this.numLoops) {
                           this.field336 -= var8 * this.numLoops;
                           this.numLoops = 0;
                           break;
                        }

                        this.field336 -= var8 * var10;
                        this.numLoops -= var10;
                     }
                  }
               }
            }

            if (this.field344 < 0) {
               this.method890(var1, var9, 0, var3, 0);
               if (this.field336 < 0) {
                  this.field336 = -1;
                  this.method980();
                  this.remove();
               }
            } else {
               this.method896(var1, var9, var7, var3, 0);
               if (this.field336 >= var7) {
                  this.field336 = var7;
                  this.method980();
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

   @ObfuscatedName("ak")
   @Export("skip")
   public synchronized void skip(int var1) {
      if (this.field347 > 0) {
         if (var1 >= this.field347) {
            if (this.field335 == Integer.MIN_VALUE) {
               this.field335 = 0;
               this.field339 = 0;
               this.field338 = 0;
               this.field334 = 0;
               this.remove();
               var1 = this.field347;
            }

            this.field347 = 0;
            this.method867();
         } else {
            this.field334 += this.field345 * var1;
            this.field338 += this.field346 * var1;
            this.field339 += this.field340 * var1;
            this.field347 -= var1;
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

      if (this.field336 < 0) {
         if (this.field344 <= 0) {
            this.method980();
            this.remove();
            return;
         }

         this.field336 = 0;
      }

      if (this.field336 >= var5) {
         if (this.field344 >= 0) {
            this.method980();
            this.remove();
            return;
         }

         this.field336 = var5 - 1;
      }

      this.field336 += this.field344 * var1;
      if (this.numLoops < 0) {
         if (!this.field337) {
            if (this.field344 < 0) {
               if (this.field336 >= var3) {
                  return;
               }

               this.field336 = var4 - 1 - (var4 - 1 - this.field336) % var6;
            } else {
               if (this.field336 < var4) {
                  return;
               }

               this.field336 = var3 + (this.field336 - var3) % var6;
            }

         } else {
            if (this.field344 < 0) {
               if (this.field336 >= var3) {
                  return;
               }

               this.field336 = var3 + var3 - 1 - this.field336;
               this.field344 = -this.field344;
            }

            while(this.field336 >= var4) {
               this.field336 = var4 + var4 - 1 - this.field336;
               this.field344 = -this.field344;
               if (this.field336 >= var3) {
                  return;
               }

               this.field336 = var3 + var3 - 1 - this.field336;
               this.field344 = -this.field344;
            }

         }
      } else {
         if (this.numLoops > 0) {
            if (this.field337) {
               label129: {
                  if (this.field344 < 0) {
                     if (this.field336 >= var3) {
                        return;
                     }

                     this.field336 = var3 + var3 - 1 - this.field336;
                     this.field344 = -this.field344;
                     if (--this.numLoops == 0) {
                        break label129;
                     }
                  }

                  do {
                     if (this.field336 < var4) {
                        return;
                     }

                     this.field336 = var4 + var4 - 1 - this.field336;
                     this.field344 = -this.field344;
                     if (--this.numLoops == 0) {
                        break;
                     }

                     if (this.field336 >= var3) {
                        return;
                     }

                     this.field336 = var3 + var3 - 1 - this.field336;
                     this.field344 = -this.field344;
                  } while(--this.numLoops != 0);
               }
            } else {
               label161: {
                  int var7;
                  if (this.field344 < 0) {
                     if (this.field336 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field336) / var6;
                     if (var7 >= this.numLoops) {
                        this.field336 += var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field336 += var6 * var7;
                     this.numLoops -= var7;
                  } else {
                     if (this.field336 < var4) {
                        return;
                     }

                     var7 = (this.field336 - var3) / var6;
                     if (var7 >= this.numLoops) {
                        this.field336 -= var6 * this.numLoops;
                        this.numLoops = 0;
                        break label161;
                     }

                     this.field336 -= var6 * var7;
                     this.numLoops -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field344 < 0) {
            if (this.field336 < 0) {
               this.field336 = -1;
               this.method980();
               this.remove();
            }
         } else if (this.field336 >= var5) {
            this.field336 = var5;
            this.method980();
            this.remove();
         }

      }
   }

   @ObfuscatedName("ax")
   public synchronized void method999(int var1) {
      this.method871(var1 << 6, this.method928());
   }

   @ObfuscatedName("as")
   synchronized void method919(int var1) {
      this.method871(var1, this.method928());
   }

   @ObfuscatedName("ay")
   synchronized void method871(int var1, int var2) {
      this.field335 = var1;
      this.field333 = var2;
      this.field347 = 0;
      this.method867();
   }

   @ObfuscatedName("am")
   public synchronized int method872() {
      return this.field335 == Integer.MIN_VALUE ? 0 : this.field335;
   }

   @ObfuscatedName("az")
   public synchronized int method928() {
      return this.field333 < 0 ? -1 : this.field333;
   }

   @ObfuscatedName("ae")
   public synchronized void method964(int var1) {
      int var2 = ((RawSound)super.sound).samples.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field336 = var1;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Z)V",
      garbageValue = "1"
   )
   public synchronized void method875() {
      this.field344 = (this.field344 ^ this.field344 >> 31) + (this.field344 >>> 31);
      this.field344 = -this.field344;
   }

   @ObfuscatedName("ag")
   void method980() {
      if (this.field347 != 0) {
         if (this.field335 == Integer.MIN_VALUE) {
            this.field335 = 0;
         }

         this.field347 = 0;
         this.method867();
      }

   }

   @ObfuscatedName("at")
   public synchronized void method877(int var1, int var2) {
      this.method878(var1, var2, this.method928());
   }

   @ObfuscatedName("af")
   public synchronized void method878(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method871(var2, var3);
      } else {
         int var4 = method963(var2, var3);
         int var5 = method862(var2, var3);
         if (var4 == this.field338 && var5 == this.field339) {
            this.field347 = 0;
         } else {
            int var6 = var2 - this.field334;
            if (this.field334 - var2 > var6) {
               var6 = this.field334 - var2;
            }

            if (var4 - this.field338 > var6) {
               var6 = var4 - this.field338;
            }

            if (this.field338 - var4 > var6) {
               var6 = this.field338 - var4;
            }

            if (var5 - this.field339 > var6) {
               var6 = var5 - this.field339;
            }

            if (this.field339 - var5 > var6) {
               var6 = this.field339 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field347 = var1;
            this.field335 = var2;
            this.field333 = var3;
            this.field345 = (var2 - this.field334) / var1;
            this.field346 = (var4 - this.field338) / var1;
            this.field340 = (var5 - this.field339) / var1;
         }
      }
   }

   @ObfuscatedName("ai")
   public synchronized void method879(int var1) {
      if (var1 == 0) {
         this.method919(0);
         this.remove();
      } else if (this.field338 == 0 && this.field339 == 0) {
         this.field347 = 0;
         this.field335 = 0;
         this.field334 = 0;
         this.remove();
      } else {
         int var2 = -this.field334;
         if (this.field334 > var2) {
            var2 = this.field334;
         }

         if (-this.field338 > var2) {
            var2 = -this.field338;
         }

         if (this.field338 > var2) {
            var2 = this.field338;
         }

         if (-this.field339 > var2) {
            var2 = -this.field339;
         }

         if (this.field339 > var2) {
            var2 = this.field339;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field347 = var1;
         this.field335 = Integer.MIN_VALUE;
         this.field345 = -this.field334 / var1;
         this.field346 = -this.field338 / var1;
         this.field340 = -this.field339 / var1;
      }
   }

   @ObfuscatedName("aw")
   public synchronized void method880(int var1) {
      if (this.field344 < 0) {
         this.field344 = -var1;
      } else {
         this.field344 = var1;
      }

   }

   @ObfuscatedName("aa")
   public synchronized int method881() {
      return this.field344 < 0 ? -this.field344 : this.field344;
   }

   @ObfuscatedName("ah")
   public boolean method923() {
      return this.field336 < 0 || this.field336 >= ((RawSound)super.sound).samples.length << 8;
   }

   @ObfuscatedName("bz")
   public boolean method1018() {
      return this.field347 != 0;
   }

   @ObfuscatedName("bq")
   int method896(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field347 > 0) {
            int var6 = var2 + this.field347;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field347 += var2;
            if (this.field344 == 256 && (this.field336 & 255) == 0) {
               if (ChatChannel.PcmPlayer_stereo) {
                  var2 = method901(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this);
               } else {
                  var2 = method900(((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, this.field345, 0, var6, var3, this);
               }
            } else if (ChatChannel.PcmPlayer_stereo) {
               var2 = method905(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this, this.field344, var5);
            } else {
               var2 = method904(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, this.field345, 0, var6, var3, this, this.field344, var5);
            }

            this.field347 -= var2;
            if (this.field347 != 0) {
               return var2;
            }

            if (!this.method891()) {
               continue;
            }

            return var4;
         }

         if (this.field344 == 256 && (this.field336 & 255) == 0) {
            if (ChatChannel.PcmPlayer_stereo) {
               return method945(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, 0, var4, var3, this);
            }

            return method892(((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, 0, var4, var3, this);
         }

         if (ChatChannel.PcmPlayer_stereo) {
            return method987(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, 0, var4, var3, this, this.field344, var5);
         }

         return method864(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, 0, var4, var3, this, this.field344, var5);
      }
   }

   @ObfuscatedName("bc")
   int method890(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field347 > 0) {
            int var6 = var2 + this.field347;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field347 += var2;
            if (this.field344 == -256 && (this.field336 & 255) == 0) {
               if (ChatChannel.PcmPlayer_stereo) {
                  var2 = method903(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this);
               } else {
                  var2 = method902(((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, this.field345, 0, var6, var3, this);
               }
            } else if (ChatChannel.PcmPlayer_stereo) {
               var2 = method907(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, this.field346, this.field340, 0, var6, var3, this, this.field344, var5);
            } else {
               var2 = method876(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, this.field345, 0, var6, var3, this, this.field344, var5);
            }

            this.field347 -= var2;
            if (this.field347 != 0) {
               return var2;
            }

            if (!this.method891()) {
               continue;
            }

            return var4;
         }

         if (this.field344 == -256 && (this.field336 & 255) == 0) {
            if (ChatChannel.PcmPlayer_stereo) {
               return method970(0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, 0, var4, var3, this);
            }

            return method992(((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, 0, var4, var3, this);
         }

         if (ChatChannel.PcmPlayer_stereo) {
            return method899(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field338, this.field339, 0, var4, var3, this, this.field344, var5);
         }

         return method898(0, 0, ((RawSound)super.sound).samples, var1, this.field336, var2, this.field334, 0, var4, var3, this, this.field344, var5);
      }
   }

   @ObfuscatedName("bu")
   boolean method891() {
      int var1 = this.field335;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method963(var1, this.field333);
         var3 = method862(var1, this.field333);
      }

      if (var1 == this.field334 && var2 == this.field338 && var3 == this.field339) {
         if (this.field335 == Integer.MIN_VALUE) {
            this.field335 = 0;
            this.field339 = 0;
            this.field338 = 0;
            this.field334 = 0;
            this.remove();
            return true;
         } else {
            this.method867();
            return false;
         }
      } else {
         if (this.field334 < var1) {
            this.field345 = 1;
            this.field347 = var1 - this.field334;
         } else if (this.field334 > var1) {
            this.field345 = -1;
            this.field347 = this.field334 - var1;
         } else {
            this.field345 = 0;
         }

         if (this.field338 < var2) {
            this.field346 = 1;
            if (this.field347 == 0 || this.field347 > var2 - this.field338) {
               this.field347 = var2 - this.field338;
            }
         } else if (this.field338 > var2) {
            this.field346 = -1;
            if (this.field347 == 0 || this.field347 > this.field338 - var2) {
               this.field347 = this.field338 - var2;
            }
         } else {
            this.field346 = 0;
         }

         if (this.field339 < var3) {
            this.field340 = 1;
            if (this.field347 == 0 || this.field347 > var3 - this.field339) {
               this.field347 = var3 - this.field339;
            }
         } else if (this.field339 > var3) {
            this.field340 = -1;
            if (this.field347 == 0 || this.field347 > this.field339 - var3) {
               this.field347 = this.field339 - var3;
            }
         } else {
            this.field340 = 0;
         }

         return false;
      }
   }

   @ObfuscatedName("by")
   int vmethod1024() {
      int var1 = this.field334 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.numLoops == 0) {
         var1 -= var1 * this.field336 / (((RawSound)super.sound).samples.length << 8);
      } else if (this.numLoops >= 0) {
         var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   @ObfuscatedName("aj")
   static int method963(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("al")
   static int method862(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lbe;II)Lbn;"
   )
   @Export("createRawPcmStream")
   public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(PcmPlayer.field292 * 100)), var2 << 6) : null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lbe;III)Lbn;"
   )
   public static RawPcmStream method866(RawSound var0, int var1, int var2, int var3) {
      return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILbn;)I"
   )
   static int method892(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

      var8.field336 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILbn;)I"
   )
   static int method945(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

      var10.field336 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIILbn;)I"
   )
   static int method992(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
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

      var8.field336 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIILbn;)I"
   )
   static int method970(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
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

      var10.field336 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILbn;II)I"
   )
   static int method864(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

      var10.field336 = var4;
      return var5;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbn;II)I"
   )
   static int method987(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

      var11.field336 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIILbn;II)I"
   )
   static int method898(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
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

      var10.field336 = var4;
      return var5;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbn;II)I"
   )
   static int method899(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
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

      var11.field336 = var4;
      return var5 >> 1;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILbn;)I"
   )
   static int method900(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field338 += var9.field346 * (var6 - var3);
      var9.field339 += var9.field340 * (var6 - var3);

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

      var9.field334 = var4 >> 2;
      var9.field336 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILbn;)I"
   )
   static int method901(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var11 + var4 - var3) > var10) {
         var9 = var10;
      }

      var12.field334 += var12.field345 * (var9 - var4);
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

      var12.field338 = var5 >> 2;
      var12.field339 = var6 >> 2;
      var12.field336 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "([B[IIIIIIIILbn;)I"
   )
   static int method902(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field338 += var9.field346 * (var6 - var3);
      var9.field339 += var9.field340 * (var6 - var3);

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

      var9.field334 = var4 >> 2;
      var9.field336 = var2 << 8;
      return var3;
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(I[B[IIIIIIIIIILbn;)I"
   )
   static int method903(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field334 += var12.field345 * (var9 - var4);
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

      var12.field338 = var5 >> 2;
      var12.field339 = var6 >> 2;
      var12.field336 = var3 << 8;
      return var4 >> 1;
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbn;II)I"
   )
   static int method904(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field338 -= var11.field346 * var5;
      var11.field339 -= var11.field340 * var5;
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

      var11.field338 += var11.field346 * var5;
      var11.field339 += var11.field340 * var5;
      var11.field334 = var6;
      var11.field336 = var4;
      return var5;
   }

   @ObfuscatedName("cj")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILbn;II)I"
   )
   static int method905(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field334 -= var5 * var13.field345;
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
      var13.field334 += var13.field345 * var5;
      var13.field338 = var6;
      var13.field339 = var7;
      var13.field336 = var4;
      return var5;
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIILbn;II)I"
   )
   static int method876(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
      var11.field338 -= var11.field346 * var5;
      var11.field339 -= var11.field340 * var5;
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

      var11.field338 += var11.field346 * var5;
      var11.field339 += var11.field340 * var5;
      var11.field334 = var6;
      var11.field336 = var4;
      return var5;
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(II[B[IIIIIIIIIILbn;II)I"
   )
   static int method907(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
      var13.field334 -= var5 * var13.field345;
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
      var13.field334 += var13.field345 * var5;
      var13.field338 = var6;
      var13.field339 = var7;
      var13.field336 = var4;
      return var5;
   }
}
