import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class463 implements MouseWheel {
   @ObfuscatedName("sy")
   @ObfuscatedSignature(
      descriptor = "Lon;"
   )
   @Export("friendsChat")
   static FriendsChat friendsChat;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   public static final class463 field4897 = new class463(2, 0, Integer.class, new class460());
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   public static final class463 field4898 = new class463(0, 1, Long.class, new class462());
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lqn;"
   )
   public static final class463 field4903 = new class463(1, 2, String.class, new class464());
   @ObfuscatedName("b")
   @Export("Tiles_hueMultiplier")
   static int[] Tiles_hueMultiplier;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 401669209
   )
   public final int field4899;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -674178869
   )
   public final int field4896;
   @ObfuscatedName("j")
   public final Class field4901;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lqk;"
   )
   public final class459 field4900;

   @ObfuscatedSignature(
      descriptor = "(IILjava/lang/Class;Lqk;)V"
   )
   class463(int var1, int var2, Class var3, class459 var4) {
      this.field4899 = var1;
      this.field4896 = var2;
      this.field4901 = var3;
      this.field4900 = var4;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "3"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field4896;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)Ljava/lang/Object;",
      garbageValue = "-648341479"
   )
   public Object method8507(Buffer var1) {
      return this.field4900.vmethod8517(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IS)Lgp;",
      garbageValue = "12707"
   )
   @Export("getObjectDefinition")
   public static ObjectComposition getObjectDefinition(int var0) {
      ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
         var1 = new ObjectComposition();
         var1.id = var0;
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         if (var1.isSolid) {
            var1.interactType = 0;
            var1.boolean1 = false;
         }

         ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(S)[Lqn;",
      garbageValue = "-13650"
   )
   public static class463[] method8503() {
      return new class463[]{field4903, field4897, field4898};
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Class;B)Lqn;",
      garbageValue = "70"
   )
   public static class463 method8511(Class var0) {
      class463[] var1 = method8503();

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class463 var3 = var1[var2];
         if (var3.field4901 == var0) {
            return var3;
         }
      }

      return null;
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1891218900"
   )
   static final int method8510() {
      float var0 = 200.0F * ((float)PacketWriter.clientPreferences.method2557() - 0.5F);
      return 100 - Math.round(var0);
   }
}
