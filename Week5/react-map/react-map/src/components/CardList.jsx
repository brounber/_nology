import Card from "./../card/Card";

const CardList = ({ postList }) => {
  return (
    <>
      {postList.map((post) => {
        return (
          <Card title={post.title} textContent={post.textContent} />
        );

      })}
    </>
  )
}

export default CardList;
