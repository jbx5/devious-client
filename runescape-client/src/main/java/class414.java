import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
public abstract class class414 implements class258 {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lqi;"
   )
   class453 field4598;

   class414(int var1) {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;IB)V",
      garbageValue = "-92"
   )
   abstract void vmethod7769(Buffer var1, int var2);

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "2126471829"
   )
   public void method7768(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if (var2 == 0) {
            return;
         }

         class410[] var3 = new class410[]{class410.field4587, class410.field4586, class410.field4588, class410.field4585};
         class410 var4 = (class410)WallDecoration.findEnumerated(var3, var2);
         if (var4 != null) {
            switch (var4.field4584) {
               case 0:
                  class323[] var5 = new class323[]{class323.field4089, class323.field4090, class323.field4092, class323.field4088};
                  WallDecoration.findEnumerated(var5, var1.readUnsignedByte());
                  break;
               case 1:
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
               case 2:
                  var1.readStringCp1252NullCircumfixed();
                  break;
               case 3:
                  int var6 = var1.readUnsignedByte();
                  this.field4598 = class230.method4679(var6);
                  if (this.field4598 == null) {
                     throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var6);
                  }
            }
         } else {
            this.vmethod7769(var1, var2);
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1316056571"
   )
   boolean method7770() {
      return this.field4598 != null;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/Object;",
      garbageValue = "-1027664488"
   )
   Object method7771() {
      if (this.field4598 == class453.field4834) {
         return 0;
      } else if (this.field4598 == class453.field4828) {
         return -1L;
      } else {
         return this.field4598 == class453.field4836 ? "" : null;
      }
   }
}
