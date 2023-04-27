import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public final class class399 implements Comparable {
   @ObfuscatedName("wm")
   @Export("foundItemIds")
   static short[] foundItemIds;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lgv;"
   )
   @Export("clock")
   static Clock clock;
   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   @Export("archive6")
   static Archive archive6;
   @ObfuscatedName("af")
   Object field4542;
   @ObfuscatedName("an")
   Object field4543;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      longValue = 3457501928509627443L
   )
   long field4544;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      longValue = -8679189461794727135L
   )
   long field4545;

   class399(Object var1, Object var2) {
      this.field4542 = var1;
      this.field4543 = var2;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lpj;I)I",
      garbageValue = "-331222916"
   )
   int method7721(class399 var1) {
      if (this.field4545 < var1.field4545) {
         return -1;
      } else {
         return this.field4545 > var1.field4545 ? 1 : 0;
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class399) {
         return this.field4543.equals(((class399)var1).field4543);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      return this.field4543.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method7721((class399)var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)Ltf;",
      garbageValue = "-108064052"
   )
   public static PrivateChatMode method7732(int var0) {
      PrivateChatMode[] var1 = new PrivateChatMode[]{PrivateChatMode.field5130, PrivateChatMode.field5129, PrivateChatMode.field5128};
      PrivateChatMode[] var2 = var1;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         PrivateChatMode var4 = var2[var3];
         if (var0 == var4.field5131) {
            return var4;
         }
      }

      return null;
   }
}
