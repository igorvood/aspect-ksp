package ru.vood.processor.datamodel.packageForDataModelConfigProcessorProviderTest.create;

/**
* @see ru.vood.processor.datamodel.DataModelConfigProcessorProviderTest.create 
*/
import ru.vood.dmgen.annotation.*

@Comment("Это сущность Сделка")
@FlowEntity(FlowEntityType.AGGREGATE)
interface Deal {
    @Pk
    @Comment("Это ее идентификатор")
    val id: Int
}