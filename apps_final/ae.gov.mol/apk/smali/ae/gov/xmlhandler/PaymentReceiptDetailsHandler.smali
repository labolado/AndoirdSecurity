.class public Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;
.super Lorg/xml/sax/helpers/DefaultHandler;
.source "PaymentReceiptDetailsHandler.java"


# instance fields
.field currentElement:Ljava/lang/Boolean;

.field currentValue:Ljava/lang/String;

.field private mArrayList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lae/gov/mol/vo/PaymentReceiptDetailsVo;",
            ">;"
        }
    .end annotation
.end field

.field mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mArrayList:Ljava/util/ArrayList;

    .line 19
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentElement:Ljava/lang/Boolean;

    .line 20
    const-string v0, ""

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    .line 15
    return-void
.end method


# virtual methods
.method public characters([CII)V
    .locals 2
    .param p1, "ch"    # [C
    .param p2, "start"    # I
    .param p3, "length"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentElement:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    .line 101
    :cond_0
    return-void
.end method

.method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "localName"    # Ljava/lang/String;
    .param p3, "qName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 57
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentElement:Ljava/lang/Boolean;

    .line 59
    const-string v0, "ReceiptNumber"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setReceiptNumber(Ljava/lang/String;)V

    .line 91
    :cond_0
    :goto_0
    return-void

    .line 61
    :cond_1
    const-string v0, "ReceiptDate"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setReceiptDate(Ljava/lang/String;)V

    goto :goto_0

    .line 63
    :cond_2
    const-string v0, "ReceiptDate"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 64
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setReceiptDate(Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_3
    const-string v0, "PayCardNumber"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 66
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setPayCardNumber(Ljava/lang/String;)V

    goto :goto_0

    .line 67
    :cond_4
    const-string v0, "Total"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 68
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setTotal(Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_5
    const-string v0, "PersonCode"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 70
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setPersonCode(Ljava/lang/String;)V

    goto :goto_0

    .line 71
    :cond_6
    const-string v0, "PersonNameEnglish"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 72
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setPersonNameEnglish(Ljava/lang/String;)V

    goto :goto_0

    .line 73
    :cond_7
    const-string v0, "PersonNameArabic"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 74
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setPersonNameArabic(Ljava/lang/String;)V

    goto :goto_0

    .line 75
    :cond_8
    const-string v0, "CompanyCode"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 76
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setCompanyCode(Ljava/lang/String;)V

    goto :goto_0

    .line 77
    :cond_9
    const-string v0, "CompanyNameEnglish"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 78
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setCompanyNameEnglish(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 79
    :cond_a
    const-string v0, "CompanyNameArabic"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 80
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setCompanyNameArabic(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 81
    :cond_b
    const-string v0, "CardNumber"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 82
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setCardNumber(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 83
    :cond_c
    const-string v0, "CardExpiryDate"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 84
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setCardExpiryDate(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 85
    :cond_d
    const-string v0, "TransactionNumber"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 86
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;->setTransactionNumber(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 88
    :cond_e
    const-string v0, "ReceiptDetails"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mArrayList:Ljava/util/ArrayList;

    iget-object v1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public getmArrayList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lae/gov/mol/vo/PaymentReceiptDetailsVo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 45
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mArrayList:Ljava/util/ArrayList;

    return-object v0
.end method

.method public getmPaymentReceiptDetailsVo()Lae/gov/mol/vo/PaymentReceiptDetailsVo;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    return-object v0
.end method

.method public setmArrayList(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lae/gov/mol/vo/PaymentReceiptDetailsVo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 49
    .local p1, "mArrayList":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lae/gov/mol/vo/PaymentReceiptDetailsVo;>;"
    iput-object p1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mArrayList:Ljava/util/ArrayList;

    .line 50
    return-void
.end method

.method public setmPaymentReceiptDetailsVo(Lae/gov/mol/vo/PaymentReceiptDetailsVo;)V
    .locals 0
    .param p1, "mPaymentReceiptDetailsVo"    # Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    .prologue
    .line 41
    iput-object p1, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    .line 42
    return-void
.end method

.method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 1
    .param p1, "uri"    # Ljava/lang/String;
    .param p2, "localName"    # Ljava/lang/String;
    .param p3, "qName"    # Ljava/lang/String;
    .param p4, "attributes"    # Lorg/xml/sax/Attributes;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/xml/sax/SAXException;
        }
    .end annotation

    .prologue
    .line 28
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentElement:Ljava/lang/Boolean;

    .line 29
    const-string v0, ""

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->currentValue:Ljava/lang/String;

    .line 30
    const-string v0, "ReceiptDetails"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    new-instance v0, Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    invoke-direct {v0}, Lae/gov/mol/vo/PaymentReceiptDetailsVo;-><init>()V

    iput-object v0, p0, Lae/gov/xmlhandler/PaymentReceiptDetailsHandler;->mPaymentReceiptDetailsVo:Lae/gov/mol/vo/PaymentReceiptDetailsVo;

    .line 33
    :cond_0
    return-void
.end method