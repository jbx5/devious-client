import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("TextureProvider")
public class TextureProvider implements TextureLoader {
   @ObfuscatedName("jm")
   @ObfuscatedGetter(
      intValue = -470749663
   )
   @Export("cameraX")
   static int cameraX;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "[Lgd;"
   )
   @Export("textures")
   Texture[] textures;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lme;"
   )
   @Export("deque")
   NodeDeque deque = new NodeDeque();
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 631229177
   )
   @Export("capacity")
   int capacity;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 238825365
   )
   @Export("remaining")
   int remaining = 0;
   @ObfuscatedName("h")
   @Export("brightness")
   double brightness = 1.0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1056685069
   )
   @Export("textureSize")
   int textureSize = 128;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("archive")
   AbstractArchive archive;

   @ObfuscatedSignature(
      descriptor = "(Llg;Llg;IDI)V"
   )
   public TextureProvider(AbstractArchive var1, AbstractArchive var2, int var3, double var4, int var6) {
      this.archive = var2;
      this.capacity = var3;
      this.remaining = this.capacity;
      this.brightness = var4;
      this.textureSize = var6;
      int[] var7 = var1.getGroupFileIds(0);
      int var8 = var7.length;
      this.textures = new Texture[var1.getGroupFileCount(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         Buffer var10 = new Buffer(var1.takeFile(0, var7[var9]));
         this.textures[var7[var9]] = new Texture(var10);
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1484435972"
   )
   @Export("getLoadedPercentage")
   public int getLoadedPercentage() {
      int var1 = 0;
      int var2 = 0;
      Texture[] var3 = this.textures;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         Texture var5 = var3[var4];
         if (var5 != null && var5.fileIds != null) {
            var1 += var5.fileIds.length;
            int[] var6 = var5.fileIds;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               int var8 = var6[var7];
               if (this.archive.method6348(var8)) {
                  ++var2;
               }
            }
         }
      }

      if (var1 == 0) {
         return 0;
      } else {
         return var2 * 100 / var1;
      }
   }

   @ObfuscatedName("f")
   @Export("setBrightness")
   public void setBrightness(double var1) {
      this.brightness = var1;
      this.clear();
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)[I",
      garbageValue = "-47"
   )
   @Export("getTexturePixels")
   public int[] getTexturePixels(int var1) {
      Texture var2 = this.textures[var1];
      if (var2 != null) {
         if (var2.pixels != null) {
            this.deque.addLast(var2);
            var2.isLoaded = true;
            return var2.pixels;
         }

         boolean var3 = var2.load(this.brightness, this.textureSize, this.archive);
         if (var3) {
            if (this.remaining == 0) {
               Texture var4 = (Texture)this.deque.removeFirst();
               var4.reset();
            } else {
               --this.remaining;
            }

            this.deque.addLast(var2);
            var2.isLoaded = true;
            return var2.pixels;
         }
      }

      return null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1674485627"
   )
   @Export("getAverageTextureRGB")
   public int getAverageTextureRGB(int var1) {
      return this.textures[var1] != null ? this.textures[var1].averageRGB : 0;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1297302867"
   )
   public boolean vmethod4645(int var1) {
      return this.textures[var1].field2365;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1896318118"
   )
   @Export("isLowDetail")
   public boolean isLowDetail(int var1) {
      return this.textureSize == 64;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1815187350"
   )
   @Export("clear")
   public void clear() {
      for(int var1 = 0; var1 < this.textures.length; ++var1) {
         if (this.textures[var1] != null) {
            this.textures[var1].reset();
         }
      }

      this.deque = new NodeDeque();
      this.remaining = this.capacity;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "729315189"
   )
   @Export("animate")
   public void animate(int var1) {
      for(int var2 = 0; var2 < this.textures.length; ++var2) {
         Texture var3 = this.textures[var2];
         if (var3 != null && var3.animationDirection != 0 && var3.isLoaded) {
            var3.animate(var1);
            var3.isLoaded = false;
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Lbt;",
      garbageValue = "531448753"
   )
   @Export("getNextWorldListWorld")
   static World getNextWorldListWorld() {
      return World.World_listCount < World.World_count ? class412.World_worlds[++World.World_listCount - 1] : null;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(Lfp;III)Lab;",
      garbageValue = "-1220620328"
   )
   public static final PcmPlayer method4500(TaskHandler var0, int var1, int var2) {
      if (SoundCache.field337 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            PcmPlayer var3 = class32.pcmPlayerProvider.player();
            var3.samples = new int[256 * (class157.PcmPlayer_stereo ? 2 : 1)];
            var3.field303 = var2;
            var3.init();
            var3.capacity = (var2 & -1024) + 1024;
            if (var3.capacity > 16384) {
               var3.capacity = 16384;
            }

            var3.open(var3.capacity);
            if (class281.field3276 > 0 && PcmPlayer.soundSystem == null) {
               PcmPlayer.soundSystem = new SoundSystem();
               class354.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               class354.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (PcmPlayer.soundSystem != null) {
               if (PcmPlayer.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               PcmPlayer.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }
}
