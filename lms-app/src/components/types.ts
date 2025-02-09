export type BookCardProps = {
  book: {
    id: number;
    title: string;
    author: string;
  };
};

export type Book = {
  id: number;
  title: string;
  author: string;
  copies: number;
};

export type Credentials = {
  username: string;
  password: string;
};
