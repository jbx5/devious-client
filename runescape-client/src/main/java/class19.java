import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
public class class19 {
   @ObfuscatedName("vb")
   @Export("foundItemIds")
   static short[] foundItemIds;
   @ObfuscatedName("hi")
   @ObfuscatedSignature(
      descriptor = "Lfl;"
   )
   @Export("socketTask")
   static Task socketTask;
   @ObfuscatedName("h")
   Future field112;
   @ObfuscatedName("e")
   String field109;

   class19(Future var1) {
      this.field112 = var1;
   }

   class19(String var1) {
      this.method274(var1);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1964970587"
   )
   void method274(String var1) {
      if (var1 == null) {
         var1 = "";
      }

      this.field109 = var1;
      if (this.field112 != null) {
         this.field112.cancel(true);
         this.field112 = null;
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/lang/String;",
      garbageValue = "16"
   )
   public final String method275() {
      return this.field109;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "3"
   )
   public boolean method281() {
      return this.field109 != null || this.field112 == null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "2"
   )
   public final boolean method279() {
      return this.method281() ? true : this.field112.isDone();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(S)Lp;",
      garbageValue = "-13054"
   )
   public final class21 method286() {
      if (this.method281()) {
         return new class21(this.field109);
      } else if (!this.method279()) {
         return null;
      } else {
         try {
            return (class21)this.field112.get();
         } catch (Exception var3) {
            String var2 = "Error retrieving REST request reply";
            System.err.println(var2 + "\r\n" + var3);
            this.method274(var2);
            return new class21(var2);
         }
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lqx;IB)V",
      garbageValue = "0"
   )
   @Export("updatePlayers")
   static final void updatePlayers(PacketBuffer var0, int var1) {
      int var2 = var0.offset;
      Players.Players_pendingUpdateCount = 0;
      FriendSystem.method1860(var0);
      class300.method5841(var0);
      if (var0.offset - var2 != var1) {
         throw new RuntimeException(var0.offset - var2 + " " + var1);
      }
   }
}
