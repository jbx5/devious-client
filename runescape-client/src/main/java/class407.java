import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class407 {
   @ObfuscatedName("as")
   final Map field4541 = new HashMap();
   @ObfuscatedName("ax")
   final Map field4540 = new HashMap();
   @ObfuscatedName("ap")
   final DecimalFormat field4539 = new DecimalFormat();

   public class407() {
      this.field4539.setMaximumFractionDigits(2);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
      garbageValue = "-2039102239"
   )
   public void method7640(HttpsURLConnection var1) {
      Iterator var2 = this.field4541.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var3 = (Map.Entry)var2.next();
         var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/Map;",
      garbageValue = "2005775152"
   )
   public Map method7641() {
      return this.field4541;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "755189204"
   )
   public void method7642(String var1, String var2) {
      if (var1 != null && !var1.isEmpty()) {
         this.field4541.put(var1, var2 != null ? var2 : "");
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1921423246"
   )
   public void method7643(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.field4541.remove(var1);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(Lpt;Ljava/lang/String;B)V",
      garbageValue = "-48"
   )
   void method7644(class406 var1, String var2) {
      String var3 = String.format("%s %s", var1.method7635(), var2);
      this.method7642("Authorization", var3);
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1629749961"
   )
   public void method7678(String var1) {
      this.method7644(class406.field4536, var1);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;B)V",
      garbageValue = "-35"
   )
   public void method7646(String var1) {
      this.method7644(class406.field4535, var1);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lro;I)V",
      garbageValue = "-1402490176"
   )
   public void method7647(class448 var1) {
      this.field4541.put("Content-Type", var1.method8223());
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-67"
   )
   public void method7645() {
      this.field4541.remove("Content-Type");
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lro;I)V",
      garbageValue = "-1014036136"
   )
   public void method7649(class448 var1) {
      this.method7667(var1, 1.0F);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lro;FB)V",
      garbageValue = "49"
   )
   void method7667(class448 var1, float var2) {
      this.field4540.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
      this.method7651();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-24"
   )
   void method7651() {
      this.field4541.remove("Accept");
      if (!this.field4540.isEmpty()) {
         this.field4541.put("Accept", this.method7666());
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-877459928"
   )
   String method7666() {
      ArrayList var1 = new ArrayList(this.field4540.entrySet());
      Collections.sort(var1, new class408(this));
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Map.Entry var4 = (Map.Entry)var3.next();
         if (var2.length() > 0) {
            var2.append(",");
         }

         var2.append(((class448)var4.getKey()).method8223());
         float var5 = (Float)var4.getValue();
         if (var5 < 1.0F) {
            String var6 = this.field4539.format((double)var5);
            var2.append(";q=").append(var6);
         }
      }

      return var2.toString();
   }
}
