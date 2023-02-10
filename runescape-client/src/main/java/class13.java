import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("m")
class class13 extends DefaultTlsClient {
   @ObfuscatedName("eu")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   static Archive field70;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lb;"
   )
   final class12 this$1;

   @ObfuscatedSignature(
      descriptor = "(Lb;)V"
   )
   class13(class12 var1) {
      this.this$1 = var1;
   }

   public TlsAuthentication getAuthentication() throws IOException {
      return new class11(this);
   }

   public Hashtable getClientExtensions() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (var1 == null) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(var2.length + 3);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(0, var3.toByteArray());
      return var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)[Llo;",
      garbageValue = "1319883394"
   )
   public static class330[] method179() {
      return new class330[]{class330.field4164, class330.field4167, class330.field4162, class330.field4163};
   }
}
