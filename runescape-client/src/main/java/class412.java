import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public abstract class class412 extends class259 implements class470 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "[Lbt;"
   )
   @Export("World_worlds")
   static World[] World_worlds;

   @ObfuscatedSignature(
      descriptor = "(Llq;Lmo;I)V"
   )
   protected class412(StudioGame var1, Language var2, int var3) {
      super(var1, var2, var3);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)Loz;",
      garbageValue = "-481589875"
   )
   protected abstract class414 vmethod8207(int var1);

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2043084628"
   )
   public int method7748() {
      return super.field2969;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)Ljava/lang/Object;",
      garbageValue = "40"
   )
   public Object vmethod8697(int var1) {
      class414 var2 = this.vmethod8207(var1);
      return var2 != null && var2.method7770() ? var2.method7771() : null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)Lrj;",
      garbageValue = "1744196611"
   )
   public class471 method7747(Buffer var1) {
      int var2 = var1.readUnsignedShort();
      class414 var3 = this.vmethod8207(var2);
      class471 var4 = new class471(var2);
      Class var5 = var3.field4598.field4833;
      if (var5 == Integer.class) {
         var4.field4930 = var1.readInt();
      } else if (var5 == Long.class) {
         var4.field4930 = var1.readLong();
      } else if (var5 == String.class) {
         var4.field4930 = var1.readStringCp1252NullCircumfixed();
      } else {
         if (!class466.class.isAssignableFrom(var5)) {
            throw new IllegalStateException();
         }

         try {
            class466 var6 = (class466)var5.newInstance();
            var6.method8671(var1);
            var4.field4930 = var6;
         } catch (InstantiationException var7) {
         } catch (IllegalAccessException var8) {
         }
      }

      return var4;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqk;II)Z",
      garbageValue = "1077691495"
   )
   @Export("updateExternalPlayer")
   static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
      int var2 = var0.readBits(2);
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      int var10;
      if (var2 == 0) {
         if (var0.readBits(1) != 0) {
            updateExternalPlayer(var0, var1);
         }

         var3 = var0.readBits(13);
         var4 = var0.readBits(13);
         boolean var12 = var0.readBits(1) == 1;
         if (var12) {
            Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
         }

         if (Client.players[var1] != null) {
            throw new RuntimeException();
         } else {
            Player var11 = Client.players[var1] = new Player();
            var11.index = var1;
            if (Players.field1315[var1] != null) {
               var11.read(Players.field1315[var1]);
            }

            var11.orientation = Players.Players_orientations[var1];
            var11.targetIndex = Players.Players_targetIndices[var1];
            var7 = Players.Players_regions[var1];
            var8 = var7 >> 28;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            var11.pathTraversed[0] = Players.field1314[var1];
            var11.plane = (byte)var8;
            var11.resetPath((var9 << 13) + var3 - KeyHandler.baseX * 64, (var10 << 13) + var4 - class158.baseY * 64);
            var11.field1116 = false;
            return true;
         }
      } else if (var2 == 1) {
         var3 = var0.readBits(2);
         var4 = Players.Players_regions[var1];
         Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455);
         return false;
      } else {
         int var5;
         int var6;
         if (var2 == 2) {
            var3 = var0.readBits(5);
            var4 = var3 >> 3;
            var5 = var3 & 7;
            var6 = Players.Players_regions[var1];
            var7 = (var6 >> 28) + var4 & 3;
            var8 = var6 >> 14 & 255;
            var9 = var6 & 255;
            if (var5 == 0) {
               --var8;
               --var9;
            }

            if (var5 == 1) {
               --var9;
            }

            if (var5 == 2) {
               ++var8;
               --var9;
            }

            if (var5 == 3) {
               --var8;
            }

            if (var5 == 4) {
               ++var8;
            }

            if (var5 == 5) {
               --var8;
               ++var9;
            }

            if (var5 == 6) {
               ++var9;
            }

            if (var5 == 7) {
               ++var8;
               ++var9;
            }

            Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
            return false;
         } else {
            var3 = var0.readBits(18);
            var4 = var3 >> 16;
            var5 = var3 >> 8 & 255;
            var6 = var3 & 255;
            var7 = Players.Players_regions[var1];
            var8 = (var7 >> 28) + var4 & 3;
            var9 = var5 + (var7 >> 14) & 255;
            var10 = var6 + var7 & 255;
            Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
            return false;
         }
      }
   }
}
